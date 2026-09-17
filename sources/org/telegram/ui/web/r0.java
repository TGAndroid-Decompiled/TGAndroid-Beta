package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class r0 implements q0.a {
    public final int f42256a;
    public final w0 f42257b;
    public final GeolocationPermissions.Callback f42258c;
    public final String d;

    public r0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42256a = i10;
        this.f42257b = w0Var;
        this.f42258c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42256a) {
            case 0:
                w0 w0Var = this.f42257b;
                if (w0Var.f42298a != null) {
                    w0Var.f42298a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42258c;
                    String str = this.d;
                    if (booleanValue) {
                        d1.a(w0Var.f42301e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new r0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42257b;
                w0Var2.getClass();
                this.f42258c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.f42301e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
