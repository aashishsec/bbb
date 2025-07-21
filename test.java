import java.util.*;

public class DLPTestData {

    public static void main(String[] args) {
        System.out.println("=== Trend Micro DLP Test with Sensitive Data ===");

        // Credit Card Numbers
        String visa = "4111 1111 1111 1111";
        String mastercard = "5500 0000 0000 0004";
        String amex = "3400 0000 0000 009";

        // SSNs
        String ssn1 = "123-45-6789";
        String ssn2 = "987-65-4321";

        // Bank Data
        String iban = "DE89 3704 0044 0532 0130 00";
        String swift = "BOFAUS3N";
        String routing = "111000025";

        // Emails and Phone
        String email = "john.doe@internal.example.com";
        String phone = "+1 (555) 123-4567";

        // API Keys & Tokens
        String awsAccessKey = "AKIAIOSFODNN7EXAMPLE";
        String awsSecretKey = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";
        String gcpServiceAccountKey = "AIzaSyD-EXAMPLEKEY-abc123";
        String githubToken = "ghp_16ExampleGitHubToken1234567890";
        String jwt = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIn0.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        String bearerToken = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.abc.def.ghi";
        String azureKey = "DefaultEndpointsProtocol=https;AccountName=teststorage;AccountKey=fakebase64key==";

        // SSH & RSA Keys
        String rsaPrivateKey = 
            "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpAIBAAKCAQEA7Q9U0rZ2EXAMPLEKEY0NXd7P\n" +
            "JvW5WjI0PpMdxMw==\n" +
            "-----END RSA PRIVATE KEY-----";

        // Passwords
        String password1 = "P@ssword123!";
        String password2 = "supersecret2024";
        String password3 = "admin:admin";

        // Base64-encoded data (fake secret)
        String base64Secret = "U2VjcmV0S2V5VmFsdWVIZXJlCg==";

        // Display to simulate leakage
        System.out.println("Visa: " + visa);
        System.out.println("Mastercard: " + mastercard);
        System.out.println("Amex: " + amex);
        System.out.println("SSN1: " + ssn1);
        System.out.println("SSN2: " + ssn2);
        System.out.println("IBAN: " + iban);
        System.out.println("SWIFT: " + swift);
        System.out.println("Routing: " + routing);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("AWS Access Key: " + awsAccessKey);
        System.out.println("AWS Secret Key: " + awsSecretKey);
        System.out.println("GCP Key: " + gcpServiceAccountKey);
        System.out.println("GitHub Token: " + githubToken);
        System.out.println("JWT: " + jwt);
        System.out.println("Bearer Token: " + bearerToken);
        System.out.println("Azure Key: " + azureKey);
        System.out.println("RSA Private Key:\n" + rsaPrivateKey);
        System.out.println("Password1: " + password1);
        System.out.println("Password2: " + password2);
        System.out.println("Password3: " + password3);
        System.out.println("Base64 Encoded Secret: " + base64Secret);

        // Embedded comment with secrets
        /*
         * -- Embedded Fake Secrets for DLP Testing --
         * AWS_ACCESS_KEY_ID = AKIAEXAMPLEFAKEKEY
         * AWS_SECRET_ACCESS_KEY = wJalrFakeSecretKey1234567890
         * PRIVATE_KEY = -----BEGIN PRIVATE KEY----- MIIBVgIBADANBgkq... -----END PRIVATE KEY-----
         * OAuth_Token = ya29.A0ARrdaM-ExampleTokenRandomFake
         */
    }
}
