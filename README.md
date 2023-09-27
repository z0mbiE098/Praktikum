# Java Programming Template { SESQA }

Template für Programmierung in Java von [Professor Martin Burger](https://sesqa.martin-burger.net).

## Benötigte Software

Sie benötigen **Java**, um die Software zu übersetzen (kompilieren) und auszuführen. Als IDE (Integrated Development Environment) empfehlen wir **Visual Studio Code**. Wenn Sie auf der [Kommandozeile](https://de.wikipedia.org/wiki/Kommandozeile) arbeiten möchten, empfehlen wir **Apache Maven**.

### Programmiersprache Java

**Eclipse Temurin**, die OpenJDK-Distribution von Adoptium: <https://adoptium.net/de/>

Beispielhafte Ausgabe auf der `Kommandozeile` nach erfolgreicher Installation:

```shell
❯ java -version
openjdk version "20.0.2" 2023-07-18
OpenJDK Runtime Environment Temurin-20.0.2+9 (build 20.0.2+9)
OpenJDK 64-Bit Server VM Temurin-20.0.2+9 (build 20.0.2+9, mixed mode)
```

*Wichtig:* Stellen Sie sicher, dass Sie mindestens LTS (Long-Term Support) Version 17 installiert haben. Im obigen Beispiel ist die neuere Version 20 installiert.

### Integrierte Entwicklungsumgebung (IDE)

**Visual Studio Code**: <https://code.visualstudio.com>

Beispielhafte Ausgabe auf der `Kommandozeile` nach erfolgreicher Installation:

```shell
❯ code --version
1.82.2
abd2f3db4bdb28f9e95536dfa84d8479f1eb312d
arm64
```

### Build-Werkzeug auf der Kommandozeile [Empfohlen]

**Apache Maven**: <https://maven.apache.org>

Beispielhafte Ausgabe auf der `Kommandozeile` nach erfolgreicher Installation:

```shell
❯ mvn -v
Apache Maven 3.9.4 (dfbb324ad4a7c8fb0bf182e6d91b0ae20e3d2dd9)
Maven home: /opt/homebrew/Cellar/maven/3.9.4/libexec
Java version: 20.0.2, vendor: Eclipse Adoptium, runtime: /Library/Java/JavaVirtualMachines/temurin-20.jdk/Contents/Home
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "13.6", arch: "aarch64", family: "mac"
```

## Projekt- und Verzeichnisstruktur

Dieses Projekt hat folgende Verzeichnisstruktur:

```text
sesqa-java-programming-template
├── .gitignore
├── README.md
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── net
    │           └── martinburger
    │               └── sesqa
    │                   └── programming
    │                       └── App.java
    ├── site
    │   └── site.xml
    └── test
        └── java
            └── net
                └── martinburger
                    └── sesqa
                        └── programming
                            └── AppTest.java
```

Zusätzlich zu diesen Dateien und Verzeichnissen enthält das Projekt die Verzeichnisse `.github`, `.mvn` und `.vscode`. Diese enthalten eigene `README.md` Dateien.

### Dateien `.gitignore`, `README.md` und `pom.xml`

Die Datei **[`.gitignore`](https://git-scm.com/docs/gitignore)** legt fest, welche Dateien und Verzeichnisse das [Versionsverwaltungswerkzeug](https://git-scm.com/book/de/v2/Erste-Schritte-Was-ist-Versionsverwaltung%3F) Git [ignorieren soll](https://docs.github.com/de/get-started/getting-started-with-git/ignoring-files). Diese werden von Git nicht automatisch hinzugefügt und auch nicht als "unversioniert" (engl. untracked) angezeigt. In der Regel handelt es sich dabei um automatisch generierte Dateien wie Logdateien oder Dateien, die von einem Build-Werkzeug wie Maven erzeugt werden.

Bei der Datei **[`README.md`](https://docs.github.com/de/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes)** handelt es sich um diese Datei.

Die **[`pom.xml`](https://maven.apache.org/pom.html)** Datei ist eine XML Datei, die Informationen über das Projekt und Konfigurationsdetails enthält, die von Maven verwendet werden, um das Projekt zu bauen. Diese Informationen werden im sogenannten [Project Object Model](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html) (POM) dargestellt. Beim Ausführen eines Tasks oder Goals (zum Beispiel mit dem Befehl `mvn compile`) sucht Maven nach dieser Datei im aktuellen Verzeichnis. Maven liest daraus das POM, holt sich die benötigten Konfigurationsinformationen und führt dann den Befehl aus.

### Verzeichnis `src`

Das Verzeichnis **[`src`](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)** enthält den gesamten Quellcode und die zugehörigen Ressourcen für die Erstellung des Projekts, der Webseite und dergleichen. Es enthält ein Unterverzeichnis für jedes dieser Artefakte: `main` für das Haupt-Build-Artefakt (in diesem Fall ist dies Ihr Java-Programm), `test` für den Unit-Test-Code, `site` für die Webseite und so weiter.

Der Java-Quellcode befindet sich in den beiden Verzeichnissen `src/main/java` und `src/test/java`. Die beiden darin enthaltenen Verzeichnisse `net/martinburger/sesqa/programming` definieren das [Java-Paket](https://dh-cologne.github.io/java-wegweiser/articles/Packages-package-und-import.html) `net.martinburger.sesqa.programming`.

*Hinweis:* Maven erstellt beim Bauen ein Verzeichnis namens `target`. Dieses enthält alle Daten, die beim Bauen des Projekts automatisch erzeugt werden. Dazu gehören unter anderem die kompilierten Java-Klassen, das JAR-Archiv und die Webseite. Dieses Verzeichnis wird durch die Datei .`.gitignore` von der Versionskontrolle ausgeschlossen.

## Bauen der Software mit dem Build-Werkzeug Apache Maven

Sie können Maven auf der `Kommandozeile` verwenden, um das Softwareprojekt zu bauen. Dies beinhaltet unter anderem das **Kompilieren**, **Ausführen**, **Testen**, **Paketieren** und **Validieren** der Software. Außerdem können Sie eine **Webseite** für Ihr Projekt erstellen, die es Ihnen ermöglicht, verschiedene Berichte im Browser anzuzeigen. Dazu gehören eine Übersicht über alle Testergebnisse und eventuelle Verstöße gegen gute Programmierpraktiken.

Dieses Projekt stellt Ihnen eine vorkonfigurierte [POM-Datei](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html) (`pom.xml`) zur Verfügung, so dass Sie sofort loslegen können. Bitte passen Sie diese Datei Ihren Bedürfnissen an. Insbesondere bieten sich Konfigurationen wie `<groupId>`, `<artifactId>`, `<name>`, `<description>`, `<developers>` und `<mainClass>` an.

### Kompilieren

Mit dem Befehl `mvn compile` können Sie den Quellcode Ihrer Software im Verzeichnis `src/main` übersetzen beziehungsweise kompilieren.

Die kompilierten Klassen (`.class`-Dateien) finden Sie anschließend im Verzeichnis `target/classes`.

*Hinweis*: Dieses Projekt ist so konfiguriert, dass der Java-Compiler bei der Übersetzung des Java-Quellcodes das statische Analysewerkzeug [Error Prone](https://errorprone.info) verwendet, das häufige Programmierfehler bereits zur Kompilierzeit erkennt. Stößt das Werkzeug auf einen solchen Fehler, wird in der Ausgabe des Compilers ein Link zu weiteren Informationen über den Fehler angezeigt. Auf der Webseite von Error Prone finden Sie eine [Übersicht über die sogenannten Bug Patterns](https://errorprone.info/bugpatterns) ("Fehler-Muster"), nach denen das Werkzeug sucht.

### Ausführen

Mit dem Befehl `mvn exec:java` können Sie Ihr Programm ausführen.

*Wichtig:* Zuvor muss der Quellcode kompiliert worden sein. Dies können Sie mit dem Befehl `mvn compile exec:java` kombinieren.

*Hinweis:* Der Name der auszuführenden Klasse ist in der `pom.xml`-Datei unter der Konfiguration `<mainClass>` hinterlegt.

### Testen

Mit dem Befehl `mvn test` können Sie Ihr Programm testen. Hierzu werden die [JUnit-Tests](https://junit.org) im Verzeichnis `src/test` kompiliert und aus dem Verzeichnis `target/test-classes` heraus ausgeführt.

### Paketieren

Mit dem Befehl `mvn package` können Sie Ihr Programm paketieren. In diesem Fall bedeutet dies die Erstellung eines [Java-Archivs](https://openbook.rheinwerk-verlag.de/javainsel/23_005.html#u23.5) (`.jar`-Datei).

Die `.jar`-Datei befindet sich anschließend im Verzeichnis `target`.

#### JAR-Archiv ausführen

Mit dem Befehl `java -jar target/java-template-0.1-SNAPSHOT.jar` können Sie Ihr Programm direkt aus dem JAR-Archiv starten.

*Hinweis:* Der Name der `.jar`-Datei leitet sich aus dem in der `pom.xml`-Datei unter der Konfiguration `<artifactId>` hinterlegten Wert ab.

### Validieren

Mit dem Befehl `mvn verify` können Sie Ihr Programm auf die Einhaltung der zuvor definierten Qualitätskriterien überprüfen. In diesem Projekt bedeutet dies die Ausführung von [Checkstyle](https://checkstyle.org), einem Werkzeug zur Überprüfung des Programmierstils von Java-Quellcode.

*Wichtig:* Checkstyle wird in diesem Fall nur ausgeführt, wenn Ihr Projekt zuvor erfolgreich kompiliert und getestet werden konnte. Schlägt dies fehl, wird der Build-Prozess abgebrochen und Checkstyle nicht ausgeführt. In diesem Fall können Sie Checkstyle direkt mit dem Befehl `mvn checkstyle:check` ausführen.

*Hinweis:* Checkstyle ist so konfiguriert, dass die [Google Java Style](https://google.github.io/styleguide/javaguide.html)-Konventionen überprüft werden.

### Webseite

Mit dem Befehl `mvn site` können Sie eine [Webseite generieren](https://maven.apache.org/guides/mini/guide-site.html), die verschiedene Berichte enthält. Dazu gehören [navigierbarer Quellcode](https://maven.apache.org/jxr/), Testergebnisse (jUnit), Checkstyle, [Codetags](https://stackoverflow.com/q/1452934/66981) und [Javadoc](https://openbook.rheinwerk-verlag.de/javainsel/23_004.html#u23.4).

Die Webseite befindet sich anschließend im Verzeichnis `target/site`. Um die Berichte dort anzusehen, öffnen Sie die Datei `target/site/index.html` in Ihrem Browser.

*Hinweis*: Eine beispielhafte Webseite finden Sie unter: <https://martinburger.github.io/sesqa-java-programming-template/>
