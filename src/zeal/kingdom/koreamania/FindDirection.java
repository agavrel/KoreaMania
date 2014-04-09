package zeal.kingdom.koreamania;

import java.util.Locale;

import zeal.kingdom.koreamania.R;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class FindDirection extends Fragment {
	
	public FindDirection(){}

	private Spinner spinner1 ;
	Context thiscontext;
    //int [] sounds;
    private MediaPlayer[] mediaplayarr2= new MediaPlayer[11];
     
   
    
    
/*	String[] greetings = new String[8];; */
	  
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
           Bundle savedInstanceState) {
				
		thiscontext = container.getContext();
        View rootView = inflater.inflate(R.layout.fragment_find_direction, container, false);
     // Now use the above view to populate the spinner.
        setSpinnerContent( rootView );
     

 /*       
        final RadioGroup group = (RadioGroup) rootView.findViewById(R.id.radioGroup);
     // layout params to use when adding each radio button
        LinearLayout.LayoutParams layoutParams = new RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.MATCH_PARENT,
                RadioGroup.LayoutParams.WRAP_CONTENT); 
        ArrayAdapter<String> adapter;
        greetings = getResources().getStringArray(R.array.greetings_item);
        for (int i = 0; i < greetings.length; i++){
          RadioButton newRadioButton = new RadioButton(this);
            String label = greetings[i]; 
	    newRadioButton.setText(label);
	    newRadioButton.setId(i);
	    radiogroup.addView(newRadioButton, layoutParams);
        }
    */

        
        /*sounds= new int[] {R.raw.bonjour,R.raw.my_name_is,R.raw.thank_you_formal,R.raw.you_re_welcome,
        		R.raw.nice_to_meet_u,R.raw.cya,R.raw.sorry,R.raw.sorry_formal,R.raw.long_time,R.raw.thank_you};
        mediaplayarr = MediaPlayer.create(getActivity(), sounds[0]);*/
    	
   		mediaplayarr2[0]=MediaPlayer.create(getActivity(), R.raw.excuse_me2);   
    	mediaplayarr2[1]=MediaPlayer.create(getActivity(), R.raw.speak_english); 
    	mediaplayarr2[2]=MediaPlayer.create(getActivity(), R.raw.where_is);
    	mediaplayarr2[3]=MediaPlayer.create(getActivity(), R.raw.where_is_metro); 
    	mediaplayarr2[4]=MediaPlayer.create(getActivity(), R.raw.where_is_line); 
    	mediaplayarr2[5]=MediaPlayer.create(getActivity(), R.raw.where_is_hotel); 
    	mediaplayarr2[6]=MediaPlayer.create(getActivity(), R.raw.show_map); 
    	mediaplayarr2[7]=MediaPlayer.create(getActivity(), R.raw.did_not_understand); 
    	mediaplayarr2[8]=MediaPlayer.create(getActivity(), R.raw.repeat_slowly);
    	mediaplayarr2[9]=MediaPlayer.create(getActivity(), R.raw.have_good_day); 
    	mediaplayarr2[10]=MediaPlayer.create(getActivity(), R.raw.not_sure); 
    	
        final TextView tv = (TextView) rootView.findViewById(R.id.greetings);              
        final CheckBox scb = (CheckBox)rootView.findViewById(R.id.sound_checkbox);
     
               
        // language translation choice
             
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
         
        	@Override
        	public void onItemSelected(AdapterView<?> id, View rootView,
                    int pos, long arg3) {
         
                        if (pos == 1) {
         
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "You have selected Spanish", Toast.LENGTH_SHORT)
                                    .show();
                            setLocale("sp");
                        } else if (pos == 2) {
         
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "You have selected Japanese", Toast.LENGTH_SHORT)
                                    .show();
                            setLocale("jp");
                        } else if (pos == 3) {
         
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "You have selected German", Toast.LENGTH_SHORT)
                                    .show();
                            setLocale("de");
                        }
         
                    }
         
        	 @Override
             public void onNothingSelected(AdapterView<?> arg0) {
                 // TODO Auto-generated method stub
                 Toast.makeText(getActivity().getApplicationContext(), "Nothing to select", Toast.LENGTH_LONG).show();
             }
         
                });
            
         
    
 
        
        TextView tv1 = (TextView) rootView.findViewById(R.id.text1);
        tv1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv1)
            {       
            	tv.setText(R.string.Direction1); 
             // play first sound               
                if (scb.isChecked()) {
             
           	 mediaplayarr2[0].start(); 
                }       
            }                   
   });
        
        
        
        
        TextView tv2 = (TextView) rootView.findViewById(R.id.text2);
        tv2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv2)
            {     
                tv.setText(R.string.Direction2);    
               
             // ((TextView) tv1).setTextColor(0xFFCD7F32);
                
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[1].start(); 
                }       
            }                   
   });
            
        TextView tv3 = (TextView) rootView.findViewById(R.id.text3);
        tv3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv3)
            {     
                tv.setText(R.string.Direction3);    
                 
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[2].start(); 
                }       
            }                   
   });
        
        TextView tv4 = (TextView) rootView.findViewById(R.id.text4);
        tv4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv4)
            {     
                tv.setText(R.string.Direction4);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[3].start(); 
                }       
            }                   
   });
        
        TextView tv5 = (TextView) rootView.findViewById(R.id.text5);
        tv5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv5)
            {     
                tv.setText(R.string.Direction5);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[4].start(); 
                }       
            }                   
   });
        
        TextView tv6 = (TextView) rootView.findViewById(R.id.text6);
        tv6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv6)
            {     
                tv.setText(R.string.Direction6);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[5].start(); 
                }       
            }                   
   });
        
        TextView tv7 = (TextView) rootView.findViewById(R.id.text7);
        tv7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv7)
            {     
                tv.setText(R.string.Direction7);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[6].start(); 
                }       
            }                   
   });
        
        TextView tv8 = (TextView) rootView.findViewById(R.id.text8);
        tv8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv8)
            {     
                tv.setText(R.string.Direction8);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[7].start(); 
                }       
            }                   
   });
        
        TextView tv9 = (TextView) rootView.findViewById(R.id.text9);
        tv9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv9)
            {     
                tv.setText(R.string.Direction9);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[8].start(); 
                }       
            }                   
   });
        
        TextView tv10 = (TextView) rootView.findViewById(R.id.text10);
        tv10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv10)
            {     
                tv.setText(R.string.Direction10);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[9].start(); 
                }       
            }                   
   });

        TextView tv11 = (TextView) rootView.findViewById(R.id.text11);
        tv11.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv11)
            {     
                tv.setText(R.string.Direction11);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr2[10].start(); 
                }       
            }                   
   });

       
      
        
        return rootView;
    	
    }
	
	 private void setSpinnerContent( View rootView )
	    {
	      spinner1 = (Spinner) rootView.findViewById( R.id.languages_spinner );
	      ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.LANG, android.R.layout.simple_spinner_item);
	      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	      spinner1.setAdapter( adapter );
	    }
	    
	 
    public void setLocale(String lang) {
        
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(getActivity(), GreetingsFragment.class);
        refresh.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(refresh);
    }

    
 
    
}