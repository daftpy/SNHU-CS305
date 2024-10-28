# Project Summary for Artemis Financial

## 1. Client Overview
**Client**: Artemis Financial is a consulting company specializing in creating personalized financial plans for clients, including savings, retirement, investments, and insurance services.  

**Project Requirement**: Artemis Financial needed to enhance the security of its web application to protect sensitive client data and ensure secure communication. The main requirements were to add encryption, secure data transmission, and verify data integrity to comply with industry best practices.

## 2. Software Security Vulnerabilities
**My Approach**: I conducted a comprehensive vulnerability assessment to identify potential risks and areas for improvement. Then I refactored the code to incorporate secure coding practices, such as using RSA encryption for secure data transmission and SHA-256 for checksum verification.  

**Importance of Secure Coding**: Secure coding is essential to protect client data from unauthorized access, tampering, and data breaches. Software security adds significant value to a company’s overall reputation by ensuring data privacy, maintaining customer trust, and reducing the risk of data breaches.

## 3. Challenges and Insights from Vulnerability Assessment
**Challenges**: One of the more challenging aspects was identifying irrelevant vulnerabilities in the project dependencies and suppressing them without impacting project security.  

**Helpful Insights**: Using the OWASP Dependency Check tool was very helpful in identifying potential risks in dependencies, ensuring that the final application was secure and free of vulnerabilities.

## 4. Adding Layers of Security
**Techniques Used**: To enhance the application’s security, I added layers of encryption with RSA, enabled HTTPS for secure data transmission, and implemented SHA-256 checksums for data integrity verification.  

**Future Assessments**: In future projects, I would use tools like OWASP ZAP and Snyk for continuous vulnerability assessment and continue to rely on resources such as the [NIST Vulnerability Database](https://nvd.nist.gov/vuln).

## 5. Ensuring Functionality and Security Post-Refactoring
**Code Testing and Verification**: After refactoring, I performed functional testing to confirm that all features operated correctly and securely. I used the OWASP Dependency Check tool again to verify that no new vulnerabilities had been introduced during refactoring.

## 6. Useful Resources, Tools, and Coding Practices
**Resources & Tools**: The OWASP Dependency Check tool was instrumental in identifying vulnerabilities in dependencies. Using Java Keytool for generating and managing SSL certificates was essential for enabling HTTPS.  

**Best Practices**: Secure coding practices such as encryption (RSA), checksum verification (SHA-256), and dependency management have proven invaluable and will be beneficial in future projects.

## 7. Showcasing Skills to Future Employers
**Project Highlights**: This project demonstrates my skills in secure software development, vulnerability assessment, and adherence to industry best practices. This repository showcases:
- The implementation of RSA encryption for secure data transmission.
- The use of SHA-256 checksums to ensure data integrity.
- My approach to vulnerability assessment and dependency management using OWASP tools.

These elements highlight my ability to implement secure coding practices, evaluate and address software vulnerabilities, and deliver secure, production-ready applications.
