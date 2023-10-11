# Multiprocess Programming

### General info

In this project we had to create an aplication that counts the vowels of a file with subprocesses. For this we had to create a main app that calls the subprocesses, for the subprocesses we had to pass them arguments in order to work.

---

## Classes & methods

### App()

- We have a a void method that makes use of an array of words, (in this case vowels) to use them in a process list that we called "ArrayList". We parse each vowel into the subprocess and we add them into the ArrayList. We then use a "try-catch" to wait for the subprocesses. Finally we print through screen the total vowels & the individual count of that character.

### ProcessLauncher()

- In this class we use some routes that we store in Strings to use it later. Also we create a new output file to read the data that we used in the subprocess.

- initVowelProcess(): for this method we need to pass through the character, in it a new process starts with that vowel that calls in the routes that we defined before. Then we create a new null process only to start our processBuilder later. In the "try-catch" we redirect the output of the process to a file located in the folder outputs, we use appendTo to use only one file., and then we return the process.

### CharCounter()

- In this method we parse the 2 arguments, the text and the vowel, we check if the vowel is contained in the text by checking letter by letter and, if its the case it adds up 1 to the "vowelcount" variable. Then we return "vowelcount".

### Utils

- textObtainer(): In this method we use the text route and a variable called "text". Then with a try-catch we make a buffered reader to read the file, and with a while loop we keep getting the lines of the text untill it is null. Then we return the text.

- vowelPrinter(): For this method we use 2 arguments, outputFile and vowels (which is an array of vowels). Then we declare a BufferedReader to read the outputFile that we pass it through, and we read the line to have some data to play with. With the use of an if statement inside an foreach we keep iterating so the program keeps telling through console the amount of characters we have in the file (one for each vowel and the total amount).

- conversorLine(): This method is used to convert the data of the line (String file data) in integer type data for using it later.
