# ouput_desired_amount

Serge, the chef of the famous restaurant “Salt, Pepper & Garlic” is trying to obtain his first Michelin star. 
He has been informed that a secret expert plans to visit his restaurant this evening.

Even though the expert’s name hasn’t been disclosed, Serge is certain he knows which dish from the menu will be ordered as well as what the taste preferences of the expert are. 
Namely, the expert requires an extremely precise proportion of salt, pepper and garlic powder in his dish.

Serge keeps a set of bottles with mixtures of salt, pepper and garlic powder on a special shelf in the kitchen. 
For each bottle, he knows the exact amount of each of the ingredients in kilograms. 
Serge can combine any number of bottled mixtures (or just use one of them directly) to get a mixture of particular proportions needed for a certain dish.

Luckily, the absolute amount of a mixture that needs to be added to a dish is so small that you can assume that the amounts in the bottles will always be sufficient.
However, the numeric values describing the proportions may be quite large.

Serge would like to know whether it is possible to obtain the expert’s favourite mixture from the available bottles, 
and if so—what is the smallest possible number of bottles needed to achieve that.

Furthermore, the set of bottles on the shelf may change over time as Serge receives new ones or lends his to other chefs. 
So he would like to answer this question after each such change.


Input
The first row contains three non-negative integers Sf, Pf and Gf (0 ≤ Sf, Pf, Gf; 0 < Sf + Pf + Gf ≤ 106) describing the amount of salt, pepper and garlic powder in the expert’s favourite mixture. For any real α > 0, (αSf, αPf, αGf) also is an expert’s favourite mixture. In the second row, there is a positive integer N (number of changes on the shelf, N ≤ 100 000). You should assume that initially the shelf is empty. Each of the next N rows describes a single change on the shelf:

If a new bottle is added, the row contains capital letter A followed by three non-negative integers Si, Pi and Gi (0 ≤ Si, Pi, Gi; 0 < Si+Pi+Gi ≤ 106) describing the amount of salt, pepper and garlic powder in the added bottle. Added bottles are numbered consecutively by unique integers starting from 1, that is, the i-th bottle corresponds to the i-th added bottle in the input data.
If a particular bottle is removed from the shelf, the row contains capital letter R followed by the integer — the bottle number ri. All values ri in the removals are unique, ri never exceeds total number of bottles added thus far.


Output
Output N rows. The j-th row (1 ≤ j ≤ N) should contain the number xj, the smallest number of bottles needed to prepare a mixture with the expert’s favourite proportions of salt, pepper and garlic powder using the bottles available after the first j changes on the shelf, or 0 if it is not possible.
