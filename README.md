Market Store
Assignment

A market store offers to their clients three different types of discount cards: bronze, silver and gold. Each card stores information about its owner, the turnover for the previous month and the initial discount rate. With each card you can calculate the discount of the current purchase. In general this is done using the formula: valueOfPurchase * discountRate.

The bronze card comes with no discount rate if the turnover for the previous month is below $100. If it is between $100 and $300, the discount rate is 1%. And if it is above $300, the rate is 2.5%.

The silver card comes with an initial discount rate of 2%. In case, the turnover is above $300, the rate is 3.5%.

The gold card comes with an initial discount rate of 2%. The discount rate grows 1% for each $100 from the turnover, capping at 10%.

Your task is:

to write an object-oriented model of this market store system;
to create a class that contains method(s) that output the discount rate, the discount and the total purchase value;
in your application entry point:
create instances with sample data as shown in Example outputs section;
invoke method(s) to print the required information.
Example output
Bronze:
a. Mock data: turnover $0, purchase value $150;
b. Output:

Purchase value: $150.00

Discount rate: 0.0%

Discount: $0.00

Total: $150.00

Silver:
a. Mock data: turnover $600, purchase value $850;
b. Output:

Purchase value: $850.00

Discount rate: 3.5%

Discount: $29.75

Total: $820.25

Gold:
a. Mock data: turnover $1500, purchase value $1300;
b. Output:

Purchase value: $1300.00

Discount rate: 10.0%

Discount: $130.00

Total: $1170.00
