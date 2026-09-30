package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f39264a;
    public final v0 f39265b;
    public final GeolocationPermissions.Callback f39266c;
    public final String d;

    public p0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f39264a = i10;
        this.f39265b = v0Var;
        this.f39266c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39264a) {
            case 0:
                v0 v0Var = this.f39265b;
                if (v0Var.f39312a != null) {
                    v0Var.f39312a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f39266c;
                    String str = this.d;
                    if (booleanValue) {
                        b1.a(v0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new p0(v0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f39265b;
                v0Var2.getClass();
                this.f39266c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
