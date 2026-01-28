# Simplest SCA Vulnerable Repository

A simple, compact repository containing vulnerable dependencies for testing Software Composition Analysis (SCA) tools like DustiLock, OWASP Dependency-Check, and Trivy-SCA.

## Purpose

This repository is designed to provide a minimal test case for SCA vulnerability detection. It contains deliberately vulnerable dependencies across multiple programming language ecosystems to demonstrate how SCA tools identify known security vulnerabilities in third-party libraries.

## Structure

- `node-app/` - Node.js application with vulnerable npm packages
- `python-app/` - Python application with vulnerable pip packages
- `java-app/` - Java application with vulnerable Maven dependencies
- `go-app/` - Go application with vulnerable Go module

## Vulnerabilities Included

### Node.js (`package.json`)
- **lodash@4.17.10** - Prototype pollution (CVE-2019-10744)
- **axios@0.19.2** - SSRF vulnerability (CVE-2020-28168)
- **jsonwebtoken@8.4.0** - Algorithm confusion (CVE-2022-23529)

### Python (`requirements.txt`)
- **urllib3@1.25.10** - CRLF injection (CVE-2020-26137)
- **Django@2.2.10** - Multiple security vulnerabilities
- **Pillow@7.2.0** - Buffer overflow (CVE-2021-27921)

### Java (`pom.xml`)
- **log4j-core@2.14.1** - Log4Shell (CVE-2021-44228)
- **commons-collections@3.2.1** - Deserialization vulnerability (CVE-2015-6420)
- **jackson-databind@2.9.9** - Deserialization vulnerability (CVE-2020-8840)

### Go (`go.mod`)
- **golang.org/x/text@0.3.2** - Infinite loop vulnerability (CVE-2020-14040)

## Usage

Each subdirectory contains a minimal application that can be built/run to verify dependencies are installed. However, the primary purpose is for SCA tool testing:

```bash
# Run DustiLock
dustilock scan .

# Run OWASP Dependency-Check
dependency-check --scan .

# Run Trivy SCA
trivy fs --scanners vuln .
```

## Notes

- All vulnerabilities are intentionally included for testing purposes only
- Do not use this code in production environments
- This repository is maintained as a simple reference for SCA tool evaluation
- The applications are minimal and only demonstrate dependency inclusion, not exploitation

## License

MIT