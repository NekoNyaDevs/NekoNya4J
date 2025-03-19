## 🐱 NekoNya4J

### 📝 About

NekoNya4J is a Java wrapper for the [NekoNya API](https://docs.classydev.fr/nekonya).

### 📚 Installation

#### 📦 Maven

```xml
<dependency>
    <groupId>fr.classydev</groupId>
    <artifactId>nekonya4j</artifactId>
    <version>0.1.0</version>
</dependency>
```

#### 📦 Gradle

```groovy
implementation 'fr.classydev.NekoNya4J:nekonya4j:0.1.0'
```

### 📖 Usage

#### 📝 Example

```java
import fr.classydev.NekoNya4J.NekoNya;

public class Example {
    public static void main(String[] args) {
        NekoNya client = new NekoNya();
        System.out.println(client.getNeko());
        // -> URL
    }
}
```