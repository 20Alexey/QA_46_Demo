package experiments;

public class Exeptions {
    public static void main(String[] args) {
        String[] strArray={"str1","str2"}

        System.out.println("============");
        pause();
        System.out.println("Ura");

    }

    private static void ucheckedEsxception(String[] strArray){
        try{
        for ( i=0; i<5; i ++)
         {
            System.out.println(strArray[i]);

        }catch(Exception e){
            e.getSrackTraece();
                System.out.println("");
            }
    }
    private static void pause()  {
        try {
            checkedExeptions();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static  void  checkedExeptions() throws InterruptedException {
        Thread.sleep(3000);
    }
}
