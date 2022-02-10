package filehandle;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class FileHandle1{
	public static void main(String[] args){
		
		System.out.println("Enter the choice");
		System.out.println("1. Create new file\n 2.Read a file \n 3. write to a file \n 4.Append to a file");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// TO CREATE A FILE
		
		
		if(n==1)
		{
		try{
		    File f1 =new File("D:\\Filef1.txt");
		    if(f1.createNewFile()){
			     System.out.println("file created");
		    }
		    else {
			     System.out.println("file already exist");
		     }
		}
		    
		    catch(IOException e)
			  {
				  System.out.println("an error occured");
				  e.printStackTrace();
			  }
		}
		    
		    // TO WRITE INTO A FILE
		else if(n==2)
		{
		try{
		    FileWriter wtr=new FileWriter("D:\\Filef1.txt");
			wtr.write("java is a programing language.");
			wtr.close();
			System.out.println("successfully wrote to the file");
		}
			catch(IOException e) {
				  System.out.println("an error occured");
				  e.printStackTrace();
			  }
		}
			// TO READ THE FILE
         else if(n==3){
			try{
		    File f1 =new File("D:\\Filef1.txt");
			Scanner scan =new Scanner(f1);
			while(scan.hasNextLine()) {
				String data=scan.nextLine();
				System.out.println(data);	
			}
			scan.close();
			}catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	  }
		else if (n==4){
			try{
			    FileWriter wtr=new FileWriter("D:\\Filef1.txt");
				wtr.write("java has a concept of file handlimg.");
				wtr.close();
				System.out.println("successfully appended to the file");
			}
				catch(IOException e){
					  System.out.println("an error occured");
					  e.printStackTrace();
				  }
			}
	}
}
