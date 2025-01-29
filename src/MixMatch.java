public class MixMatch{
    public static void main(String[] args){
        String varString = "Kayla";
        char varChar = 'M';
        short varShort = 127;
        int varInt = 20;
        long varLong = 1255332L;
        float varFloat = 32.4f;
        double varDouble = 14.12653;
        boolean varBool = true;

        System.out.println(varString + " <- String, holds a string of characters");
        System.out.println(varChar + " <- Char, stores single characters.");
        System.out.println(varShort + " <- Short, stores numbers from -32,768 to 32,767.");
        System.out.println(varInt + " <- Integer, stores numbers from -2,147,483,648 to 2,147,483,647.");
        System.out.println(varLong + " <- Long, stores long numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");
        System.out.println(varFloat + " <- Float, stores upto 7 decimal digits.");
        System.out.println(varDouble + " <- Double, stores up to 15 decimal digit.");
        System.out.println(varBool + " <- Boolean, stores true or false.");

        System.out.println("This is int: " + varInt + ", Here's boolean: " + varBool + ", and this is char: " + varChar + ". ");
    }
}