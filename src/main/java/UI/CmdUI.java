package UI;

import characters.PC;
import enums.Archetype;
import enums.Race;
import enums.Skill;
import enums.Stat;

import java.io.*;
import java.util.EnumSet;
import java.util.HashMap;

public class CmdUI {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter;
        PrintWriter writer;

        PC character;
        String name;
        int age;
        Race race;
        Archetype archetype;

        System.out.print("Input name: ");
        name = reader.readLine();
        fileWriter = new FileWriter(name + ".txt", true);
        writer = new PrintWriter(fileWriter);

        System.out.print("Input age: ");
        while(true){
            try{
                age = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("Incorrect input please try again");
            }
        }


        EnumSet<Race> set =  EnumSet.allOf(Race.class);
        HashMap<Integer, Race> allRaces = new HashMap();
        int counter = 0;
        for (Race r: set ) {
            if(r != Race.NONE && r!=Race.MONSTER){
                allRaces.put(counter, r);
                System.out.println(counter + ". " + r);
                counter++;
            }
        }
        int raceChoice;
        while(true){
            System.out.print("Choose race (input correct number)");
            try{
                raceChoice = Integer.parseInt(reader.readLine());
                if(allRaces.containsKey(raceChoice)){
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Incorrect input please try again");
            }
        }
        race = allRaces.get(raceChoice);

        character = new PC(age, race);
        character.setName(name);

        EnumSet<Archetype> typeSet =  EnumSet.allOf(Archetype.class);
        HashMap<Integer, Archetype> allTypes = new HashMap();
        counter = 0;
        for (Archetype type: typeSet ) {
            allTypes.put(counter, type);
            System.out.println(counter + ". " + type);
            counter++;

        }
        int typeChoice;
        while(true){
            System.out.print("Choose archetype (input correct number)");
            try{
                typeChoice = Integer.parseInt(reader.readLine());
                if(allTypes.containsKey(typeChoice)){
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Incorrect input please try again");
            }
        }
        character.setArch(allTypes.get(typeChoice));

        int statPoints = 4 + character.getAgeVal();
        EnumSet<Stat> stats = EnumSet.allOf(Stat.class);
        HashMap<Integer, Stat> allStats = new HashMap();
        System.out.println(character.getAgeVal() + " is ageVal");
        while (true){
            counter = 0;
            for (Stat stat: stats ) {
                if(character.getStats().get(stat)<=4){
                    if(character.getStatCaps().get(stat)>character.getStats().get(stat)){
                        allStats.put(counter, stat);
                        System.out.println(counter + ". " + stat);
                        counter++;
                    }
                }
            }
            int skillChoice;
            while(true){
                System.out.print("Choose stat to increment by one");
                try{
                    skillChoice = Integer.parseInt(reader.readLine());
                    if(allStats.containsKey(skillChoice)){
                        character.getStats().put(allStats.get(skillChoice), character.getStats().get(allStats.get(skillChoice))+1);
                        statPoints--;
                        System.out.println(allStats.get(skillChoice) + "increased to " + character.getStats().get(allStats.get(skillChoice)));
                        break;
                    }
                } catch (NumberFormatException e){
                    System.out.println("Incorrect input please try again");
                }
            }
            if(statPoints<1) break;
        }




        writer.println(character);

        writer.close();
    }
}
