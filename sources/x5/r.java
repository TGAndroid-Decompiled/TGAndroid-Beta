package x5;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class r implements DialogInterface.OnClickListener {
    public final int f48967a;
    public final Intent f48968b;
    public final Object f48969c;

    public r(Intent intent, Object obj, int i9) {
        this.f48967a = i9;
        this.f48968b = intent;
        this.f48969c = obj;
    }

    public final void a() {
        switch (this.f48967a) {
            case 0:
                Intent intent = this.f48968b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f48969c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f48968b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.f48969c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i9) {
        try {
            try {
                a();
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
