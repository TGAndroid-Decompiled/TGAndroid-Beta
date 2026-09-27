package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class q0 implements q0.a {
    public final int f39139a;
    public final w0 f39140b;
    public final GeolocationPermissions.Callback f39141c;
    public final String d;

    public q0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f39139a = i10;
        this.f39140b = w0Var;
        this.f39141c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39139a) {
            case 0:
                w0 w0Var = this.f39140b;
                if (w0Var.f39219a != null) {
                    w0Var.f39219a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f39141c;
                    String str = this.d;
                    if (booleanValue) {
                        c1.a(w0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new q0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f39140b;
                w0Var2.getClass();
                this.f39141c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
