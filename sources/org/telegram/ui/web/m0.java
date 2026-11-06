package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class m0 implements q0.a {
    public final int f51240a;
    public final r0 f51241b;
    public final GeolocationPermissions.Callback f51242c;
    public final String d;

    public m0(r0 r0Var, GeolocationPermissions.Callback callback, String str, int i7) {
        this.f51240a = i7;
        this.f51241b = r0Var;
        this.f51242c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f51240a) {
            case 0:
                r0 r0Var = this.f51241b;
                if (r0Var.f51289a != null) {
                    r0Var.f51289a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f51242c;
                    String str = this.d;
                    if (booleanValue) {
                        x0.a(r0Var.f51292e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new m0(r0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                r0 r0Var2 = this.f51241b;
                r0Var2.getClass();
                this.f51242c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    r0Var2.f51292e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
