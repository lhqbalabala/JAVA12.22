import java.io.*;
public class exam2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileReader fileReader = new FileReader("C:/AuI18N/1.txt");
            FileWriter fileWriter = new FileWriter("C:/AuI18N/2.txt");
            br = new BufferedReader(fileReader);
            bw = new BufferedWriter(fileWriter);
            String str = null;
            while((str = br.readLine()) != null){
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(br != null){
                    br.close();
                }
                if(bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}