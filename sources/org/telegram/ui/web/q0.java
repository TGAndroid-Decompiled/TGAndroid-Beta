package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class q0 implements q0.a {
    public final int f43234a;
    public final v0 f43235b;
    public final GeolocationPermissions.Callback f43236c;
    public final String d;

    public q0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f43234a = i10;
        this.f43235b = v0Var;
        this.f43236c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43234a) {
            case 0:
                v0 v0Var = this.f43235b;
                if (v0Var.f43306a != null) {
                    v0Var.f43306a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f43236c;
                    String str = this.d;
                    if (booleanValue) {
                        b1.a(v0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new q0(v0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f43235b;
                v0Var2.getClass();
                this.f43236c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
