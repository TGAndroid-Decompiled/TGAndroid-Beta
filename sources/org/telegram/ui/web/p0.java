package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f43430a;
    public final v0 f43431b;
    public final GeolocationPermissions.Callback f43432c;
    public final String d;

    public p0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f43430a = i10;
        this.f43431b = v0Var;
        this.f43432c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43430a) {
            case 0:
                v0 v0Var = this.f43431b;
                if (v0Var.f43515a != null) {
                    v0Var.f43515a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f43432c;
                    String str = this.d;
                    if (booleanValue) {
                        b1.a(v0Var.f43518e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new p0(v0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f43431b;
                v0Var2.getClass();
                this.f43432c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.f43518e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
