package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class m0 implements q0.a {
    public final int f51227a;
    public final r0 f51228b;
    public final GeolocationPermissions.Callback f51229c;
    public final String d;

    public m0(r0 r0Var, GeolocationPermissions.Callback callback, String str, int i7) {
        this.f51227a = i7;
        this.f51228b = r0Var;
        this.f51229c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f51227a) {
            case 0:
                r0 r0Var = this.f51228b;
                if (r0Var.f51278a != null) {
                    r0Var.f51278a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f51229c;
                    String str = this.d;
                    if (booleanValue) {
                        x0.a(r0Var.f51281e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new m0(r0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                r0 r0Var2 = this.f51228b;
                r0Var2.getClass();
                this.f51229c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    r0Var2.f51281e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
