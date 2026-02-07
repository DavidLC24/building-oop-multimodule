package org.ies.tierno;

import org.ies.tierno.BuildingMenuApp;
import org.ies.tierno.readers.ApartmentReader;
import org.ies.tierno.readers.BuildingReader;
import org.ies.tierno.readers.OwnerReader;

import java.util.Scanner;

public class BuildingMenuAppMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var apartmentReader = new ApartmentReader(scanner, ownerReader);
        var buildingReader = new BuildingReader(scanner, apartmentReader);
        var buildingApp = new BuildingMenuApp(buildingReader, scanner);

        buildingApp.run();
    }
}
