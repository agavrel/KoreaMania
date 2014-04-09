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

public class AtTheRestaurant extends Fragment {
	
	public AtTheRestaurant(){}
	

	private MediaPlayer[] mediaplayarr = new MediaPlayer[10];;

	  
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
           Bundle savedInstanceState) {
		
        View rootView = inflater.inflate(R.layout.fragment_the_restaurant, container, false);


		
        final TextView tv = (TextView) rootView.findViewById(R.id.translation);      
        
        final CheckBox scb = (CheckBox)rootView.findViewById(R.id.sound_checkbox);
     
        mediaplayarr[0]=MediaPlayer.create(getActivity(), R.raw.bibimbap);
        mediaplayarr[1]=MediaPlayer.create(getActivity(), R.raw.water);
        mediaplayarr[2]=MediaPlayer.create(getActivity(), R.raw.bulgogi); 
        mediaplayarr[3]=MediaPlayer.create(getActivity(), R.raw.kalbi); 
        mediaplayarr[4]=MediaPlayer.create(getActivity(), R.raw.kimchi_is_there); 
        mediaplayarr[5]=MediaPlayer.create(getActivity(), R.raw.delicious); 
        mediaplayarr[6]=MediaPlayer.create(getActivity(), R.raw.one_more); 
        mediaplayarr[7]=MediaPlayer.create(getActivity(), R.raw.bibimbap2); 
        mediaplayarr[8]=MediaPlayer.create(getActivity(), R.raw.thank_you_formal); 
    	mediaplayarr[9]=MediaPlayer.create(getActivity(), R.raw.addition); 
        
        TextView tv1 = (TextView) rootView.findViewById(R.id.text1);
        tv1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv1)
            {     
                tv.setText(R.string.Restaurant1);    
             // play first sound
                
                if (scb.isChecked()) {
                 
           	 mediaplayarr[0].start(); 
                }       
            }                   
   });
        
        
        TextView tv2 = (TextView) rootView.findViewById(R.id.text2);
        tv2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv2)
            {     
                tv.setText(R.string.Restaurant2);    
             // ((TextView) tv1).setTextColor(0xFFCD7F32);
                
                if (scb.isChecked()) {
                	 
           	 	mediaplayarr[1].start(); 
                }       
            }                   
   });
            
        TextView tv3 = (TextView) rootView.findViewById(R.id.text3);
        tv3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv3)
            {     
                tv.setText(R.string.Restaurant3);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr[2].start(); 
                }       
            }                   
   });
        
        TextView tv4 = (TextView) rootView.findViewById(R.id.text4);
        tv4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv4)
            {     
                tv.setText(R.string.Restaurant4);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr[3].start(); 
                }       
            }                   
   });
        
        TextView tv5 = (TextView) rootView.findViewById(R.id.text5);
        tv5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv5)
            {     
                tv.setText(R.string.Restaurant5);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr[4].start(); 
                }       
            }                   
   });
        
        TextView tv6 = (TextView) rootView.findViewById(R.id.text6);
        tv6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv6)
            {     
                tv.setText(R.string.Restaurant6);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr[5].start(); 
                }       
            }                   
   });
        
        TextView tv7 = (TextView) rootView.findViewById(R.id.text7);
        tv7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv7)
            {     
                tv.setText(R.string.Restaurant7);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr[6].start(); 
                }       
            }                   
   });
        
        TextView tv8 = (TextView) rootView.findViewById(R.id.text8);
        tv8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv8)
            {     
                tv.setText(R.string.Restaurant8);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr[7].start(); 
                }       
            }                   
   });
        
        TextView tv9 = (TextView) rootView.findViewById(R.id.text9);
        tv9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv9)
            {     
                tv.setText(R.string.Restaurant9);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr[8].start(); 
                }       
            }                   
   });
        
        TextView tv10 = (TextView) rootView.findViewById(R.id.text10);
        tv10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View tv10)
            {     
                tv.setText(R.string.Restaurant10);                    
                if (scb.isChecked()) {
                	
           	 	mediaplayarr[9].start(); 
                }       
            }                   
   });
          
      
 
        
        
        
        return rootView;
    	
    }
		
}
