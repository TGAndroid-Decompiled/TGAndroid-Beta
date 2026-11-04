package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class m0 implements q0.a {
    public final int f50946a;
    public final q0 f50947b;
    public final GeolocationPermissions.Callback f50948c;
    public final String d;

    public m0(q0 q0Var, GeolocationPermissions.Callback callback, String str, int i3) {
        this.f50946a = i3;
        this.f50947b = q0Var;
        this.f50948c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f50946a) {
            case 0:
                q0 q0Var = this.f50947b;
                if (q0Var.f50993a != null) {
                    q0Var.f50993a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f50948c;
                    String str = this.d;
                    if (booleanValue) {
                        w0.a(q0Var.f50996e.R, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new m0(q0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                q0 q0Var2 = this.f50947b;
                q0Var2.getClass();
                this.f50948c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    q0Var2.f50996e.R.U = true;
                    return;
                }
                return;
        }
    }
}
