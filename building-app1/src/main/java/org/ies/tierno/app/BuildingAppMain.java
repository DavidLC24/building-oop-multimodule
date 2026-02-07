package org.ies.tierno.app;

import org.ies.tierno.app.BuildingApp1;
import org.ies.tierno.readers.ApartmentReader;
import org.ies.tierno.readers.BuildingReader;
import org.ies.tierno.readers.OwnerReader;

import java.util.Scanner;

public class BuildingAppMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var apartmentReader = new ApartmentReader(scanner, ownerReader);
        var buildingReader = new BuildingReader(scanner, apartmentReader);
        var buildingApp = new BuildingApp1(scanner, buildingReader);

        buildingApp.run();
    }
}
