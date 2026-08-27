package y5;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public final String f49641a;

    public final String f49642b;

    public final boolean f49643c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f49641a = str;
        l.f(str2);
        this.f49642b = str2;
        this.f49643c = z10;
    }

    public final Intent a(Context context) throws z {
        Bundle bundleCall;
        PendingIntent pendingIntent;
        Intent intent = null;
        String str = this.f49641a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f49643c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(d);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    } catch (RemoteException e9) {
                        e = e9;
                        Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    }
                    if (bundleCall == null && (intent = (Intent) bundleCall.getParcelable("serviceResponseIntentKey")) == null && (pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                        Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + str + " but has possible resolution");
                        throw new z(new v5.a(25, pendingIntent));
                    }
                    if (intent == null) {
                        Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException e11) {
                e = e11;
                bundleCall = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundleCall == null) {
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
                }
                if (intent == null) {
                    return new Intent(str).setPackage(this.f49642b);
                }
                return intent;
            } catch (IllegalArgumentException e12) {
                e = e12;
                bundleCall = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundleCall == null) {
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
                }
                if (intent == null) {
                    return new Intent(str).setPackage(this.f49642b);
                }
                return intent;
            }
        }
        if (intent == null) {
            return new Intent(str).setPackage(this.f49642b);
        }
        return intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return l.l(this.f49641a, g0Var.f49641a) && l.l(this.f49642b, g0Var.f49642b) && l.l(null, null) && this.f49643c == g0Var.f49643c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49641a, this.f49642b, null, 4225, Boolean.valueOf(this.f49643c)});
    }

    public final String toString() {
        String str = this.f49641a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
