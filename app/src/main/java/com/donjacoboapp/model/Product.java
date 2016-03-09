package com.donjacoboapp.model;

import com.donjacoboapp.R;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by cristhian.barros on 06/03/2016.
 */
public class Product {

    private String name;
    private int price;
    private String description;
    private boolean isSize = false;
    private String[] size;
    private int image;

    public static ArrayList<Product> listProduct;

    public Product(String name, String description, Integer price, Integer image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSize() {
        return isSize;
    }

    public void setIsSize(boolean isSize) {
        this.isSize = isSize;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public static ArrayList<Product> getAllProducts() {

        listProduct = new ArrayList<Product>();

        Product genovesa = new Product("Genovesa®", "Producto Original de Don Jacobo. Bizcochuelo bañado en leches y cubierto en chocolate rayado.",40000, R.drawable.genovesa);
        listProduct.add(genovesa);

        Product milkos = new Product("Milkos","Exquisita torta esponjosa de chocolate bañada en una cremosa malteada del mismo sabor, con una sabrosa cubierta de cacao y chocolate rayado forman la combinación perfecta.",42000, R.drawable.tres_leches_chocolatoso);
        listProduct.add(milkos);

        Product genovesaNociolle = new Product("Genovesa® Nocciole*","Crema de avellanas y chocolate. ¡Única! ¡Exclusiva! ¡La nueva sensación! ¡Tienes que probarla!\n \n Esta nueva torta reúne dos grandes  creaciones gastronómicas: la original GENOVESA® de Don Jacobo Postres y Ponqués y una deliciosa crema de avellanas y chocolate. Juntas se convierten en una delicia que hacen balance en dulzura y suavidad. La torta se complementa con un novedoso cereal recubierto en chocolate blanco y chocolate semiamargo (igualmente exclusivo de Don Jacobo Postres y Ponqués), cuya crocancia le da un toque adicional que hará de ésta la preferida de chicos y grandes.",44000,R.drawable.genovesa_nociello);
        listProduct.add(genovesaNociolle);

        Product cobitoGenovesa = new Product("Cobito® Genovesa", "Porción del Producto Original de Don Jacobo. Bizcochuelo bañado en leches y cubierto en chocolate rayado.", 8000, R.drawable.cobito_genovesa);
        listProduct.add(cobitoGenovesa);

        Product cobitoMilkos = new Product("Cobito® Milkos", "Delicioso pudín de chocolate remojado en malteada del mismo sabor.", 8000, R.drawable.cobitos_milkos);
        listProduct.add(cobitoMilkos);

        Product cobitoMedioDia = new Product("Cobito® Medio Día", "Delicioso pudín de vainilla y flan de leche recubierto con una capa de arequipe.", 8000, R.drawable.cobito_medio_dia);
        listProduct.add(cobitoMedioDia);

        Product cobitoMediaNoche = new Product("Cobito® Media Noche", "Porción de delicioso postre compuesto por una capa de flan napolitano y una capa de pudín de chocolate.\n \n Es perfecto para que lo disfrutes cuando quieras o para que le endulces el día a alguien especial.", 8000, R.drawable.cobito_media_noche);
        listProduct.add(cobitoMediaNoche);

        Product cobitoMaracuya = new Product("Cobito® Maracuyá","Porción de postre cremoso elaborado a base de maracuyá y crema de leche con una base de galleta en la mitad.\n \n Es perfecto para que lo disfrutes cuando quieras o para que le endulces el día a alguien especial.",8000, R.drawable.cobito_maracuya);
        listProduct.add(cobitoMaracuya);

        Product comboFiesta = new Product("Combo Fiesta", "Complemento perfecto para tus celebraciones!\n \n 16 a 20 Porciones.\n Incluye:  Gaseosa 2.5 lts, 15 vasos, 15 platos, 15 cucharas, Pasabocas Mixto Típico Colombiano 250gr \n \n 25 a 30 Porciones.\n Incluye:  Gaseosa 2.5 lts, 25 vasos, 25 platos, 25 cucharas, Pasabocas Mixto Típico Colombiano 250gr", 14500, R.drawable.combo_fiesta);
        listProduct.add(comboFiesta);

        Product jacobinoBaileys = new Product("Jacobino® Baileys","De las tortas húmedas la de más sabor.\n \n Este bizcocho esponjoso además de remojado en la exquisita tres leches de la genovesa Don Jacobo está saborizado con suave crema de whisky, uno de los mas novedosos sabores de la pastelería.", 42000 ,R.drawable.jacobino_baileys);
        listProduct.add(jacobinoBaileys);

        Product ensuenoFrutas = new Product("Ensueño Frutas", "Postres de 3 leches al horno con frutas en su interior (piña y manzana).\n Precaución: debe mantenerse refrigerado, no exponerse al sol durante mucho tiempo y consumir en el menor tiempo posible.", 29000, R.drawable.ensueno_de_frutas);
        listProduct.add(ensuenoFrutas);



        return listProduct;
    }
}
