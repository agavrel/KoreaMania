package zeal.kingdom.koreamania;

import zeal.kingdom.koreamania.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TheSubway extends Fragment {
	
	public TheSubway(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_the_subway, container, false);
         
        return rootView;
    }
}
