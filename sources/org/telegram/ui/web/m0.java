package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class m0 implements q0.a {
    public final int f51232a;
    public final r0 f51233b;
    public final GeolocationPermissions.Callback f51234c;
    public final String d;

    public m0(r0 r0Var, GeolocationPermissions.Callback callback, String str, int i7) {
        this.f51232a = i7;
        this.f51233b = r0Var;
        this.f51234c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f51232a) {
            case 0:
                r0 r0Var = this.f51233b;
                if (r0Var.f51283a != null) {
                    r0Var.f51283a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f51234c;
                    String str = this.d;
                    if (booleanValue) {
                        x0.a(r0Var.f51286e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new m0(r0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                r0 r0Var2 = this.f51233b;
                r0Var2.getClass();
                this.f51234c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    r0Var2.f51286e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
