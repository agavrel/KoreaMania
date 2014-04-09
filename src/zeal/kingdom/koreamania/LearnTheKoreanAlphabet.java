package zeal.kingdom.koreamania;

import zeal.kingdom.koreamania.R;
import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;

public class LearnTheKoreanAlphabet extends Fragment {


	final MediaPlayer[] mediaplayarr1 = new MediaPlayer[18];;
/*	String[] greetings = new String[8];; */
	  
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
           Bundle savedInstanceState) {
		
        View rootView = inflater.inflate(R.layout.fragment_learn_the_korean_alphabet, container, false);

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

		
        final TextView tv = (TextView) rootView.findViewById(R.id.translation);      
        
        final CheckBox scb = (CheckBox)rootView.findViewById(R.id.sound_checkbox);
        mediaplayarr1[0]=MediaPlayer.create(getActivity(), R.raw.a); 
        mediaplayarr1[1]=MediaPlayer.create(getActivity(), R.raw.e); 
        mediaplayarr1[2]=MediaPlayer.create(getActivity(), R.raw.i); 
        mediaplayarr1[3]=MediaPlayer.create(getActivity(), R.raw.o);
        mediaplayarr1[4]=MediaPlayer.create(getActivity(), R.raw.eo); 
        mediaplayarr1[5]=MediaPlayer.create(getActivity(), R.raw.ou); 
        mediaplayarr1[6]=MediaPlayer.create(getActivity(), R.raw.e_grave); 
        mediaplayarr1[7]=MediaPlayer.create(getActivity(), R.raw.e_aigu); 
        mediaplayarr1[8]=MediaPlayer.create(getActivity(), R.raw.ya); 
        mediaplayarr1[9]=MediaPlayer.create(getActivity(), R.raw.mi); 
    	mediaplayarr1[10]=MediaPlayer.create(getActivity(), R.raw.ni); 
    	mediaplayarr1[11]=MediaPlayer.create(getActivity(), R.raw.ti); 
    	mediaplayarr1[12]=MediaPlayer.create(getActivity(), R.raw.pi); 
    	mediaplayarr1[13]=MediaPlayer.create(getActivity(), R.raw.bi); 
    	mediaplayarr1[14]=MediaPlayer.create(getActivity(), R.raw.shi); 
    	mediaplayarr1[15]=MediaPlayer.create(getActivity(), R.raw.sa); 
    	mediaplayarr1[16]=MediaPlayer.create(getActivity(), R.raw.la); 
    	mediaplayarr1[17]=MediaPlayer.create(getActivity(), R.raw.ha); 
        
        
        TextView tv1 = (TextView) rootView.findViewById(R.id.text1);
        tv1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv1)
            {     
                tv.setText(R.string.AlphT1);    
             // play first sound
                
                if (scb.isChecked()) {
                
           	 mediaplayarr1[0].start(); 
                }       
            }                   
   });
        
        
        TextView tv2 = (TextView) rootView.findViewById(R.id.text2);
        tv2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv2)
            {     
                tv.setText(R.string.AlphT2);    
             // ((TextView) tv1).setTextColor(0xFFCD7F32);
                
                if (scb.isChecked()) {
                
           	 	mediaplayarr1[1].start(); 
                }       
            }                   
   });
            
        TextView tv3 = (TextView) rootView.findViewById(R.id.text3);
        tv3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv3)
            {     
                tv.setText(R.string.AlphT3);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr1[2].start(); 
                }       
            }                   
   });
        
        TextView tv4 = (TextView) rootView.findViewById(R.id.text4);
        tv4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv4)
            {     
                tv.setText(R.string.AlphT4);                    
                if (scb.isChecked()) {
                 
           	 	mediaplayarr1[3].start(); 
                }       
            }                   
   });
        
        TextView tv5 = (TextView) rootView.findViewById(R.id.text5);
        tv5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv5)
            {     
                tv.setText(R.string.AlphT5);                    
                if (scb.isChecked()) {
               
           	 	mediaplayarr1[4].start(); 
                }       
            }                   
   });
        
        TextView tv6 = (TextView) rootView.findViewById(R.id.text6);
        tv6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv6)
            {     
                tv.setText(R.string.AlphT6);                    
                if (scb.isChecked()) {
              
           	 	mediaplayarr1[5].start(); 
                }       
            }                   
   });
        
        TextView tv7 = (TextView) rootView.findViewById(R.id.text7);
        tv7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv7)
            {     
                tv.setText(R.string.AlphT7);                    
                if (scb.isChecked()) {
                
           	 	mediaplayarr1[6].start(); 
                }       
            }                   
   });
        
        TextView tv8 = (TextView) rootView.findViewById(R.id.text8);
        tv8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv8)
            {     
                tv.setText(R.string.AlphT8);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[7].start(); 
                }       
            }                   
   });
        
        TextView tv9 = (TextView) rootView.findViewById(R.id.text9);
        tv9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv9)
            {     
                tv.setText(R.string.AlphT9);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[8].start(); 
                }       
            }                   
   });
        
        TextView tv10 = (TextView) rootView.findViewById(R.id.text10);
        tv10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv10)
            {     
                tv.setText(R.string.AlphT10);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[9].start(); 
                }       
            }                   
   });
          
        TextView tv11 = (TextView) rootView.findViewById(R.id.text11);
        tv11.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv11)
            {     
                tv.setText(R.string.AlphT11);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[10].start(); 
                }       
            }                   
   });
        TextView tv12 = (TextView) rootView.findViewById(R.id.text12);
        tv12.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv12)
            {     
                tv.setText(R.string.AlphT12);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[11].start(); 
                }       
            }                   
   });
        TextView tv13 = (TextView) rootView.findViewById(R.id.text13);
        tv13.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv13)
            {     
                tv.setText(R.string.AlphT13);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[12].start(); 
                }       
            }                   
   });
        TextView tv14 = (TextView) rootView.findViewById(R.id.text14);
        tv14.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv14)
            {     
                tv.setText(R.string.AlphT14);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[13].start(); 
                }       
            }                   
   });
        TextView tv15 = (TextView) rootView.findViewById(R.id.text15);
        tv15.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv15)
            {     
                tv.setText(R.string.AlphT15);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[14].start(); 
                }       
            }                   
   });
        TextView tv16 = (TextView) rootView.findViewById(R.id.text16);
        tv16.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv16)
            {     
                tv.setText(R.string.AlphT16);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[15].start(); 
                }       
            }                   
   });
        TextView tv17 = (TextView) rootView.findViewById(R.id.text17);
        tv17.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv17)
            {     
                tv.setText(R.string.AlphT17);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[16].start(); 
                }       
            }                   
   });
        TextView tv18 = (TextView) rootView.findViewById(R.id.text18);
        tv18.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv18)
            {     
                tv.setText(R.string.AlphT18);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr1[17].start(); 
                }       
            }                   
   });
 
        
        
        
        return rootView;
    	
    }
		
}


	
 
       