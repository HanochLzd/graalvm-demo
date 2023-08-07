# graalvm-demo
graalvm-demo

# build jni .h
```shell
cd src/main/java
javac --class-path ../../../target/classes -h ../resources/native com/hanoch/graalvmdemo/jni/HelloWorld.java
```

# gcc build so

## mac
```bash
gcc -shared -Wall -Werror \
-I$JAVA_HOME/include \
-I$JAVA_HOME/include/darwin \
-dynamiclib \
-o libHelloWorld.dylib  \
-fPIC ./HelloWorld.c
```

## linux

```bash
gcc -shared -Wall -Werror -I$JAVA_HOME/include \
-I$JAVA_HOME/include/linux -o libHelloWorld.so  \
-fPIC ./HelloWorld.c
```


## Build Native

### env

- sdkman install graalvm 17.0.8-graalce (Easy to manage multiple versions)
- gu install native-image
- 

```shell


```

```shell
./mvnw -Pnative native:compile
```