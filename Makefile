JAVAC       := javac
JAVAFLAGS   :=
JRE         := java
TARGETS     += ${patsubst %.java,  %.class, ${wildcard *.java}}

.SUFFIXES: .class .java

%.class: %.java
	${JAVAC} ${JAVAFLAGS} $<

.PHONY:build run

build: ${TARGETS}

run:
	${JRE} ${TARGETS:.class=}

clean:
	find ./ -name "*.class" -exec rm {} \;
