package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class q0 implements q0.a {
    public final int f42326a;
    public final w0 f42327b;
    public final GeolocationPermissions.Callback f42328c;
    public final String d;

    public q0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42326a = i10;
        this.f42327b = w0Var;
        this.f42328c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42326a) {
            case 0:
                w0 w0Var = this.f42327b;
                if (w0Var.f42409a != null) {
                    w0Var.f42409a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42328c;
                    String str = this.d;
                    if (booleanValue) {
                        c1.a(w0Var.f42412e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new q0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42327b;
                w0Var2.getClass();
                this.f42328c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.f42412e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
