package com.pateo.lzx.logic;

public class ALogic
{
    public static void main(String[] args)
    {
        ALogic logic = new ALogic();
        System.out.println(logic.getTotal(3));
    }

    public int getTotal(int number)
    {
        if (number == 1)
        {
            return 1;
        }
        else if (number == 2)
        {
            return 1;
        }
        else
        {
            return number + getTotal(number - 1);
        }
    }



}
