## Pulsar Changelog
This project uses [Semantic Versioning (SemVer)](http://semver.org/). It's a library, after all, it's only sensible.

### Version 1.1.2
- Fix Pulses with missing dependencies loading (via boni)
- Forward all events from the Forge bus, not just the FML lifecycle events.

### Version 1.1.1
- Upgrade internal event bus system to [Flightpath](https://github.com/Emberwalker/Flightpath)
- Minor private API changes to accommodate this transition. Not that you should be using that anyway.

### Version 1.0.1
- Fix Pulse ordering for FML events (moved from single master bus to bus per pulse) - no API change.

### Version 1.0.0
**This is a breaking release!**
- Removed all deprecated facilities.
- Updated to 1.8.0.
- Switched event handling to be based directly on Google Event Bus.
    - Read the docs on @Pulse for advice!
- Made error sources more clear.
- Added EventSpy utility pulse for monitoring the internal EventBus.
    - Load it like a standard Pulse object: `manager.registerPulse(new EventSpy())`
- New Gson config entries will default to defaultEnable's value, not the current enabled state (thanks, Boni!)
    - Other IConfiguration providers will need to switch to using `meta.isDefaultEnabled()` to pick up the change.

### Version 0.5.0
- Crash Callable support for each PulseManager created.

### Version 0.4.0
- Enable pulse dependencies (by @Parker8283)

### Version 0.3.0
- Change to LinkedHashMap in PulseManager to preserve ordering.

### Version 0.2.0
- Allow custom configuration handlers via IConfiguration.
- Add modsRequired field to @Pulse.

### Version 0.1.0
- Deprecate IPulse and @PulseProxy.
- Add description field to @Pulse.

### Version 0.0.1
- Initial release.
