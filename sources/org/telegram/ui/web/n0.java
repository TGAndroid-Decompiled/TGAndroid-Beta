package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class n0 implements q0.a {
    public final int f43937a;
    public final s0 f43938b;
    public final GeolocationPermissions.Callback f43939c;
    public final String d;

    public n0(s0 s0Var, GeolocationPermissions.Callback callback, String str, int i9) {
        this.f43937a = i9;
        this.f43938b = s0Var;
        this.f43939c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43937a) {
            case 0:
                s0 s0Var = this.f43938b;
                if (s0Var.f44012a != null) {
                    s0Var.f44012a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f43939c;
                    String str = this.d;
                    if (booleanValue) {
                        y0.a(s0Var.f44015e.M, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new n0(s0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var2 = this.f43938b;
                s0Var2.getClass();
                this.f43939c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    s0Var2.f44015e.M.P = true;
                    return;
                }
                return;
        }
    }
}
