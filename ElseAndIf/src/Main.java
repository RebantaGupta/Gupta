public class Main
{
    public static void main( String[] args )
    {
        int people = 30;
        int cars = 40;
        int buses = 15;


        if ( cars > people )
        {
            System.out.println( "We should take the cars." );
        }
        else if ( cars < people )
            //If the condition (cars > people) is false and (cars < people) is true then the block of code in 'else if' will output.
        {
            System.out.println( "We should not take the cars." );
        }
        else
            //If both the if and else if conditions are false then the else block of code will output.
        {
            System.out.println( "We can't decide." );
        }


        if ( buses > cars )
        {
            System.out.println( "That's too many buses." );
        }
        else if ( buses < cars )
            //If the condition (buses > cars) is false and (buses < cars) is true then the block of code in 'else if' will output.
        {
            System.out.println( "Maybe we could take the buses." );
        }
        else
            //If both the if and else if conditions are false then the else block of code will output.
        {
            System.out.println( "We still can't decide." );
        }


        if ( people > buses )
        {
            System.out.println( "All right, let's just take the buses." );
        }
        else
            //If both the if and condition is false then the else block of code will output.
        {
            System.out.println( "Fine, let's stay home then." );
        }


    }
}