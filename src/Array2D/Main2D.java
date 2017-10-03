package Array2D;

public class Main2D {
    public static void main(String[] args) {
        
        Object [][] data ={
            {"unyil"  ,"2019" ,"Laki"}, 
            {"Rony"   ,"2020" ,"Laki"},
            {"Tony"   ,"2016" ,"Laki"},
            {"Dony"   ,"2017" ,"Laki"},
            {"Tiffany","2021" ,"Perempuan"}
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 9, 4);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}
