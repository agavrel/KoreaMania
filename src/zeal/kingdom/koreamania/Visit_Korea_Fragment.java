package zeal.kingdom.koreamania;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;




import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageListener;


import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Visit_Korea_Fragment extends Fragment {

	public Visit_Korea_Fragment(){}
	

	private String url = "http://www.iqmalt.com/css/img/chosun100.png";
	private Button makeRequest;
	private ImageView imageView;
	private RequestQueue queue;
	private ImageLoader imageLoader;
	private ImageListener imageListener;
	
	@Override
	 public void onAttach(final Activity activity) {
	        super.onAttach(activity);
	        VolleyLog.sDebug = true;
	queue = ((VolleyCaptechApplication)activity.getApplication()).getQueue();
	imageLoader = ((VolleyCaptechApplication)activity.getApplication()).getImageLoader();
	 }
	 
	
   
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
           Bundle savedInstanceState) {
		
        final View rootView = inflater.inflate(R.layout.fragment_visit_korea, container, false);
		makeRequest = (Button)rootView.findViewById(R.id.makeRequest);
		imageView = (ImageView)rootView.findViewById(R.id.imageLoader);
		
	
		 
		imageListener = ImageLoader.getImageListener(imageView, R.drawable.a1, R.drawable.a1_error);
		
		makeRequest.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				
				imageLoader.get(url, imageListener);
			}
		});
		
		  return rootView;
	}
}
