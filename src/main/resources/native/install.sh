gcc -shared -Wall -Werror -I$JAVA_HOM/include -I$JAVA_HOM/include/darwin -dynamiclib -o libHelloWorld.dylib  -fPIC ./HelloWorld.c