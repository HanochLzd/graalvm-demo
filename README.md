# graalvm-demo
graalvm-demo


# gcc

## mac
```bash
gcc -shared -Wall -Werror \
-I$JAVA_HOM/include \
-I$JAVA_HOM/include/darwin \
-dynamiclib \
-o libHelloWorld.dylib  \
-fPIC ./HelloWorld.c
```

## linux

```bash
gcc -shared -Wall -Werror -I$JAVA_HOM/include \
-I$JAVA_HOM/include/linux -o libHelloWorld.so  \
-fPIC ./HelloWorld.c
```