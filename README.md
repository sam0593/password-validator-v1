A Spring Boot REST API that validates password strength based on configurable security rules such as length, character types, and entropy.
## Features
- Minimum length validation
- Uppercase, lowercase, numeric, and special character checks
- Password strength classification (WEAK / MEDIUM / STRONG)
- Clear validation response

- ## Tech Stack
- Java
- Spring Boot
- REST API
- Maven

- ## API Endpoint

### Validate Password
**POST** api/v1/password/validate

#### Request
```json
{
  "userName": "ahaan",
  "password": "P@ssw0rd123",
  "email": "ahy@gmail.com",


}
{
    "valid": true,
    "score": 90,
    "issues": [null],
    "strength": "STRONG",
    "suggestions": [null],
    "checks": {
        "uppercase": true,
        "sequence": true,
        "MIN_LENGTH": true,
        "Special Character": false,
        "digit": true
    }
}
