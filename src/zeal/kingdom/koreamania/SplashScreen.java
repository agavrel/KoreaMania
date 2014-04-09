package zeal.kingdom.koreamania;

import zeal.kingdom.koreamania.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
 
public class SplashScreen extends Activity {
 
	
	
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2500;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
        
        // Animation to zoom my logo ;)
        ImageView img = (ImageView) findViewById(R.id.imgLogo);  
        Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump);
        img.startAnimation(hyperspaceJump);
        
   /*     
        
        Integer colorFrom = getResources().getColor(R.drawable.ic_launcher512_grey);
        Integer colorTo = getResources().getColor(R.drawable.ic_launcher512);
        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, colorTo);
        colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
            	imViewAndroid = (ImageView) findViewById(R.id.imgLogo);
            	imViewAndroid.setBackgroundColor((Integer)animator.getAnimatedValue());
            }

        });
        colorAnimation.start();
        
    */    
        
        
        
        
        
        
    
        new Handler().postDelayed(new Runnable() {
        	
 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
 
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
 
                // close this activity
                finish();
            }
                                  
        }, SPLASH_TIME_OUT);
        
        
        /*
        Color image to grayscale
        
       imViewAndroid = (ImageView) findViewById(R.id.imgLogo);
       imViewAndroid.setImageBitmap(grayScaleImage(BitmapFactory.decodeResource(           getResources(), R.drawable.ic_launcher512)));
   }
   public static Bitmap grayScaleImage(Bitmap src) {
    // constant factors
    double GS_RED = 0.299;
    double GS_GREEN = 0.587;
    double GS_BLUE = 0.114;
   
    // create output bitmap
    Bitmap bmOut = Bitmap.createBitmap(src.getWidth(), src.getHeight(), src.getConfig());
    // pixel information
    int A, R, G, B;
    int pixel;
   
    // get image size
    int width = src.getWidth();
    int height = src.getHeight();
   
    // scan through every single pixel
    for(int x = 0; x < width; ++x) {
     for(int y = 0; y < height; ++y) {
      // get one pixel color
      pixel = src.getPixel(x, y);
      // retrieve color of all channels
      A = Color.alpha(pixel);
      R = Color.red(pixel);
      G = Color.green(pixel);
      B = Color.blue(pixel);
      // take conversion up to one single value
      R = G = B = (int)(GS_RED * R + GS_GREEN * G + GS_BLUE * B);
      // set new pixel color to output bitmap
      bmOut.setPixel(x, y, Color.argb(A, R, G, B));
     }
    }
   
    // return final image
    return bmOut;     
    
   End of image to grayscale
    */  
     
     
    }
 
}