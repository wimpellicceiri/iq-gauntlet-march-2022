# iq-gauntlet-march-2022
IQ Inc. Gauntlet of Code Challenge from March 2022
<br>
<br>

***

<br>

## Question 1
A triangular number, T(n), is represented as the sum of all values from 1 to n.

Therefore, T(5) = 1 + 2 + 3 + 4 + 5 = 15.



In this problem, we are looking at the sum of the digits that comprise the triangular number, and whether that sum results in a number greater than or equal to 10.



So, for example:

T(1) = 1 (sum: 1, NO, not >= 10)

T(2) = 3 (sum: 3, NO)

T(3) = 6 (sum: 6, NO)

T(4) = 10 (sum: 1, NO)

T(5) = 15 (sum: 6, NO)

T(6) = 21 (sum: 3, NO)

T(7) = 28 (sum: 10, YES, >= 10)

28 is the 1st triangular number whose digits sum to a number greater than or equal to 10.



What is the 27th triangular number where the sum of its digits is at least 10?

<br>

***

<br>

## Question 2
Everybody loves the Fibonacci sequence!  Well… apparently not EVERYBODY.  A new sequence has sprung from the devious mind of Dr. Fibonucci.



F(1) = 1

F(2) = 2

F(n) = F(n - 1) + F(n - 2)

However, if F(n - 1) is even, Dr. Fibonucci says to only use half of F(n - 1).  

Also, to be particularly devious, Dr. Fibonucci says that if F(n - 2) is divisible by 7, an extra 1 must be added to the result.



What is F(50) for Dr. Fibonucci’s sequence?

<br>

***

<br>


## Question 3
Mary Shelly and Bram Stoker were at a bar one night boasting to one another that their book was better.

“My book is more verbose and must therefore be regarded as of higher quality.”

“Posh! Your loquaciousness simply means that you endlessly prattle on.”

The town drunk, sitting nearby and overhearing their bickering, drunkenly slurs:

“I like vowelsh… whomever used the mosht <hic> has the better book.”

“That seems an egregious measure and would simply favor the larger tome.  Suppose instead we consider which of us wrote the higher percentage of vowels?”

“But my longer book also has more punctuation.  It would be untoward if we allowed such minutia for consideration.”

“Very well then, let us settle this wager! Only letters are under consideration.”

Between Dracula and Frankenstein, which book wins the wager and has the higher percentage of vowels?  



Your answer will be the number of vowels contained in the winning book.



Dracula - https://www.gutenberg.org/ebooks/345.txt.utf-8

Frankenstein - https://www.gutenberg.org/files/84/84-0.txt



Some clarifications:

Only characters found in the alphabet are under consideration - punctuation, spacing and numbers are not to be considered.

Use the text files provided as if the entirety of the file were written by the authors.

Only consider American English vowels.

Treat y as a consonant.

Consider all text in attached files, including license, title page, non-English words with English vowels.

<br>

***

<br>

## Question 4
Find the sum of the following data:


zero
drei
zwanzig
roku
quatre
six
hachi
eleven
ocho
neuf
sieben
sept
jyu
gunter
gleiben
glauchen
globen
ascii

<br>

***

<br>

## Question 5
Supposing you are dealt cards from the eight decks of cards in the order listed in the attached file.

If the dealer could potentially start dealing from any point among the 8 decks of cards, how many different possible ways could you be dealt consecutive cards which sum to 21?



Notes

Cards are represented as follows:

J = Jack (10 pts.)
Q = Queen (10 pts.)
K = King (10 pts.)
A = Ace (1 or 11 pts.)

A number represents a card of the same numeric value.
You are the only player receiving cards.
You will keep taking cards until your hand reaches or exceeds 21.



Example

For the following smaller deck of cards: J4K7AQ39
There are 3 ways to get 21 from this set:
Starting from card 2: 4K7
Starting with card 4: 7AQ3
Starting with card 5: AQ
