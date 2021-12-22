package com.example.android.recylerviewwithcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterClass adapter = new AdapterClass(dataQueues());
        recyclerView.setAdapter(adapter);
    }
    public ArrayList<DataModel> dataQueues()
    {
        ArrayList<DataModel> dataholder = new ArrayList<>();
        DataModel object1 = new DataModel();
        object1.setHeaderText("Mercedes Benz");
        object1.setDescriptionText("Luxirious Car");
        object1.setImgName(R.drawable.mercedes);
        dataholder.add(object1);

        DataModel object2 = new DataModel();
        object2.setHeaderText("Jaguar");
        object2.setDescriptionText("Dashing Interior");
        object2.setImgName(R.drawable.jaguarlogo);
        dataholder.add(object2);

        DataModel object3 = new DataModel();
        object3.setHeaderText("BMW");
        object3.setDescriptionText("Excellent Sportiness");
        object3.setImgName(R.drawable.bmwlogo);
        dataholder.add(object3);

        DataModel object4 = new DataModel();
        object4.setHeaderText("Range-Rover");
        object4.setDescriptionText("Exceptional Road Presence");
        object4.setImgName(R.drawable.rangerover);
        dataholder.add(object4);

        DataModel object5 = new DataModel();
        object5.setHeaderText("LandRover");
        object5.setDescriptionText("Awesome in OffRoading");
        object5.setImgName(R.drawable.landroerlogo);
        dataholder.add(object5);

        DataModel object6 = new DataModel();
        object6.setHeaderText("Lamborghini");
        object6.setDescriptionText("Pure Richness");
        object6.setImgName(R.drawable.lambologo);
        dataholder.add(object6);

        DataModel object7 = new DataModel();
        object7.setHeaderText("Rolls-Royce");
        object7.setDescriptionText("Classic Beauty");
        object7.setImgName(R.drawable.rollsroyce);
        dataholder.add(object7);

        DataModel object8 = new DataModel();
        object8.setHeaderText("Volvo");
        object8.setDescriptionText("Saftey First");
        object8.setImgName(R.drawable.volvo);
        dataholder.add(object8);

        DataModel object9 = new DataModel();
        object9.setHeaderText("Porsche");
        object9.setDescriptionText("Stylish Star");
        object9.setImgName(R.drawable.porschelogo);
        dataholder.add(object9);

        DataModel object10 = new DataModel();
        object10.setHeaderText("Mustang");
        object10.setDescriptionText("Totallly Sporty");
        object10.setImgName(R.drawable.mustanglogo);
        dataholder.add(object10);

        DataModel object11 = new DataModel();
        object11.setHeaderText("Tesla");
        object11.setDescriptionText("Revolutionary");
        object11.setImgName(R.drawable.teslalogo);
        dataholder.add(object11);

        DataModel object12 = new DataModel();
        object12.setHeaderText("Bentley");
        object12.setDescriptionText("Excelllence");
        object12.setImgName(R.drawable.bentleylogo);
        dataholder.add(object12);

        DataModel object13 = new DataModel();
        object13.setHeaderText("Toyota");
        object13.setDescriptionText("Sturdiness");
        object13.setImgName(R.drawable.toyota);
        dataholder.add(object13);

        return dataholder;
    }

}