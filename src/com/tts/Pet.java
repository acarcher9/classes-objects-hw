package com.tts;

//Create a Pet class
public class Pet {

    //  private fields
        private String name;
        private Integer age;
        private String location;
        private String type;

        //  constructors
    public Pet(String name, Integer age, String location, String type) {
            this.name = name;
            this.age = age;
            this.location = location;
            this.type = type;
        }

        //  the empty constructor
    public Pet() {

        }

        //  getters
//  name
        public String getName () {
            return name;
        }

        public Integer getAge () {
            return age;
        }

        public String getLocation () {
            return location;
        }

        public String getType () {
            return type;
        }

        // setters
        public void setName (String name){
            this.name = name;
        }

        public void setAge (Integer age){
            this.age = age;
        }

        public void setLocation (String location){
            this.location = location;
        }

        public void setType (String type){

            this.type = type;
        }

        Pet myCat = new Pet("Connie", 1, "Austin", "Domestic longhair");

    }





