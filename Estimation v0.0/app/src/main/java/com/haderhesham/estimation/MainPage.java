package com.haderhesham.estimation;

import com.haderhesham.estimation.util.SystemUiHider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class MainPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_page);
        // Set up an instance of SystemUiHider to control the system UI for
        // this activity.

    }
    public void handleClick(View view) {
        ImageButton buttonClicked = (ImageButton) view;
        if(buttonClicked.getId()==R.id.whatsButton) {
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
        }
        else if(buttonClicked.getId()==R.id.newGameButton) {
            Intent intent = new Intent(this, NewGame.class);
            startActivity(intent);
        }
        else if(buttonClicked.getId()==R.id.settingsButton) {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        }
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

    }



}
