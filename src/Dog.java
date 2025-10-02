public class Dog implements Animal {
    @Override
    public String getAnimalArt(){
        return  "        \\   .\n" +
                "         \\  ..^____/\n" +
                "            `-. ___ )\n" +
                "              ||   ||\n";
    }

    @Override
    public String toString(){
        return "dog";
    }
    
}
