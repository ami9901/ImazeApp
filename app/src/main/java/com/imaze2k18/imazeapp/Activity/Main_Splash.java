package com.imaze2k18.imazeapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.imaze2k18.imazeapp.R;


/**
 * Created by ranjit on 24-05-2017.
 */

public class Main_Splash extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 4000;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__splash);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
//                DatabaseHandler db = new DatabaseHandler(getApplicationContext());
//                if (db.getData()==false) {
//                    insert_data();
//                }

                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }


//    //data insert
//    private void insert_data() {
//        DatabaseHandler db = new DatabaseHandler(this);
//        db.deleteContact();
//        Log.d("Insert: ", "Inserting ..");
//        //data for alphabets
//        db.adddata(new Data("apple", "A For Apple","alphabets"));
//        db.adddata(new Data("bee", "B For Bee","alphabets"));
//        db.adddata(new Data("cow", "C For Cow","alphabets"));
//        db.adddata(new Data("dog", "D For Dog","alphabets"));
//        db.adddata(new Data("egg", "E For Egg","alphabets"));
//        db.adddata(new Data("fire", "F For Fire","alphabets"));
//        db.adddata(new Data("goose", "G For Goose","alphabets"));
//        db.adddata(new Data("horse", "H For Horse","alphabets"));
//        db.adddata(new Data("icecream", "I For Icecream","alphabets"));
//        db.adddata(new Data("juice", "J For Juice","alphabets"));
//        db.adddata(new Data("kite", "K For Kite","alphabets"));
//        db.adddata(new Data("leaf", "L For Leaf","alphabets"));
//        db.adddata(new Data("monkey", "M For Monkey","alphabets"));
//        db.adddata(new Data("net", "N For Net","alphabets"));
//        db.adddata(new Data("octopus", "O For Octopus","alphabets"));
//        db.adddata(new Data("pig", "P For Pig","alphabets"));
//        db.adddata(new Data("queen", "Q For Queen","alphabets"));
//        db.adddata(new Data("rabbit", "R For Rabbit","alphabets"));
//        db.adddata(new Data("sheep", "S For Sheep","alphabets"));
//        db.adddata(new Data("truck", "T For Truck","alphabets"));
//        db.adddata(new Data("umbrella", "U For Umbrella","alphabets"));
//        db.adddata(new Data("van", "V For Van","alphabets"));
//        db.adddata(new Data("watermelon", "W For Watermelon","alphabets"));
//        db.adddata(new Data("fax", "X For Fax","alphabets"));
//        db.adddata(new Data("yellow", "Y For Yellow","alphabets"));
//        db.adddata(new Data("zebra", "Z For Zebra","alphabets"));
//
//        //data for numbers
//        db.adddata(new Data("one", "One","numbers"));
//        db.adddata(new Data("two", "Two","numbers"));
//        db.adddata(new Data("three", "Three","numbers"));
//        db.adddata(new Data("four", "Four","numbers"));
//        db.adddata(new Data("five", "Five","numbers"));
//        db.adddata(new Data("six", "Six","numbers"));
//        db.adddata(new Data("seven", "Seven","numbers"));
//        db.adddata(new Data("eight", "Eight","numbers"));
//        db.adddata(new Data("nine", "Nine","numbers"));
//        db.adddata(new Data("ten", "Ten","numbers"));
//        db.adddata(new Data("eleven", "Eleven","numbers"));
//        db.adddata(new Data("twelve", "Twelve","numbers"));
//        db.adddata(new Data("thirteen", "Thirteen","numbers"));
//        db.adddata(new Data("fourteen", "Fourteen","numbers"));
//        db.adddata(new Data("fifteen", "Fifteen","numbers"));
//        db.adddata(new Data("sixteen", "Sixteen","numbers"));
//        db.adddata(new Data("seventeen", "Seventeen","numbers"));
//        db.adddata(new Data("eighteen", "Eighteen","numbers"));
//        db.adddata(new Data("nineteen", "Nineteen","numbers"));
//        db.adddata(new Data("twenty", "Twenty","numbers"));
//
//        //data for animals
//        db.adddata(new Data("cow_p", "Cow","animals"));
//        db.adddata(new Data("dog_p", "Dog","animals"));
//        db.adddata(new Data("cat", "Cat","animals"));
//        db.adddata(new Data("sheep_p", "Sheep","animals"));
//        db.adddata(new Data("hourse", "Horse","animals"));
//        db.adddata(new Data("lion", "Lion","animals"));
//        db.adddata(new Data("camel", "Camel","animals"));
//        db.adddata(new Data("monkey_p", "Monkey","animals"));
//        db.adddata(new Data("rabbit_p", "Rabbit","animals"));
//        db.adddata(new Data("bear", "Bear","animals"));
//        db.adddata(new Data("camel", "Camel","animals"));
//        db.adddata(new Data("deer", "Deer","animals"));
//        db.adddata(new Data("elephant", "Elephant","animals"));
//        db.adddata(new Data("fox", "Fox","animals"));
//        db.adddata(new Data("hippo", "Hippo","animals"));
//        db.adddata(new Data("kangaroo", "Kangaroo","animals"));
//        db.adddata(new Data("panda", "Panda","animals"));
//        db.adddata(new Data("pig", "Pig","animals"));
//        db.adddata(new Data("rhino", "Rhino","animals"));
//        db.adddata(new Data("turtle", "Turtle","animals"));
//        db.adddata(new Data("wolf", "Wolf","animals"));
//
//
//
//        //data for seasons
//        db.adddata(new Data("autumn", "Autumn","seasons"));
//        db.adddata(new Data("spring", "Spring","seasons"));
//        db.adddata(new Data("summer", "Summer","seasons"));
//        db.adddata(new Data("winter", "Winter","seasons"));
//
//        //data for birds
//        db.adddata(new Data("pigeon", "Pigeon","birds"));
//        db.adddata(new Data("sparrow", "Sparrow","birds"));
//        db.adddata(new Data("duck", "Duck","birds"));
//        db.adddata(new Data("crow", "Crow","birds"));
//        db.adddata(new Data("crane", "Crane","birds"));
//        db.adddata(new Data("bulbul", "Bulbul","birds"));
//        db.adddata(new Data("cock", "Cock","birds"));
//        db.adddata(new Data("eagle", "Eagle","birds"));
//        db.adddata(new Data("flamingo", "Flamingo","birds"));
//        db.adddata(new Data("hen", "Hen","birds"));
//        db.adddata(new Data("ostrich", "Ostrich","birds"));
//        db.adddata(new Data("parrot", "Parrot","birds"));
//        db.adddata(new Data("peacock", "Peacock","birds"));
//        db.adddata(new Data("penguin", "Penguin","birds"));
//        db.adddata(new Data("robin", "Robin","birds"));
//        db.adddata(new Data("swan", "Swan","birds"));
//
//        //data for fruits
//        db.adddata(new Data("banana", "Banana","fruits"));
//        db.adddata(new Data("grapes", "Grapes","fruits"));
//        db.adddata(new Data("orange", "Orange","fruits"));
//        db.adddata(new Data("strawberry", "Strawberry","fruits"));
//        db.adddata(new Data("watermelon_p", "Watermelon","fruits"));
//        db.adddata(new Data("apricot", "Apricot","fruits"));
//        db.adddata(new Data("blackberry", "Blackberry","fruits"));
//        db.adddata(new Data("kiwi", "Kiwi","fruits"));
//        db.adddata(new Data("pear", "Pear","fruits"));
//        db.adddata(new Data("pineapple", "Pineapple","fruits"));
//        db.adddata(new Data("plum", "Plum","fruits"));
//        db.adddata(new Data("raspberry", "Raspberry","fruits"));
//        db.adddata(new Data("carambola", "Carambola","fruits"));
//        db.adddata(new Data("cherimoya", "Cherimoya","fruits"));
//        db.adddata(new Data("cherry", "Cherry","fruits"));
//        db.adddata(new Data("guava", "Guava","fruits"));
//        db.adddata(new Data("honeydew", "Honeydew","fruits"));
//        db.adddata(new Data("lychee", "Lychee","fruits"));
//        db.adddata(new Data("papaya", "Papaya","fruits"));
//        db.adddata(new Data("peach", "Peach","fruits"));
//        db.adddata(new Data("pomegrante", "Pomegrante","fruits"));
//        db.adddata(new Data("sugarcane", "Sugarcane","fruits"));
//
//        //data for bodyparts
//        db.adddata(new Data("body", "Body","bodyparts"));
//        db.adddata(new Data("hand", "Hand","bodyparts"));
//        db.adddata(new Data("foot", "Foot","bodyparts"));
//        db.adddata(new Data("eyes", "Eyes","bodyparts"));
//        db.adddata(new Data("ear", "Ear","bodyparts"));
//        db.adddata(new Data("arm", "Arm","bodyparts"));
//        db.adddata(new Data("head", "Head","bodyparts"));
//        db.adddata(new Data("mouth", "Mouth","bodyparts"));
//        db.adddata(new Data("nose", "Nose","bodyparts"));
//        db.adddata(new Data("ankle", "Ankle","bodyparts"));
//        db.adddata(new Data("chest", "Chest","bodyparts"));
//        db.adddata(new Data("elbow", "Elbow","bodyparts"));
//        db.adddata(new Data("fist", "Fist","bodyparts"));
//        db.adddata(new Data("hair", "Hair","bodyparts"));
//        db.adddata(new Data("knee", "Knee","bodyparts"));
//        db.adddata(new Data("leg", "Leg","bodyparts"));
//        db.adddata(new Data("lips", "Lips","bodyparts"));
//        db.adddata(new Data("neck", "Neck","bodyparts"));
//        db.adddata(new Data("teeth", "Teeth","bodyparts"));
//        db.adddata(new Data("tongue", "Tongue","bodyparts"));
//
//
//        //data for days
//        db.adddata(new Data("sunday", "Sunday","days"));
//        db.adddata(new Data("monday", "Monday","days"));
//        db.adddata(new Data("tuesday", "Tuesday","days"));
//        db.adddata(new Data("wednesday", "Wednesday","days"));
//        db.adddata(new Data("thursday", "Thursday","days"));
//        db.adddata(new Data("friday", "Friday","days"));
//        db.adddata(new Data("saturday", "Saturday","days"));
//
//        //data for vehicles
//        db.adddata(new Data("motorbike", "Motorbike","vehicles"));
//        db.adddata(new Data("car", "Car","vehicles"));
//        db.adddata(new Data("tractor", "Tractor","vehicles"));
//        db.adddata(new Data("bus", "Bus","vehicles"));
//        db.adddata(new Data("lorry", "Lorry","vehicles"));
//        db.adddata(new Data("train", "Train","vehicles"));
//        db.adddata(new Data("aeroplane", "Aeroplane","vehicles"));
//        db.adddata(new Data("bicycle", "Bicycle","vehicles"));
//        db.adddata(new Data("boat", "Boat","vehicles"));
//        db.adddata(new Data("ship", "Ship","vehicles"));
//        db.adddata(new Data("submarine", "Submarine","vehicles"));
//        db.adddata(new Data("balloon", "Balloon","vehicles"));
//        db.adddata(new Data("helicopter", "Helicopter","vehicles"));
//        db.adddata(new Data("rocket", "Rocket","vehicles"));
//        db.adddata(new Data("wagon", "Wagon","vehicles"));
//
//        //data for vegetables
//        db.adddata(new Data("tomato", "Tomato","vegetables"));
//        db.adddata(new Data("eggplant", "Eggplant","vegetables"));
//        db.adddata(new Data("corn", "Corn","vegetables"));
//        db.adddata(new Data("carrot", "Carrot","vegetables"));
//        db.adddata(new Data("potato", "Potato","vegetables"));
//        db.adddata(new Data("onion", "Onion","vegetables"));
//        db.adddata(new Data("cucumber", "Cucumber","vegetables"));
//        db.adddata(new Data("cabbage", "Cabbage","vegetables"));
//        db.adddata(new Data("broccoli", "Broccoli","vegetables"));
//        db.adddata(new Data("beetroot", "Beetroot","vegetables"));
//        db.adddata(new Data("bottlegourd", "Bottlegourd","vegetables"));
//        db.adddata(new Data("cauliflower", "Cauliflower","vegetables"));
//        db.adddata(new Data("garlic", "Garlic","vegetables"));
//        db.adddata(new Data("mushroom", "Mushroom","vegetables"));
//        db.adddata(new Data("okra", "Okra","vegetables"));
//        db.adddata(new Data("peas", "Peas","vegetables"));
//        db.adddata(new Data("pumpkins", "Pumpkins","vegetables"));
//        db.adddata(new Data("spinach", "Spinach","vegetables"));
//        db.adddata(new Data("sweetpotatoes", "Sweetpotatoes","vegetables"));
//        db.adddata(new Data("turnips", "Turnips","vegetables"));
//
//        //data for colors
//        db.adddata(new Data("red", "Red","colors"));
//        db.adddata(new Data("blue", "Rlue","colors"));
//        db.adddata(new Data("green", "Green","colors"));
//        db.adddata(new Data("orange_p", "Orange","colors"));
//        db.adddata(new Data("black", "Black","colors"));
//        db.adddata(new Data("brown", "Brown","colors"));
//        db.adddata(new Data("peach", "Peanch","colors"));
//        db.adddata(new Data("grey", "Gray","colors"));
//        db.adddata(new Data("pink", "Pink","colors"));
//        db.adddata(new Data("purple", "Purple","colors"));
//        db.adddata(new Data("white", "White","colors"));
//        db.adddata(new Data("yellow_p", "Yellow","colors"));
//
//        //data for months
//        db.adddata(new Data("january", "January","months"));
//        db.adddata(new Data("february", "February","months"));
//        db.adddata(new Data("march", "March","months"));
//        db.adddata(new Data("april", "April","months"));
//        db.adddata(new Data("may", "May","months"));
//        db.adddata(new Data("june", "June","months"));
//        db.adddata(new Data("july", "July","months"));
//        db.adddata(new Data("august", "August","months"));
//        db.adddata(new Data("september", "September","months"));
//        db.adddata(new Data("october", "October","months"));
//        db.adddata(new Data("november", "november","months"));
//        db.adddata(new Data("december", "December","months"));
//
//        //data for shapes
//        db.adddata(new Data("circle", "Circle","shapes"));
//        db.adddata(new Data("triangle","Triangle","shapes"));
//        db.adddata(new Data("square", "Square","shapes"));
//        db.adddata(new Data("polygon", "Polygon","shapes"));
//        db.adddata(new Data("crescent", "Crescent","shapes"));
//        db.adddata(new Data("cross", "Cross","shapes"));
//        db.adddata(new Data("curvilinear_triangle", "Curvilinear Triangle","shapes"));
//        db.adddata(new Data("diamond", "Diamond","shapes"));
//        db.adddata(new Data("ellipse", "Ellipse","shapes"));
//        db.adddata(new Data("heart", "Heart","shapes"));
//        db.adddata(new Data("heptagon", "Heptagon","shapes"));
//        db.adddata(new Data("hexagon", "Hexagon","shapes"));
//        db.adddata(new Data("octagon", "Octagon","shapes"));
//        db.adddata(new Data("parallelogram", "Parallelogram","shapes"));
//        db.adddata(new Data("pentagon", "Pentagon","shapes"));
//        db.adddata(new Data("quatrefoil", "Quatrefoil","shapes"));
//        db.adddata(new Data("rectangle", "Rectangle","shapes"));
//        db.adddata(new Data("star", "Star","shapes"));
//        db.adddata(new Data("trapezium", "Trapezium","shapes"));
//        db.adddata(new Data("triangle", "Triangle","shapes"));
//
//        //data for sports
//        db.adddata(new Data("cricket", "Cricket","sports"));
//        db.adddata(new Data("football", "Football","sports"));
//        db.adddata(new Data("archery", "Archery","sports"));
//        db.adddata(new Data("baseball", "Baseball","sports"));
//        db.adddata(new Data("basketball", "Basketball","sports"));
//        db.adddata(new Data("cycling", "Cycling","sports"));
//        db.adddata(new Data("handball", "Handball","sports"));
//        db.adddata(new Data("hockey", "Hockey","sports"));
//        db.adddata(new Data("ice_skate", "Ice Skate","sports"));
//        db.adddata(new Data("polo", "Polo","sports"));
//        db.adddata(new Data("boxing", "Boxing","sports"));
//        db.adddata(new Data("golf", "Golf","sports"));
//        db.adddata(new Data("rugby", "Rugby","sports"));
//        db.adddata(new Data("scuba_diving", "Scuba Diving","sports"));
//        db.adddata(new Data("skateboard", "Skateboard","sports"));
//        db.adddata(new Data("sky", "Sky","sports"));
//        db.adddata(new Data("surf", "Surf","sports"));
//        db.adddata(new Data("swimming", "Swimming","sports"));
//        db.adddata(new Data("table_tennis", "Table_tennis","sports"));
//        db.adddata(new Data("tennis", "Tennis","sports"));
//        db.adddata(new Data("volleyball", "Volleyball","sports"));
//
//
//
////        L.t(getApplicationContext(),"INSERT SUCESS");
////        Data dt =db.getContact("numbers");
////        L.t(getApplicationContext(),dt.get_name()+"");
//
//    }
}
