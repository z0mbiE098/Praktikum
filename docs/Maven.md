# Bauen der Software mit dem Build-Werkzeug Apache Maven

Sie können Maven auf der `Kommandozeile` verwenden, um das Softwareprojekt zu bauen. Dies beinhaltet unter anderem das **Kompilieren**, **Ausführen**, **Testen**, **Paketieren** und **Validieren** der Software. Außerdem können Sie eine **Webseite** für Ihr Projekt erstellen, die es Ihnen ermöglicht, verschiedene Berichte im Browser anzuzeigen. Dazu gehören eine Übersicht über alle Testergebnisse und eventuelle Verstöße gegen gute Programmierpraktiken.

Dieses Projekt stellt Ihnen eine vorkonfigurierte [POM-Datei](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html) (`pom.xml`) zur Verfügung, so dass Sie sofort loslegen können. Bitte passen Sie diese Datei Ihren Bedürfnissen an. Insbesondere bieten sich Konfigurationen wie `<groupId>`, `<artifactId>`, `<name>`, `<description>`, `<developers>` und `<mainClass>` an.

## Kompilieren

Mit dem Befehl `mvn compile` können Sie den Quellcode Ihrer Software im Verzeichnis `src/main` übersetzen beziehungsweise kompilieren.

Die kompilierten Klassen (`.class`-Dateien) finden Sie anschließend im Verzeichnis `target/classes`.

*Hinweis*: Dieses Projekt ist so konfiguriert, dass der Java-Compiler bei der Übersetzung des Java-Quellcodes das statische Analysewerkzeug [Error Prone](https://errorprone.info) verwendet, das häufige Programmierfehler bereits zur Kompilierzeit erkennt. Stößt das Werkzeug auf einen solchen Fehler, wird in der Ausgabe des Compilers ein Link zu weiteren Informationen über den Fehler angezeigt. Auf der Webseite von Error Prone finden Sie eine [Übersicht über die sogenannten Bug Patterns](https://errorprone.info/bugpatterns) ("Fehler-Muster"), nach denen das Werkzeug sucht.

## Ausführen

Mit dem Befehl `mvn exec:java` können Sie Ihr Programm ausführen.

*Wichtig:* Zuvor muss der Quellcode kompiliert worden sein. Dies können Sie mit dem Befehl `mvn compile exec:java` kombinieren.

*Hinweis:* Der Name der auszuführenden Klasse ist in der `pom.xml`-Datei unter der Konfiguration `<mainClass>` hinterlegt.

## Testen

Mit dem Befehl `mvn test` können Sie Ihr Programm testen. Hierzu werden die [JUnit-Tests](https://junit.org) im Verzeichnis `src/test` kompiliert und aus dem Verzeichnis `target/test-classes` heraus ausgeführt.

## Paketieren

Mit dem Befehl `mvn package` können Sie Ihr Programm paketieren. In diesem Fall bedeutet dies die Erstellung eines [Java-Archivs](https://openbook.rheinwerk-verlag.de/javainsel/23_005.html#u23.5) (`.jar`-Datei).

Die `.jar`-Datei befindet sich anschließend im Verzeichnis `target`.

### JAR-Archiv ausführen

Mit dem Befehl `java -jar target/java-template-0.1-SNAPSHOT.jar` können Sie Ihr Programm direkt aus dem JAR-Archiv starten.

*Hinweis:* Der Name der `.jar`-Datei leitet sich aus dem in der `pom.xml`-Datei unter der Konfiguration `<artifactId>` hinterlegten Wert ab.

## Validieren

Mit dem Befehl `mvn verify` können Sie Ihr Programm auf die Einhaltung der zuvor definierten Qualitätskriterien überprüfen. In diesem Projekt bedeutet dies die Ausführung von [Checkstyle](https://checkstyle.org), einem Werkzeug zur Überprüfung des Programmierstils von Java-Quellcode.

*Wichtig:* Checkstyle wird in diesem Fall nur ausgeführt, wenn Ihr Projekt zuvor erfolgreich kompiliert und getestet werden konnte. Schlägt dies fehl, wird der Build-Prozess abgebrochen und Checkstyle nicht ausgeführt. In diesem Fall können Sie Checkstyle direkt mit dem Befehl `mvn checkstyle:check` ausführen.

*Hinweis:* Checkstyle ist so konfiguriert, dass die [Google Java Style](https://google.github.io/styleguide/javaguide.html)-Konventionen überprüft werden.

## Webseite

Mit dem Befehl `mvn site` können Sie eine [Webseite generieren](https://maven.apache.org/guides/mini/guide-site.html), die verschiedene Berichte enthält. Dazu gehören [navigierbarer Quellcode](https://maven.apache.org/jxr/), Testergebnisse (jUnit), Checkstyle, [Codetags](https://stackoverflow.com/q/1452934/66981) und [Javadoc](https://openbook.rheinwerk-verlag.de/javainsel/23_004.html#u23.4).

Die Webseite befindet sich anschließend im Verzeichnis `target/site`. Um die Berichte dort anzusehen, öffnen Sie die Datei `target/site/index.html` in Ihrem Browser.

*Hinweis*: Eine beispielhafte Webseite finden Sie unter: <https://martinburger.github.io/sesqa-java-programming-template/>
