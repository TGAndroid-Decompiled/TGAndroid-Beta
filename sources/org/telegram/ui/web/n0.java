package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class n0 implements q0.a {
    public final int f39586a;
    public final t0 f39587b;
    public final GeolocationPermissions.Callback f39588c;
    public final String d;

    public n0(t0 t0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f39586a = i10;
        this.f39587b = t0Var;
        this.f39588c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39586a) {
            case 0:
                t0 t0Var = this.f39587b;
                if (t0Var.f39663a != null) {
                    t0Var.f39663a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f39588c;
                    String str = this.d;
                    if (booleanValue) {
                        a1.a(t0Var.e.N, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new n0(t0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                t0 t0Var2 = this.f39587b;
                t0Var2.getClass();
                this.f39588c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    t0Var2.e.N.Q = true;
                    return;
                }
                return;
        }
    }
}
