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

*Hinweis*: Details zu Maven finden Sie unter [`docs/Maven.md`](docs/Maven.md).

## Projekt- und Verzeichnisstruktur

Dieses Projekt hat folgende Verzeichnisstruktur:

```text
sesqa-java-programming-template
├── .gitignore
├── README.md
├── docs
│   └── ...
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

### Verzeichnis `docs`

Im Verzeichnis **`docs`** finden Sie weitere Dokumentation zur Benutzung dieses Projektes.

### Verzeichnis `src`

Das Verzeichnis **[`src`](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)** enthält den gesamten Quellcode und die zugehörigen Ressourcen für die Erstellung des Projekts, der Webseite und dergleichen. Es enthält ein Unterverzeichnis für jedes dieser Artefakte: `main` für das Haupt-Build-Artefakt (in diesem Fall ist dies Ihr Java-Programm), `test` für den Unit-Test-Code, `site` für die Webseite und so weiter.

Der Java-Quellcode befindet sich in den beiden Verzeichnissen `src/main/java` und `src/test/java`. Die beiden darin enthaltenen Verzeichnisse `net/martinburger/sesqa/programming` definieren das [Java-Paket](https://dh-cologne.github.io/java-wegweiser/articles/Packages-package-und-import.html) `net.martinburger.sesqa.programming`.

*Hinweis:* Maven erstellt beim Bauen ein Verzeichnis namens `target`. Dieses enthält alle Daten, die beim Bauen des Projekts automatisch erzeugt werden. Dazu gehören unter anderem die kompilierten Java-Klassen, das JAR-Archiv und die Webseite. Dieses Verzeichnis wird durch die Datei .`.gitignore` von der Versionskontrolle ausgeschlossen.

## Build-Werkzeug Apache Maven

Sie können Maven auf der `Kommandozeile` verwenden, um das Softwareprojekt zu bauen. Details finden Sie unter [`docs/Maven.md`](docs/Maven.md).
