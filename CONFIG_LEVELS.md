## Configuration API levels

### Version 0
- Introduced in Pulsar 0.0.x
- No configVersion tag defined
- All modules that are configurable have an entry
- Config is an array of String: bool pairs

### Version 1
- Introduced in Pulsar 0.1.x
- Adds configVersion tag
- All modules have an Entry of form {'enabled': bool, 'description': string}
- Config is an array of String: Entry pairs
