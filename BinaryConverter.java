public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;

	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public String getBinary()
    {
        return binaryValue;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary
        String ans = "";
        int binNum = 128;
        int newVal = value;

        for(int i = 7; i > -1; i--)
        {
            if (newVal < binNum)
                ans+="0";
            else
            {
                newVal -= binNum;
                ans += "1";
            }
            binNum /= 2;
            
        }
        return "" + ans;
}
    public int toDecimal()
    {
    	//Convert the binary value to decimal
        int binNum = 1;
        int ans = 0;
        
        for(int i = 7; i > -1; i--)
        {
            if(binaryValue.charAt(i) == '1')
                ans += binNum;
            binNum*=2;
        }
        return ans;
    }


}