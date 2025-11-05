# NnClassLoader (Nashorn ClassLoader)[![Build Status](https://travis-ci.org/NashornTools/NnClassLoader.svg?branch=master)](https://travis-ci.org/NashornTools/NnClassLoader) [![License](https://img.shields.io/badge/license-Apache_2.0-blue.svg)](https://github.com/NashornTools/NnClassLoader/blob/master/LICENSE) 


Simple and convenient Java ClassLoader. Allows to define Java dependencies (jars, class directories, URLs, Maven or any combination of them) directly.

Example of usage from without having any local jars or scripts and even without manual Maven installation:

```js
// Define Maven dependencies for the script.
var MAVEN_DEPENDENCIES = ['com.h2database:h2:1.4.192', 'org.apache.commons:commons-dbcp2:2.1.1'];
 // Create class loader instance.
var L = new NnClassLoader({ maven: MAVEN_DEPENDENCIES });
// Look at the actual list of jars resolved by the class loader.
for each(var url in L.getUrls()) print(url);

// Import class similarly to Java.type('com.example.MyType').
var BasicDataSource = L.type('org.apache.commons.dbcp2.BasicDataSource');

// Work with imported classes as usual.
var ds = new BasicDataSource();

ds.setDriverClassName('org.h2.Driver');
ds.setUrl('jdbc:h2:mem:MyTestDb');

var c = ds.getConnection();
var s = c.createStatement();

s.executeUpdate('CREATE TABLE cars(name VARCHAR)');
0
s.executeUpdate("INSERT INTO cars VALUES ('BMW'),('Volvo'),('Lexus')");
3
var rs = s.executeQuery('SELECT * FROM cars');
while (rs.next()) print(rs.getString(1));
```

## Supported configuration properties

`NnClassLoader` constructor accepts single object with any of the following configuration properties:

- `urls` - JS array of URL strings (may refer to remote Jars as well, e.g. `{urls: ['http://example.com/bla.jar']}`)
- `jars` - JS array of Jar file path strings (`{jars: ['libs/bla.jar']}`)
- `dirs` - JS array of directory path strings to be recursively scanned in order to find all the Jar files there (`{dirs: ['libs']}`)
- `filter` - JS function which accepts single argument of type `java.io.File` and returns boolean; makes sense only if `dirs` is defined and allows to filter scanned files and directories (`{dirs: ['libs'], filter: function(f) {return f.isDirectory() || f.getName().endsWith('.jar')}}`)
- `classes` - JS array of directory path strings to be added to classpath as is (`{classes:['target/classes']}`)
- `maven` - JS array of Maven dependencies to be loaded (`{maven: ['org.apache.ignite:ignite-core:1.7.0']}`)
- `parent` - parent Java class loader (must be of `java.lang.ClassLoader` type)


## API methods of `NnClassLoader` instances

- `type(className)` - loads the requested type by name the same way as `Java.type('...')` does
- `getUrls()` - returnes JS array of actual URL strings used by this class loader instance
- `getJavaClassLoader()` - returns internal `java.net.URLClassLoader` instance which actually does the class loading (it is often useful to set it as a thread context class loader by `java.lang.Thread.setContextClassLoader` method)


[![Nashorn Tools](https://cdn.rawgit.com/NashornTools/logo/master/rhino.svg)](https://github.com/NashornTools)