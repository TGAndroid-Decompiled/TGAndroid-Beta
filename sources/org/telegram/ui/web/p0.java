package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f39174a;
    public final v0 f39175b;
    public final GeolocationPermissions.Callback f39176c;
    public final String d;

    public p0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f39174a = i10;
        this.f39175b = v0Var;
        this.f39176c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39174a) {
            case 0:
                v0 v0Var = this.f39175b;
                if (v0Var.f39222a != null) {
                    v0Var.f39222a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f39176c;
                    String str = this.d;
                    if (booleanValue) {
                        b1.a(v0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new p0(v0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f39175b;
                v0Var2.getClass();
                this.f39176c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
