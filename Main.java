public class Main {
    public static void main(String[] args) {
        CatLover hu1 = new CatLover("Pol", 20);
        DogLover hu2 = new DogLover("Piter", 25);
        DogLover hu3 = new DogLover("Mira", 30);
        CatLover hu4 = new CatLover("Volandemort", 40);

        PetAnimal pet1 = new Dog("Rock", 5);
        PetAnimal pet2 = new Cat("Gav", 1);

        ((CatLover) hu1).callPetAnimal(pet1);
        ((CatLover) hu4).callPetAnimal(pet2);
        ((DogLover) hu2).callPetAnimal(pet1);
        ((DogLover) hu3).callPetAnimal(pet2);
    }
}
