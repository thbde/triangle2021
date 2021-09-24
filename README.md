# For eclipse
1) Install Java
2) Install eclipse
3) Install maven for eclipse if not already installed
4) init: new maven project from scm, install git
    1) A git provider may be needed, search for egit
    2) Or https://repo1.maven.org/maven2/.m2e/connectors/m2eclipse-egit/0.15.1/N/LATEST/

---

Configure assertj
(from https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#ide-automatic-static-import )

1) Go to : Window > Preferences > Java > Editor > Content Assist > Favorites > New Type (search favorites)
2) Enter : org.assertj.core.api.Assertions and click OK
3) You should see : org.assertj.core.api.Assertions.* in the list of favorites.

---

# For vscode

* Clone project to `<some place>`
* open vscode
* "File", "Open Folder" and open `<some place>`
* Maybe adapt jdk: Settings, search for jdk. There should be "java: Home
  * Insert "java.home": "C:\\Program Files\\AdoptOpenJDK\\jdk-15.0.0.36-hotspot" (adapt path to your own environment)


