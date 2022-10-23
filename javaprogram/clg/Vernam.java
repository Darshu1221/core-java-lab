import java.lang.Math;
public class Vernam
{
public static void main(String[]args)
{
String text=new String("hello");
char[]arText=text.toCharArray();
String cipher=new String("XYZHG");
char[]arCipher=cipher.toCharArray();
char[]encoded=new char[5];
System.out.println("Encoded"+text+"to be...");
for(int i=0;i<arText.length;i++)
{
	encoded[i]=(char)(arText[i]^arCipher[i]);
	System.out.println(encoded[i]);
}
System.out.println("\n Decoded to be...");
for(int i=0;i<encoded.length;i++)
{
	char temp=(char)(encoded[i]^arCipher[i]);
	System.out.println(temp);
}
}
}