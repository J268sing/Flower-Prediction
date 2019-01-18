package com.example.android.whichflower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class flowerslist extends AppCompatActivity {
    public ArrayList<String> allFlowers      = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowerslist);
        allFlowers.add("Fire Lily");
        allFlowers.add("Canterbury Bells");
        allFlowers.add("Bolero Deep Blue");
        allFlowers.add("Pink Primrose");
        allFlowers.add("Mexican Aster");
        allFlowers.add("Prince Of Wales Feathers");
        allFlowers.add("Moon Orchid");
        allFlowers.add("Globe-Flower");
        allFlowers.add("Grape Hyacinth");
        allFlowers.add("Corn Poppy");
        allFlowers.add("Toad Lily");
        allFlowers.add("Siam Tulip");
        allFlowers.add("Red Ginger");
        allFlowers.add("Spring Crocus");
        allFlowers.add("Alpine Sea Holly");
        allFlowers.add("Garden Phlox");
        allFlowers.add("Globe Thistle");
        allFlowers.add("Tiger Lily");
        allFlowers.add("Ball Moss");
        allFlowers.add("Love In The Mist");
        allFlowers.add("Monkshood");
        allFlowers.add("Blackberry Lily");
        allFlowers.add("Spear Thistle");
        allFlowers.add("Balloon Flower");
        allFlowers.add("Blanket Flower");
        allFlowers.add("King Protea");
        allFlowers.add("Oxeye Daisy");
        allFlowers.add("Yellow Iris");
        allFlowers.add("Cautleya Spicata");
        allFlowers.add("Carnation");
        allFlowers.add("Silverbush");
        allFlowers.add("Bearded Iris");
        allFlowers.add("Black-Eyed Susan");
        allFlowers.add("Windflower");
        allFlowers.add("Japanese Anemone");
        allFlowers.add("Giant White Arum Lily");
        allFlowers.add("Great Masterwort");
        allFlowers.add("Sweet Pea");
        allFlowers.add("Tree Mallow");
        allFlowers.add("Trumpet Creeper");
        allFlowers.add("Daffodil");
        allFlowers.add("Pincushion Flower");
        allFlowers.add("Hard-Leaved Pocket Orchid");
        allFlowers.add("Sunflower");
        allFlowers.add("Osteospermum");
        allFlowers.add("Tree Poppy");
        allFlowers.add("Desert-Rose");
        allFlowers.add("Bromelia");
        allFlowers.add("Magnolia");
        allFlowers.add("English Marigold");
        allFlowers.add("Bee Balm");
        allFlowers.add("Stemless Gentian");
        allFlowers.add("Mallow");
        allFlowers.add("Gaura");
        allFlowers.add("Lenten Rose");
        allFlowers.add("Marigold");
        allFlowers.add("Orange Dahlia");
        allFlowers.add("Buttercup");
        allFlowers.add("Pelargonium");
        allFlowers.add("Ruby-Lipped Cattleya");
        allFlowers.add("Hippeastrum");
        allFlowers.add("Artichoke");
        allFlowers.add("Gazania");
        allFlowers.add("Canna Lily");
        allFlowers.add("Peruvian Lily");
        allFlowers.add("Mexican Petunia");
        allFlowers.add("Bird Of Paradise");
        allFlowers.add("Sweet William");
        allFlowers.add("Purple Coneflower");
        allFlowers.add("Wild Pansy");
        allFlowers.add("Columbine");
        allFlowers.add("Colt's Foot");
        allFlowers.add("Snapdragon");
        allFlowers.add("Camellia");
        allFlowers.add("Fritillary");
        allFlowers.add("Common Dandelion");
        allFlowers.add("Poinsettia");
        allFlowers.add("Primula");
        allFlowers.add("Azalea");
        allFlowers.add("Californian Poppy");
        allFlowers.add("Anthurium");
        allFlowers.add("Morning Glory");
        allFlowers.add("Cape Flower");
        allFlowers.add("Bishop Of Llandaff");
        allFlowers.add("Pink-Yellow Dahlia");
        allFlowers.add("Clematis");
        allFlowers.add("Geranium");
        allFlowers.add("Thorn Apple");
        allFlowers.add("Barbeton Daisy");
        allFlowers.add("Bougainvillea");
        allFlowers.add("Sword Lily");
        allFlowers.add("Hibiscus");
        allFlowers.add("Lotus Lotus");
        allFlowers.add("Cyclamen");
        allFlowers.add("Foxglove");
        allFlowers.add("Frangipani");
        allFlowers.add("Rose");
        allFlowers.add("Watercress");
        allFlowers.add("Water Fily");
        allFlowers.add("Wallflower");
        allFlowers.add("Passion Flower");
        allFlowers.add("Petunia");

        final ListView listView = (ListView) findViewById(R.id.flowerslist);
        final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, allFlowers);
        listView.setAdapter(adapter);


    }
}
