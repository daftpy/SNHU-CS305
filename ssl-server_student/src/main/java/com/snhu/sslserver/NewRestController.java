package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {
	
	// Route to return checksum for static data
	@GetMapping("/hash")
	public String getChecksum() {
		String data = "Hello, Alex!";
		String checksum = generateChecksum(data);
		return "<p>Original: " + data + "</p><p>Checksum: " + checksum + "</p>";
	}
	
	// Helper function to generate the checksum
	private String generateChecksum(String data) {
		// Try to hash the message using SHA-256
		try {
			MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = sha256.digest(data.getBytes());
            return byteArrayToHex(hashBytes);
            // Return error if SHA-256 is not found
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error generating checksum", e);
		}
	}
	
	// Convert byte array to hex string for easy reading
	private String byteArrayToHex(byte[] bytes) {
		Formatter formatter = new Formatter();
		// Iterate through the bytes and format
		for (byte b : bytes) {
			formatter.format("%02x", b);
		}
		// Return the string
		return formatter.toString();
	}

}