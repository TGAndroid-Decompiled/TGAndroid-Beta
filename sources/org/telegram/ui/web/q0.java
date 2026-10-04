package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class q0 implements q0.a {
    public final int f42318a;
    public final w0 f42319b;
    public final GeolocationPermissions.Callback f42320c;
    public final String d;

    public q0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42318a = i10;
        this.f42319b = w0Var;
        this.f42320c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42318a) {
            case 0:
                w0 w0Var = this.f42319b;
                if (w0Var.f42401a != null) {
                    w0Var.f42401a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42320c;
                    String str = this.d;
                    if (booleanValue) {
                        c1.a(w0Var.f42404e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new q0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42319b;
                w0Var2.getClass();
                this.f42320c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.f42404e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
