## 🐱 NekoNya4J

### 📝 About

NekoNya4J is a Java wrapper for the [NekoNya API](https://nekonya.classy.works).

### 📚 Installation

#### 📦 Maven

```xml
<dependency>
    <groupId>org.nekonya.NekoNya4J</groupId>
    <artifactId>nekonya4j</artifactId>
    <version>1.0.0</version>
</dependency>
```

#### 📦 Gradle

```groovy
implementation 'org.nekonya.NekoNya4J:nekonya4j:1.0.0'
```

### 📖 Usage

#### 📝 Example

```java
import org.nekonya.NekoNya4J.NekoNyaClient;
import org.nekonya.NekoNya4J.NekoNyaInterface;

public class Example {
    public static void main(String[] args) {
        NekoNyaClient client = new NekoNyaClient();
        System.out.println(client.neko());
        // -> URL
    }
}

// OR

public class Example {
    public static void main(String[] args) {
        NekoNyaInterface client = NekoNyaInterface.create();
        System.out.println(client.neko());
        // -> URL
    }
}
```