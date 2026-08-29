package z5;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
public final class r implements DialogInterface.OnClickListener {
    public final int f50667a;
    public final Intent f50668b;
    public final Object f50669c;

    public r(Intent intent, Object obj, int i10) {
        this.f50667a = i10;
        this.f50668b = intent;
        this.f50669c = obj;
    }

    public final void a() {
        switch (this.f50667a) {
            case 0:
                Intent intent = this.f50668b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f50669c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f50668b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.f50669c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
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
