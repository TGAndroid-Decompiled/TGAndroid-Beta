package q6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class t implements DialogInterface.OnClickListener {
    public final Intent f53933a;
    public final GoogleApiActivity f53934b;

    public t(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f53933a = intent;
        this.f53934b = googleApiActivity;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                Intent intent = this.f53933a;
                if (intent != null) {
                    this.f53934b.startActivityForResult(intent, 2);
                }
            } catch (ActivityNotFoundException e10) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
