fichJar = pi.jar

limpiar:
	rm -f *.jar
	rm -rf bin	

compilar: limpiar
	mkdir bin
	find . -name *.java | xargs javac -cp bin -d bin

jar: compilar
	jar cvfm $(fichJar) Manifest.txt -C bin . 

javadoc:compilar
	find src -type f -name "*.java" | xargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8