package bstu.vt41.serdukov;

import lombok.Data;

import java.util.Scanner;

@Data
 abstract class Construction {
    int Cost;
    public abstract void init(Scanner scanner);
    }
abstract class House extends Construction {

    @Override
    public abstract void init(Scanner info);
}
@Data
class Restaurant extends Construction {
    private String restauranName, owner, type;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Enter the name of restaurent:");
        this.setRestauranName(scanner.next());
        System.out.println("Enter the name of owner:");
        this.setOwner(scanner.next());
        System.out.println("Enter the type of restaurent:");
        this.setType(scanner.next());
        System.out.println("Enter the cost of restaurent:");
        super.setCost(scanner.nextInt());
    }
}

@Data
class Hotel extends Construction {
    String owner, hotelName, material;

    @Override
    public void init(Scanner info) {
        System.out.println("Enter the name of owner:");
        this.setOwner(info.next());
        System.out.println("Enter the name of hotel:");
        this.setHotelName(info.next());
        System.out.println("Enter the type of the building material:");
        this.setMaterial(info.next());
        System.out.println("Enter the cost of hotel:");
        super.setCost(info.nextInt());
    }
}
@Data
class MultiStoryHouse extends Construction {
    private int floorNumber;
    private String material;

    @Override
    public void init(Scanner info) {
        System.out.println("Enter the number of house");
        this.setFloorNumber(info.nextInt());
        System.out.println("Enter the type of the building material");
        this.setMaterial(info.next());
        System.out.println("Enter the cost of build");
        super.setCost(info.nextInt());
    }
}

@Data
class PrivateHouse extends Construction {
    private int floorNumber;
    private String material, owner;

    @Override
    public void init(Scanner info) {
        System.out.println("Enter the number of house");
        this.setFloorNumber(info.nextInt());
        System.out.println("Enter the type of the building mterial");
        this.setMaterial(info.next());
        System.out.println("Enter the name of owner");
        this.setOwner(info.next());
        System.out.println("Enter the cost of build");
        super.setCost(info.nextInt());
    }
}
