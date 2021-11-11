# Type Conversion Casting 
 changing type of a primitive data 
 eg. changing int to byte =>  
 int a=234;
 byte b;
 b= byte(a);
 ## automatic type promotion in expressions
conversion can occur in expression =>
byte a=40;
byte b=50;
byte c=100;
int d= a*b/c; (a*b exceeds the range of either of its byte operands)
Java automatically promotes byte, short or chat opernad to int when evaluating an expression. 
### Rules of automatic conversion  
byte, short and char => int
if one operand is long=> all to long
if one operand is float= > all to float
if one oprand is double => all to double
```
byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 6.57f;
        double d = .123;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("(f * b) " + "(i / c)" + "-" + " (d * s);");
        System.out.println("resuts= " + result);
        ```
In above example =>
 in f*b => b is promoted to float, type of subexpression is float 
 in i/c => c is promoted to int,  type of subexpression is int 
 in d*s => s is pormoted to double, type of subexpression is double 

 outcome of float + int is float
 outcome of float - double is double, which is the type of final result 

 # Arrays
 => elements are accesed by its index
 ### One Dimensional Arrays
  ’’’ type var-name[]; ’’’
   
