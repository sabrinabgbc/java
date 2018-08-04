﻿public class CashMachine
{
    public void sortMoneyBill(double[] moneyBill)
    {
        int i, j;
        double helper;
        for (i = 0; i < moneyBill.length; i++)
        {
            for (j = 0; j < moneyBill.length - 1; j++)
            {
                if (moneyBill[j] < moneyBill[j + 1])
                {
                    helper = moneyBill[j];
                    moneyBill[j] = moneyBill[j + 1];
                    moneyBill[j + 1] = helper;
                }
            }
        }
    }

    public void BankDraft(double[] moneyBill, double value)
    {
        int[] moneyBillQuantity = new int[10];
        double valueBankDraft = value;
        double remainder = 0;

        System.out.println("");
        System.out.println("BankDraft with the value: " + valueBankDraft);

        for (var i = 0; i < moneyBill.length; i++)
        {
            if (value == moneyBill[i])
            { //se o value do BankDraft for igual ao value da nota
                moneyBillQuantity[i] += 1;
                value -= moneyBill[i];
            }
            else if (value >= moneyBill[i])
            { //se o value do saque for maior ou igual o da nota, adiciona essa nota para ser sacada
                moneyBillQuantity[i] += 1;
                value -= moneyBill[i];
            }
        }

        if (valueBankDraft - value != 0)
        {
            remainder = value;
            for (var j = 0; j < moneyBill.length; j++)
            {
                if (remainder == moneyBill[j])
                { //se o value do saque for igual ao value da nota
                    moneyBillQuantity[j] += 1;
                    remainder -= moneyBill[j];
                }
                else if (remainder >= moneyBill[j])
                { //se o value do saque for maior ou igual o da nota, adiciona essa nota para ser sacada
                    moneyBillQuantity[j] += 1;
                    remainder -= moneyBill[j];
                }
            }
        }
        else
        {
            remainder = value;
        }

        for (var i = 0; i < moneyBill.length; i++)
        {
        	System.out.println("Money bill: " + moneyBill[i]);
        	System.out.println("Quantity of money bill: " + moneyBillQuantity[i]);
        	System.out.println("");
        }
        System.out.println("Remainder: " + remainder);
    }
}
