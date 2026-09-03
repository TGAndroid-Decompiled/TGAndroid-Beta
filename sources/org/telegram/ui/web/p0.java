package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f39552a;
    public final v0 f39553b;
    public final GeolocationPermissions.Callback f39554c;
    public final String d;

    public p0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f39552a = i10;
        this.f39553b = v0Var;
        this.f39554c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39552a) {
            case 0:
                v0 v0Var = this.f39553b;
                if (v0Var.f39629a != null) {
                    v0Var.f39629a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f39554c;
                    String str = this.d;
                    if (booleanValue) {
                        c1.a(v0Var.e.N, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new p0(v0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f39553b;
                v0Var2.getClass();
                this.f39554c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.e.N.Q = true;
                    return;
                }
                return;
        }
    }
}
