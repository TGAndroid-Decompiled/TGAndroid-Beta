package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class q0 implements q0.a {
    public final int f41466a;
    public final v0 f41467b;
    public final GeolocationPermissions.Callback f41468c;
    public final String d;

    public q0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f41466a = i10;
        this.f41467b = v0Var;
        this.f41468c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f41466a) {
            case 0:
                v0 v0Var = this.f41467b;
                if (v0Var.f41539a != null) {
                    v0Var.f41539a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f41468c;
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
                v0 v0Var2 = this.f41467b;
                v0Var2.getClass();
                this.f41468c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
