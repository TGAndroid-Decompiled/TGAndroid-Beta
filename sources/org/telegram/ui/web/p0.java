package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f43432a;
    public final v0 f43433b;
    public final GeolocationPermissions.Callback f43434c;
    public final String d;

    public p0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f43432a = i10;
        this.f43433b = v0Var;
        this.f43434c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43432a) {
            case 0:
                v0 v0Var = this.f43433b;
                if (v0Var.f43517a != null) {
                    v0Var.f43517a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f43434c;
                    String str = this.d;
                    if (booleanValue) {
                        b1.a(v0Var.f43520e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new p0(v0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f43433b;
                v0Var2.getClass();
                this.f43434c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.f43520e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
