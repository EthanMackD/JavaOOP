1). Enums provide better encapsulation rather than using public static final constants because 
the enums bundle together the data types. So for this example, the code, symbol, name and precision
data is stored together. With public static final constants, you would need to create separate variables,
leading to more boilerplate code.

2). The compiler guarantees you can only pass valid Currency values (EUR, USD, JPY, GBP, BTC). 
 With strings, you can pass any string, and errors only appear at runtime when the code executes. 
 This is why enums catch bugs during the compile time instead of letting them through to run.

public void processTransaction(String currency, double amount) {}

processTransaction("EUR", 100.0); //  Intended use
processTransaction("123", 100.0); //  Invalid - runtime bug

With enums, only the correct format in the method will compile.

3). It would be easier to add another currency using enums because all of the data would be together on the one line,
like the rest of the currencies would be set up. e.g.  SEK (123, "KR", "Swedish Krona", 2);
All existing methods would still automatically work for this new currency and it would be impossible to mismatch data.

4). Enum comparisons using "==" are more efficient because they simply compare memory addresses in a single operation. 
Since each enum constant (like Currency.EUR) exists as only one object in memory, comparing two enum references is just checking if they point to the same location.
String comparisons using .equals() are slower because the method must check if the object is actually a String or compare each character one by one for example.