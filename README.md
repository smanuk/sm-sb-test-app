### Dependencies
This project requires the sm-sb-timing-library dependency also in my public repo.

Spring uses proxies, only method calls INTO an object are intercepted, if you are internally calling a method,
e.g. this.someMethodName() then the aspect will not be called.
