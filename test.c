#include <stdio.h>

int main() {
    printf("=== Trend Micro DLP Test in C ===\n");

    // Simulated sensitive data
    printf("Visa: 4111 1111 1111 1111\n");
    printf("SSN: 123-45-6789\n");
    printf("AWS Access Key: AKIAIOSFODNN7EXAMPLE\n");
    printf("AWS Secret Key: wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY\n");
    printf("GitHub Token: ghp_16ExampleGitHubToken1234567890\n");
    printf("JWT: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.abc.def\n");
    printf("Password: admin:admin\n");
    printf("Base64 Secret: U2VjcmV0S2V5VmFsdWU=\n");
    printf("RSA Private Key:\n-----BEGIN RSA PRIVATE KEY-----\nMIIEowIBAAKCAQEA7Q9...\n-----END RSA PRIVATE KEY-----\n");

    return 0;
}
