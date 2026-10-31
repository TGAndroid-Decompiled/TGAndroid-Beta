package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class n0 implements q0.a {
    public final int f43142a;
    public final s0 f43143b;
    public final GeolocationPermissions.Callback f43144c;
    public final String d;

    public n0(s0 s0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f43142a = i10;
        this.f43143b = s0Var;
        this.f43144c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43142a) {
            case 0:
                s0 s0Var = this.f43143b;
                if (s0Var.f43187a != null) {
                    s0Var.f43187a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f43144c;
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
                s0 s0Var2 = this.f43143b;
                s0Var2.getClass();
                this.f43144c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    s0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
