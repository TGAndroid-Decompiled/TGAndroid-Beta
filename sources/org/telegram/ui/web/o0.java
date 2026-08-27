package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;

public final class o0 implements q0.a {

    public final int f43924a;

    public final t0 f43925b;

    public final GeolocationPermissions.Callback f43926c;
    public final String d;

    public o0(t0 t0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f43924a = i10;
        this.f43925b = t0Var;
        this.f43926c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43924a) {
            case 0:
                t0 t0Var = this.f43925b;
                if (t0Var.f43999a != null) {
                    t0Var.f43999a = null;
                    boolean zBooleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f43926c;
                    String str = this.d;
                    if (!zBooleanValue) {
                        callback.invoke(str, false, false);
                    } else {
                        z0.a(t0Var.f44002e.M, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new o0(t0Var, callback, str, 1));
                    }
                }
                break;
            default:
                t0 t0Var2 = this.f43925b;
                t0Var2.getClass();
                this.f43926c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    t0Var2.f44002e.M.P = true;
                }
                break;
        }
    }
}
