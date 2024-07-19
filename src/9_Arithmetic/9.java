class nine
{
    public static void main(String a[]) 
    {
        byte b = 127;
        int d = 257;
        int c = 7;
        b = (byte)d; //CASTING: a to byte (understand you are losing information)
        //here, because d is too big to be stored as a byte, it will go through a modulus function 
        //(dvide d by range of byte = 256, then take remainder)

        d = c; //CONVERSION: just changin value, not type

        //another casting example:
        float f = 5.6f;
        int x = (int)f; //losing value, this will become 5.6 --> 5

        //now there are PROMOTIONS
        byte i = 10;
        byte j = 30;
        int result = i * j; //this will get promoted to int because it goes outside byte range

        System.out.println("Welcome to Types of Conversion and Casting!");
        System.out.println(b);
        System.out.println(d);
        System.out.println(x);
        System.out.println(result);

    }   
}
