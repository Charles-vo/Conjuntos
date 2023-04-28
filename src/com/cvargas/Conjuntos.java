/* Practica de conjuntos
@author: Charles Vargas Ortiz
@mail: charles.vo@outlook.com
 */
package com.cvargas;

import java.util.*;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjuntos {

    public static void main(String[] args) {
	// write your code here
        List<Character> list = new ArrayList<>();
        char c;
        for(c = 'a'; c <= 'z'; ++c)
            list.add(c);
        Set<Character> A;
        A = new HashSet<>(list);

        Iterator<Character> i = list.iterator();
        while (i.hasNext()){
            i.next();
        }
        for (Object object: A){
            System.out.println(object);
        }

        Set <Integer> b = new HashSet<>();
        for (int x = 2; x <= 400; x++)
            if (x %2==0)
                b.add(x);

        Iterator<Integer> itr = b.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        int ln = -300;
        int ls = 100;

        Set<Integer> d = new HashSet<>();
        int x;
        for (x = ln; x < ls; x++)
            d.add(x);

        Iterator <Integer> it = d.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Set <Integer> interseccion = new HashSet<>(b);
        interseccion.retainAll(d);
        System.out.println("Interseccion de numeros naturales pares y enteros: "+interseccion);

        Iterator <Integer> inter = interseccion.iterator();
        while (inter.hasNext()){
            System.out.println(inter.next());
        }

        SortedSet <Integer> union = new TreeSet<>();
        union.addAll(b);
        union.addAll(d);
        System.out.println("Union de numeros naturales pares y enteros: "+union);

        Iterator <Integer> un = union.iterator();
        while (un.hasNext()){
            System.out.println(un.next());
        }


        SortedSet <Integer> sub = new TreeSet<>();



        int e;
        for (e = ln; e < ls; e++);


        sub.add(e);


        int p;
        for (p = 2; p == 400; p++)
            if (p % 2 == 0) ;

        sub.add(p);

        System.out.println(union);
        System.out.println("El subconjunto de los numeros naturales y los pares es : "+ union.subSet(0,100));

        

    }

       
}