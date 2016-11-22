package com.joshmcarthur.spotifylauncher;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

public class LauncherActivity extends Activity {
    @Override
    protected void onResume() {
        super.onResume();
        PackageManager packageManager = this.getPackageManager();
        try {
            Intent spotifyPackageIntent = packageManager.getLaunchIntentForPackage("com.spotify.music");
            if (spotifyPackageIntent == null) { throw new RuntimeException(getString(R.string.missing_spotify)); }
            this.startActivity(spotifyPackageIntent);
        } catch (Exception exp) {
            Toast.makeText(this, exp.getLocalizedMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
