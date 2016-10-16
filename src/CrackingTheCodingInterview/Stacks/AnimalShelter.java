package CrackingTheCodingInterview.Stacks;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by uaggara on 9/30/16.
 */
public class AnimalShelter {
    public static void main(String args[]){
        Animal an1 = new Animal("Jonty","Dog");
        Animal an2 = new Animal("Husky","Dog");
        Animal an3 = new Animal("Tommy","Dog");
        Animal an4 = new Animal("Laura","Cat");
        Animal an5 = new Animal("Billo","Cat");
        Animal an6 = new Animal("Bando","Cat");

        AnimalQueue animalQueue = new AnimalQueue();
        animalQueue.enqueue(an1);
        animalQueue.enqueue(an2);
        animalQueue.enqueue(an3);
        animalQueue.enqueue(an4);
        animalQueue.enqueue(an5);
        animalQueue.enqueue(an6);

        System.out.println(animalQueue.dequeueAny().getName());
        System.out.println(animalQueue.dequeueAny().getName());
        System.out.println(animalQueue.dequeueDog());
        System.out.println(animalQueue.dequeueCat());

        System.out.println(animalQueue.dequeueDog());
        System.out.println(animalQueue.dequeueCat());
        System.out.println(animalQueue.dequeueCat());
        System.out.println(animalQueue.dequeueAny()==null?null : animalQueue.dequeueAny().getName());



    }
}


class Animal{

    private String name;
    private String type;

    Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}



class AnimalQueue{

    Queue<Animal> queue = new LinkedList<>();



    public void enqueue(Animal animal){
        queue.add(animal);
    }

    public  Animal dequeueAny(){
        if(queue.isEmpty())
            return null;
        return queue.remove();
    }

    public String dequeueDog(){
        Queue<Animal> temp = new LinkedList<>();
        Animal an = new Animal();
        if(queue.isEmpty())
            return null;
        while(true){
            if (queue.isEmpty())
                break;

            an = queue.remove();

            if(an.getType().equalsIgnoreCase("Dog"))
                break;
            if(!queue.isEmpty())
                temp.add(an);
        }

        String dogName = an.getName();

        while(!queue.isEmpty()){
            temp.add(queue.remove());
        }

        while(!temp.isEmpty()){
            queue.add(temp.remove());
        }

        return dogName;

    }

    public String dequeueCat() {
        Queue<Animal> temp = new LinkedList<>();
        Animal an = new Animal();
        if (queue.isEmpty())
            return null;
        while (true) {
            if (queue.isEmpty())
                break;
            an = queue.remove();
            if (an.getType().equalsIgnoreCase("Cat"))
                break;
            if(!queue.isEmpty())
                temp.add(an);
        }

        String catName = an.getName();

        while (!queue.isEmpty()) {
            temp.add(queue.remove());
        }

        while (!temp.isEmpty()) {
            queue.add(temp.remove());
        }

        return catName;
    }

}

