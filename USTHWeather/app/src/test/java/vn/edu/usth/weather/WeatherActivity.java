package vn.edu.usth.weather;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.example.usthweather.R;

public class WeatherActivity extends AppCompatActivity{
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ForecastFragment ff = ForecastFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, ff).commit();
    }
        protected void onStart() {
            super.onStart();
            Log.i("Weather","onStart() called");
        }
        protected void onResume() {
            super.onResume();
            Log.i("Weather","onResume() called");
        }
        protected void onPause() {
            super.onPause();
            Log.i("Weather","onPause() called");
        }

        protected void onStop() {
            super.onStop();
            Log.i("Weather","onStop() called");
        }

        protected void onDestroy() {
            super.onDestroy();
            Log.i("Weather","onDestroy() called");
        }

        public void onCreate(Bundle savedInstanceState, PersistableBundle persistableBundle){
            super.onCreate(savedInstanceState, persistableBundle);
            Log.i("Weather","onCreate() called");

        }
    }

