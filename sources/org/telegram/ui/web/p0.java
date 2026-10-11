package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f43620a;
    public final v0 f43621b;
    public final GeolocationPermissions.Callback f43622c;
    public final String d;

    public p0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f43620a = i10;
        this.f43621b = v0Var;
        this.f43622c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43620a) {
            case 0:
                v0 v0Var = this.f43621b;
                if (v0Var.f43705a != null) {
                    v0Var.f43705a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f43622c;
                    String str = this.d;
                    if (booleanValue) {
                        b1.a(v0Var.f43708e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new p0(v0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f43621b;
                v0Var2.getClass();
                this.f43622c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.f43708e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
