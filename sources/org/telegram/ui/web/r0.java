package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class r0 implements q0.a {
    public final int f42255a;
    public final w0 f42256b;
    public final GeolocationPermissions.Callback f42257c;
    public final String d;

    public r0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42255a = i10;
        this.f42256b = w0Var;
        this.f42257c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42255a) {
            case 0:
                w0 w0Var = this.f42256b;
                if (w0Var.f42297a != null) {
                    w0Var.f42297a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42257c;
                    String str = this.d;
                    if (booleanValue) {
                        d1.a(w0Var.f42300e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new r0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42256b;
                w0Var2.getClass();
                this.f42257c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.f42300e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
