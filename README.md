# Function Kata „ROT-13“

Write a function that encodes a text with the ROT-13 algorithm.

With ROT-13, every letter will be replaced bye that one 13 positions later in the alphabet.
After 'Z' you should wrap and start by 'A' again.

Sample output:
```Hello, Word -> URYYB, JBEYQ```

'E' will be replaced bye 'R' and 'W' bye 'J'. Only use uppercase letters.

'Ö', 'Ü' and 'Ä' should be replaced with 'OE', 'UE', and 'AE'.

Characters that are no letters should not be encrypted.

### Variation #1

Make the offset (sample: 13) to be variable

###     Variation #2

Now, encrypt digits too. Group the digits with the uppercase letters: 0123456789ABCDEF---XYZ.

Therefore, '0' will be replaced by 'D' and 'Z' not any more by 'M' but by 'C',
 considering the offset of 13 we are having as sample.
