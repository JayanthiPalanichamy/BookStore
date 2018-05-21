package main.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class BookStore {
    List<Integer> bookList;
    final static double cost = 8;

    public double calculateBasketCost(List <Integer> bookList) {
        this.bookList = bookList;
        double discountedCost =0.0;
        HashMap<Integer, Integer> bookHashMap = new HashMap<>();
        for (Integer book:bookList) {
           if(bookHashMap.containsKey(book)) {
               bookHashMap.put(book,bookHashMap.get(book) +1);
           }
           else {
               bookHashMap.put(book,1);
           }
        }

        int flag=0;
        int basketSize = 0;
        while(flag == 0) {
            flag=1;
            for (Integer book:bookHashMap.keySet()) {
                if(bookHashMap.get(book) !=0) {
                    basketSize++;
                    bookHashMap.put(book,bookHashMap.get(book)-1);
                }

            }
            switch (basketSize) {
                case 1 : {
                    discountedCost += cost;
                    break;
                }
                case 2 : {
                    discountedCost +=cost*2 -((cost*2*5)/100);
                    break;
                }
                case 3: {
                    discountedCost +=cost*3 -((cost*3*10)/100);
                    break;
                }
                case 4 : {
                    discountedCost +=cost*4 -((cost*4*20)/100);
                    break;
                }
                case 5 : {
                    discountedCost +=cost*5 -((cost*5*25)/100);
                    break;
                }
            }
            basketSize=0;
            for (Integer book:bookHashMap.keySet()) {
                if(bookHashMap.get(book) !=0) {
                flag = 0;
                break;
                }
            }

        }
        return discountedCost;
    }


}
