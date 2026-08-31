package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class o0 implements q0.a {
    public final int f42653a;
    public final u0 f42654b;
    public final GeolocationPermissions.Callback f42655c;
    public final String d;

    public o0(u0 u0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42653a = i10;
        this.f42654b = u0Var;
        this.f42655c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42653a) {
            case 0:
                u0 u0Var = this.f42654b;
                if (u0Var.f42735a != null) {
                    u0Var.f42735a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42655c;
                    String str = this.d;
                    if (booleanValue) {
                        a1.a(u0Var.f42738e.N, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new o0(u0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                u0 u0Var2 = this.f42654b;
                u0Var2.getClass();
                this.f42655c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    u0Var2.f42738e.N.Q = true;
                    return;
                }
                return;
        }
    }
}
