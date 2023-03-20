public class Mamifer extends Animal{

    public String canisa;


    public void print(String canisa){
        System.out.println("Mamifer " + canisa);
    }

    @Override
    public boolean equals(Object obj) {
        return this.canisa.equals(((Mamifer)obj).canisa);
    }
}
