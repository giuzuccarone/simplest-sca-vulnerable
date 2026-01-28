#!/usr/bin/env python3
"""Simple Python app with vulnerable dependencies for SCA testing."""

import urllib3
import django
import PIL
import yaml
import requests
import cryptography

print("Vulnerable Python app running")
print(f"urllib3 version: {urllib3.__version__}")
print(f"Django version: {django.get_version()}")
print(f"Pillow version: {PIL.__version__}")
print(f"PyYAML version: {yaml.__version__}")
print(f"requests version: {requests.__version__}")
print(f"cryptography version: {cryptography.__version__}")

# Example usage
http = urllib3.PoolManager()
print("urllib3 PoolManager created")

if __name__ == "__main__":
    print("App completed")