public class ReverseString{
    public static void main(String args[]){

        String str="My name is Ajay yadav";
        String arr[]= str.split("\\s+");

        for(String value:arr)
        {
            for(int i=value.length()-1;i>=0;i--)
            {
                System.out.print(value.charAt(i));
            }
            System.out.print(" ");
        }
    }
}