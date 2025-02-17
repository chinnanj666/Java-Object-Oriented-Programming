package HeaderAndFooter;

class Word extends  Document {
    @Override
    public void headertype() {
        System.out.println("----------Header---------------");
    }

    @Override
    public void footerType() {
        System.out.println( "----------Footer---------------");
    }
}
