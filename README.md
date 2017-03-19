# SkoLang
small custom language compiler (uses JVM)

SkoLang is a small functional language.

It compiles your program from a .sko file first to a string with jasmin
assembler code and then to a .class java class file of the same name,
plus another class file for each type specified in the code.

currently in a very early stage.

## SkoLang code example:

```c++
import:
  std.math

int appendInts (int a, int b) {
  string first = toString(a);
  string second = toString(b);
  string result = append(first,second);
  return toInt(result);
}

out(appendInts(int: math.sqrt(16), 4));

int[] intArray = new int[5];

int i = 0;
while (i < 5) {
  intArray[i] = i;
  i = i+1;
}

out(intArray[4]);

type Integer {
  int number;
}

Integer four = new Integer(4);
print(four.number);
```
returns "4444".
