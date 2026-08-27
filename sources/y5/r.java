package y5;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class r implements DialogInterface.OnClickListener {

    public final int f49684a;

    public final Intent f49685b;

    public final Object f49686c;

    public r(Intent intent, Object obj, int i10) {
        this.f49684a = i10;
        this.f49685b = intent;
        this.f49686c = obj;
    }

    public final void a() {
        switch (this.f49684a) {
            case 0:
                Intent intent = this.f49685b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f49686c).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f49685b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.f49686c).startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e9) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e9);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
