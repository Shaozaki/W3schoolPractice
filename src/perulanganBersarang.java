public class perulanganBersarang {
    //Perulangan bersarang merupakan cara melakukan perulangan lain disebuah perulangan 
    public static void main(String[] args){
        //Perulangan bagian luar
        for(int i= 1; i <= 2; i++){
            System.out.println("Luaran" + i);
            //Perulangan bagian dalam
             for(int j=1; j<=3; j++){
                System.out.println("Daleman"+j);
            }
            }
        }
    }

