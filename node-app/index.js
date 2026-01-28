// Simple Node.js app with vulnerable dependencies
const _ = require('lodash');
const axios = require('axios');
const jwt = require('jsonwebtoken');

console.log('Vulnerable Node.js app running');
console.log('Lodash version:', _.VERSION);
console.log('Axios version:', axios.VERSION);
console.log('JWT version:', jwt.version);

// Example usage of vulnerable packages
const obj = {};
_.merge(obj, JSON.parse('{"__proto__":{"polluted":"yes"}}'));
console.log('Polluted?:', {}.polluted);

const token = jwt.sign({ user: 'admin' }, 'secret');
console.log('Token:', token);