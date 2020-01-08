package org.hala;

import org.hala.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product diapers = new Product(1,"Libero diapers","Extra soft size 2",88.90);
        Product diapers_copy = new Product(1,"Libero diapers","Extra soft size 2",88.90);
        Product diapers_refer_copy = diapers;

        System.out.println(diapers.equals(diapers_refer_copy));
        System.out.println(diapers == diapers_refer_copy);
        System.out.println(diapers.equals(diapers_copy));
        System.out.println(diapers == diapers_copy);
        System.out.println(diapers.hashCode() == diapers_copy.hashCode());

    }
}
