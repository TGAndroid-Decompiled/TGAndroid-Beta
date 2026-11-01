package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class n0 implements q0.a {
    public final int f42944a;
    public final s0 f42945b;
    public final GeolocationPermissions.Callback f42946c;
    public final String d;

    public n0(s0 s0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42944a = i10;
        this.f42945b = s0Var;
        this.f42946c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42944a) {
            case 0:
                s0 s0Var = this.f42945b;
                if (s0Var.f42989a != null) {
                    s0Var.f42989a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42946c;
                    String str = this.d;
                    if (booleanValue) {
                        z0.a(s0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new n0(s0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var2 = this.f42945b;
                s0Var2.getClass();
                this.f42946c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    s0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
