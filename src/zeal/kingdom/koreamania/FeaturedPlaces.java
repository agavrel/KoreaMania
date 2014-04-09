package zeal.kingdom.koreamania;

import zeal.kingdom.koreamania.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FeaturedPlaces extends Fragment {
	

	public FeaturedPlaces(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_featured_places, container, false);
         
        return rootView;
    }
	
	
	
	
	
	
}
