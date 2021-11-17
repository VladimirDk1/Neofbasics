package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNumber {

    HashMap<String,User> user = new HashMap<>();

    public void addNewUser(String n){
        user.putIfAbsent(n, new User(n));
    }

    public void addNumUser(String name, String number){
        User us = user.get(name);
        us.addNum(number);
    }

    public void getNum(String name){
        Set<String> str = user.keySet();
        String n = str.toString();
        String n1 = n.substring(1, n.length()-1);
        String[] users = n1.split(", ");

        ArrayList<String> NU = new ArrayList<>();

        String nameUs = "";
        User us;

        Pattern pattern = Pattern.compile(".*" + name + ".*");
        for(int i = 0; i < users.length; i++){
            Matcher matcher = pattern.matcher(users[i]);
            while (matcher.find()){
                int start = matcher.start();
                int end = matcher.end();
                nameUs = users[i].substring(start, end);
                NU.add(nameUs);
            }
        }

        for (String strr: NU
             ) {
            System.out.println("Номера пользователя: " + strr);
            us = user.get(strr);
            us.getNum();
        }
    }


    class User{
        String nameUser;
        HashSet<String> numb = new HashSet<>();

        public User(String name){
            this.nameUser = name;
        }

        public String addNum(String number){
            String str = "Номер не добавлен";
            boolean bool = numb.add(number);
            if (bool == true)
                str = "Номер добавлен";
            return str;
        }

        public void getNum(){
            for (String str: numb) {
                System.out.println(str);
            }
        }
    }
}

