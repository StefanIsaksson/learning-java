package composite;

import org.junit.Test;

public class CompositeTest {

   @Test
   public void test(){

       AnimalGroup hominini = new AnimalGroup("Hominini", "tribe");

       AnimalGroup homo = new AnimalGroup("Homo","genus");
       homo.add(new Animal("Homo sapiens", "species", "200,000 years ago to present"));
       homo.add(new Animal("†Homo erectus", "species", "1.89 million to 143,000 years ago"));
       homo.add(new Animal("†Homo floresiensis", "species", "100,000 to 50,000 years ago"));
       homo.add(new Animal("†Homo habilis", "species", "2.4 to 1.4 million years ago"));
       hominini.add(homo);

       AnimalGroup pan = new AnimalGroup("Pan", "genus");
       pan.add(new Animal("Pan troglodytes", "species", "? to present"));
       pan.add(new Animal("Pan paniscus", "species", "? to present"));
       hominini.add(pan);

       AnimalGroup australopithecus = new AnimalGroup("†Australopithecus", "genus");
       australopithecus.add(new Animal("†Australopithecus anamensis", "species", "4.2 to 3.9 million years ago"));
       australopithecus.add(new Animal("†Australopithecus africanus", "species", "3.3 to 2.1 million years ago"));
       australopithecus.add(new Animal("†Australopithecus sediba", "species", "1.977 to 1.98 million years ago"));
       australopithecus.add(new Animal("†Ardipithecus kadabba", "species", "5.8 to 5.2 million years ago"));
       australopithecus.add(new Animal("†Australopithecus garhi", "species", "About 2.5 million years ago"));
       hominini.add(australopithecus);

       AnimalGroup sahelanthropus = new AnimalGroup("†Sahelanthropus","genus");
       sahelanthropus.add(new Animal("†Sahelanthropus tchadensis", "species", "About 7 million years ago"));
       hominini.add(sahelanthropus);

       AnimalGroup orrorin = new AnimalGroup("†Orrorin","genus");
       orrorin.add(new Animal("†Orrorin tugenensis", "species", "About 6.1 to 5.7 million years ago"));
       hominini.add(orrorin);

       AnimalGroup graecopithecus = new AnimalGroup("†Graecopithecus","genus");
       graecopithecus.add(new Animal("†Graecopithecus freybergi", "species", "About 7.2 million years ago"));
       hominini.add(graecopithecus);

       AnimalGroup homininae = new AnimalGroup("Homininae", "subfamily");
       homininae.add(hominini);

       AnimalGroup gorillini = new AnimalGroup("Gorillini", "tribe");
       AnimalGroup gorilla = new AnimalGroup("Gorilla", "genus");
       gorilla.add(new Animal("Gorilla gorilla", "species", "? to present"));
       gorilla.add(new Animal("Gorilla beringei", "species", "? to present"));
       gorillini.add(gorilla);

       AnimalGroup chororapithecus = new AnimalGroup("Chororapithecus", "genus");
       chororapithecus.add(new Animal("†Chororapithecus abyssinicus", "species", "About 8 million years ago"));
       gorillini.add(chororapithecus);


       homininae.add(gorillini);

       System.out.println(homininae);
   }
}
