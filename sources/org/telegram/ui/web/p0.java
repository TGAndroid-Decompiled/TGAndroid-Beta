package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f44861a;
    public final u0 f44862b;
    public final GeolocationPermissions.Callback f44863c;
    public final String d;

    public p0(u0 u0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f44861a = i10;
        this.f44862b = u0Var;
        this.f44863c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f44861a) {
            case 0:
                u0 u0Var = this.f44862b;
                if (u0Var.f44900a != null) {
                    u0Var.f44900a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f44863c;
                    String str = this.d;
                    if (booleanValue) {
                        a1.a(u0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new p0(u0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                u0 u0Var2 = this.f44862b;
                u0Var2.getClass();
                this.f44863c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    u0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
