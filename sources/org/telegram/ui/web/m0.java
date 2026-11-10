package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class m0 implements q0.a {
    public final int f51174a;
    public final r0 f51175b;
    public final GeolocationPermissions.Callback f51176c;
    public final String d;

    public m0(r0 r0Var, GeolocationPermissions.Callback callback, String str, int i7) {
        this.f51174a = i7;
        this.f51175b = r0Var;
        this.f51176c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f51174a) {
            case 0:
                r0 r0Var = this.f51175b;
                if (r0Var.f51225a != null) {
                    r0Var.f51225a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f51176c;
                    String str = this.d;
                    if (booleanValue) {
                        x0.a(r0Var.f51228e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new m0(r0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                r0 r0Var2 = this.f51175b;
                r0Var2.getClass();
                this.f51176c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    r0Var2.f51228e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
