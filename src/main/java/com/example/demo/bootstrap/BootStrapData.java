package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0 && productRepository.count() == 0 && outsourcedPartRepository.count() == 0) {
            OutsourcedPart thePart = null;

            OutsourcedPart basicDeck = new OutsourcedPart();
            basicDeck.setCompanyName("Acme Boards");
            basicDeck.setName("Basic Deck");
            basicDeck.setInv(20);
            basicDeck.setPrice(25.0);
            basicDeck.setId(100L);
            outsourcedPartRepository.save(basicDeck);

            OutsourcedPart signatureDeck = new OutsourcedPart();
            signatureDeck.setCompanyName("Tony Hawk Signature Series");
            signatureDeck.setName("Tony Hawk 180");
            signatureDeck.setInv(10);
            signatureDeck.setPrice(45.0);
            signatureDeck.setId(100L);
            outsourcedPartRepository.save(signatureDeck);

            OutsourcedPart santaCruzDeck = new OutsourcedPart();
            santaCruzDeck.setCompanyName("Santa Cruz");
            santaCruzDeck.setName("Classic Dot Deck");
            santaCruzDeck.setInv(15);
            santaCruzDeck.setPrice(60.0);
            santaCruzDeck.setId(100L);
            outsourcedPartRepository.save(santaCruzDeck);

            OutsourcedPart aceTruck = new OutsourcedPart();
            aceTruck.setCompanyName("Ace Trucks");
            aceTruck.setName("Classic Truck");
            aceTruck.setInv(15);
            aceTruck.setPrice(45.0);
            aceTruck.setId(100L);
            outsourcedPartRepository.save(aceTruck);

            OutsourcedPart thunderTruck = new OutsourcedPart();
            thunderTruck.setCompanyName("Thunder");
            thunderTruck.setName("Team Hollow Truck");
            thunderTruck.setInv(10);
            thunderTruck.setPrice(25.0);
            thunderTruck.setId(100L);
            outsourcedPartRepository.save(thunderTruck);

            OutsourcedPart bonesHawkWheel = new OutsourcedPart();
            bonesHawkWheel.setCompanyName("Bones");
            bonesHawkWheel.setName("SPF Hawk Tattoo Wheel");
            bonesHawkWheel.setInv(5);
            bonesHawkWheel.setPrice(40.0);
            bonesHawkWheel.setId(100L);
            outsourcedPartRepository.save(bonesHawkWheel);

            OutsourcedPart bonesSidecutWheel = new OutsourcedPart();
            bonesSidecutWheel.setCompanyName("Bones");
            bonesSidecutWheel.setName("Formula V5 Sidecut Wheels");
            bonesSidecutWheel.setInv(10);
            bonesSidecutWheel.setPrice(25.0);
            bonesSidecutWheel.setId(100L);
            outsourcedPartRepository.save(bonesSidecutWheel);

            OutsourcedPart miniWheel = new OutsourcedPart();
            miniWheel.setCompanyName("Mini Logo");
            miniWheel.setName("A-Cut Wheels");
            miniWheel.setInv(15);
            miniWheel.setPrice(20.0);
            miniWheel.setId(100L);
            outsourcedPartRepository.save(miniWheel);

            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("out test")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());

            Product basicSkateboard = new Product("basic board", 70.0, 10);
            productRepository.save(basicSkateboard);

            Product signatureSkateboard = new Product("Tony Hawk signature board", 130.0, 5);
            productRepository.save(signatureSkateboard);

            Product santaCruzSkateboard = new Product("Santa Cruz classic board", 125.0, 2);
            productRepository.save(santaCruzSkateboard);

            Product classicSkateboard = new Product("classic board", 90.0, 5);
            productRepository.save(classicSkateboard);

            Product cutwheelSkateboard = new Product("cutwheel board", 125.0, 1);
            productRepository.save(cutwheelSkateboard);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products" + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts" + partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
