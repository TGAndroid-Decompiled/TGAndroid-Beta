package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class o0 implements q0.a {
    public final int f44127a;
    public final t0 f44128b;
    public final GeolocationPermissions.Callback f44129c;
    public final String d;

    public o0(t0 t0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f44127a = i10;
        this.f44128b = t0Var;
        this.f44129c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f44127a) {
            case 0:
                t0 t0Var = this.f44128b;
                if (t0Var.f44202a != null) {
                    t0Var.f44202a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f44129c;
                    String str = this.d;
                    if (booleanValue) {
                        z0.a(t0Var.f44205e.M, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new o0(t0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                t0 t0Var2 = this.f44128b;
                t0Var2.getClass();
                this.f44129c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    t0Var2.f44205e.M.P = true;
                    return;
                }
                return;
        }
    }
}
