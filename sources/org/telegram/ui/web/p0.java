package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f42744a;
    public final u0 f42745b;
    public final GeolocationPermissions.Callback f42746c;
    public final String d;

    public p0(u0 u0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42744a = i10;
        this.f42745b = u0Var;
        this.f42746c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42744a) {
            case 0:
                u0 u0Var = this.f42745b;
                if (u0Var.f42816a != null) {
                    u0Var.f42816a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42746c;
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
                u0 u0Var2 = this.f42745b;
                u0Var2.getClass();
                this.f42746c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    u0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
