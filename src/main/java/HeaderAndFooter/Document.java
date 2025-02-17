package HeaderAndFooter;

abstract class Document {
    public  void  printTheFormate(){
        headertype();
        System.out.println("The document contant\n hewliwhef wejkhf askj asadf  UFH ");
        footerType();
    }
    public  abstract  void headertype();
    public abstract  void  footerType();
}
