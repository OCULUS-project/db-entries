# db-entries
Entries classes used in oculus database. Configured to use with Spring MongoDB plugin.

## add to project
Replace `TAG` with most recent repository tag.

More info about package: https://jitpack.io/#OCULUS-project/db-entries

### gradle
```groovy
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}

dependencies {
        implementation 'com.github.OCULUS-project:db-entries:TAG'
}
```
### maven
```xml
<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>
  
<dependency>
    <groupId>com.github.OCULUS-project</groupId>
    <artifactId>db-entries</artifactId>
    <version>Tag</version>
</dependency>
```

