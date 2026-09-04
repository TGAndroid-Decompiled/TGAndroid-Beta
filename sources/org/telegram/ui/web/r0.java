package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class r0 implements q0.a {
    public final int f42228a;
    public final w0 f42229b;
    public final GeolocationPermissions.Callback f42230c;
    public final String d;

    public r0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42228a = i10;
        this.f42229b = w0Var;
        this.f42230c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42228a) {
            case 0:
                w0 w0Var = this.f42229b;
                if (w0Var.f42270a != null) {
                    w0Var.f42270a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42230c;
                    String str = this.d;
                    if (booleanValue) {
                        d1.a(w0Var.f42273e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new r0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42229b;
                w0Var2.getClass();
                this.f42230c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.f42273e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
