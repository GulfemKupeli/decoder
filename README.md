Your country is at war and your enemies are using a secret code to communicate with each other. You have managed to intercept a message that reads as follows:

:mmZ\dxZmx]Zpgy

 

The message is obviously encrypted using the enemy's secret code. You have just learned that their encryption method is based upon the ASCII code. Individual characters in a string are encoded using this system. For example, the character ‘A’ is encoded using the number 65 and ‘B’ is encoded using the number 66. Your enemy's secret code takes each letter of the message and encrypts it as follows:

 if (OriginalChar + Key > 126) then

      EncryptedChar = 32 + ((OriginalChar + Key) - 127)

 else

      EncryptedChar = (OriginalChar + Key)

For example, if the enemy uses Key = 10 then the message "Hey" would initially be represented as:

Character  ASCII code

H            72

e            101

y            121    

     And "Hey" would be encrypted as:

Encrypted H = (72 + 10) = 82  = R  in ASCII

Encrypted e = (101 + 10) = 111 = o in ASCII

Encrypted y = 32 + ((121 + 10) - 127) = 36 = $ in ASCII

Consequently, "Hey" would be transmitted as "Ro$." Write a program Java that decrypts the intercepted message. You only know that the key used is a number between 1 and 100. Your program should try to decode the message using all possible keys between 1 and 100. When you try the valid key, the message will make sense. For all other keys, the message will appear as gibberish.  Since there are only 100 keys this would obviously be a pretty crummy encryption system.  This Programming Project will require you to explore a bit on your own how to convert   from a char to a number, process the number, then convert it back to a char.  You will want to use charAt(). 

Important: Note that the secret code has a \ so you will need to escape encode it by using \\ if you hard-code it in your program.
