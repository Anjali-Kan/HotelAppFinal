package com.example.yashwantramteke.hotelappfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class customize_a_breakfast extends AppCompatActivity {
    public String room,base,sauce,protein,soup,onioncheck,carrotcheck,babycorncheck,frenchbeanscheck,springonioncheck,beanssproutcheck,mushroomcheck,soupcheck;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customize_a_breakfast);
        room = "to be added";
        RadioGroup basegroup=(RadioGroup)findViewById(R.id.baseselect);
        basegroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.noodles:
                        base="Noodles";
                        Toast.makeText(getApplicationContext(),"Noodles selected",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.steamedrice:
                        base="Steamed Rice";
                        Toast.makeText(getApplicationContext(),"Steamed Rice selected",Toast.LENGTH_SHORT).show();
                        break;
                    case -1:
                        base="Default";
                        Toast.makeText(getApplicationContext(),"No base selected",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        RadioGroup saucegroup=(RadioGroup)findViewById(R.id.sauceselect);
        saucegroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rtc:
                        sauce="Red Thai Curry";
                        Toast.makeText(getApplicationContext(),"Red Thai Curry selected",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.gtc:
                        sauce="Green Thai Curry";
                        Toast.makeText(getApplicationContext(),"Green Thai Curry selected",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.schez:
                        sauce="Schezwan";
                        Toast.makeText(getApplicationContext(),"Schezwan selected",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.hcc:
                        sauce="Hot Crispy Garlic";
                        Toast.makeText(getApplicationContext(),"Hot Crispy Garlic selected",Toast.LENGTH_SHORT).show();
                        break;
                    case -1:
                        sauce="Default";
                        Toast.makeText(getApplicationContext(),"No sauce selected",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        RadioGroup proteingroup=(RadioGroup)findViewById(R.id.proteinselect);
        proteingroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.chicken:
                        protein="Chicken";
                        Toast.makeText(getApplicationContext(),"Chicken selected",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.paneer:
                        protein="Paneer";
                        Toast.makeText(getApplicationContext(),"Paneer selected",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.egg:
                        protein="Egg";
                        Toast.makeText(getApplicationContext(),"Egg selected",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.fish:
                        protein="Fish";
                        Toast.makeText(getApplicationContext(),"Fish selected",Toast.LENGTH_SHORT).show();
                        break;
                    case -1:
                        protein="Default";
                        Toast.makeText(getApplicationContext(),"No protein selected",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        CheckBox soupcheck = (CheckBox)findViewById(R.id.checksoup);
        soupcheck.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    soup="Add soup\n";
                    Toast.makeText(getApplicationContext(),"Soup added",Toast.LENGTH_SHORT).show();
                }

            }
        });

        CheckBox Onioncheck = (CheckBox)findViewById(R.id.checkonion);
        Onioncheck.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    onioncheck=" Onion";
                    Toast.makeText(getApplicationContext(),"Onion added",Toast.LENGTH_SHORT).show();
                }
                else
                    onioncheck="";
            }
        });

        CheckBox Carrotcheck = (CheckBox)findViewById(R.id.checkcarrot);
        Carrotcheck.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    carrotcheck=" Carrot";
                    Toast.makeText(getApplicationContext(),"Carrot added",Toast.LENGTH_SHORT).show();
                }
                else
                    carrotcheck="";
            }
        });

        CheckBox BCcheck = (CheckBox)findViewById(R.id.checkbabycorn);
        BCcheck.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    babycorncheck=" Baby Corn";
                    Toast.makeText(getApplicationContext(),"Baby Corn added",Toast.LENGTH_SHORT).show();
                }
                else
                    babycorncheck="";
            }
        });

        CheckBox SOcheck = (CheckBox)findViewById(R.id.checkspringonion);
        SOcheck.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    springonioncheck=" Spring Onion";
                    Toast.makeText(getApplicationContext(),"Spring Onion added",Toast.LENGTH_SHORT).show();
                }
                else
                    springonioncheck="";
            }
        });

        CheckBox bscheck = (CheckBox)findViewById(R.id.checkbeansprouts);
        bscheck.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    beanssproutcheck=" Beans Sprout";
                    Toast.makeText(getApplicationContext(),"Beans Sprout added",Toast.LENGTH_SHORT).show();
                }
                else
                    beanssproutcheck="";
            }
        });

        CheckBox mushcheck = (CheckBox)findViewById(R.id.checkmushroom);
        mushcheck.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mushroomcheck=" Mushroom";
                    Toast.makeText(getApplicationContext(),"Mushroom added",Toast.LENGTH_SHORT).show();
                }
                else
                    mushroomcheck="";
            }
        });

        Button order = (Button) findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mail = new Intent(Intent.ACTION_SENDTO);
                mail.setData(Uri.parse("mailto:abc@gmail.com"));
                mail.putExtra(Intent.EXTRA_SUBJECT,"Ramen Order");
                mail.putExtra(Intent.EXTRA_TEXT,"This is Ramen Order for Room No.: "+room+"\nOrder Summary:\n"+"Base: "+base+"\n"+"Sauce: "+sauce+"\n"+"Protein: "+protein+"\n"+"Vegetables: "+onioncheck+carrotcheck+babycorncheck+frenchbeanscheck+frenchbeanscheck+springonioncheck+beanssproutcheck+mushroomcheck+"\n"+soup);
                startActivity(Intent.createChooser(mail,"Send order..."));
            }
        });

    }
}
