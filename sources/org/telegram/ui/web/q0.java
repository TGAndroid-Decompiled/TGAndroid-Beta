package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class q0 implements q0.a {
    public final int f42338a;
    public final w0 f42339b;
    public final GeolocationPermissions.Callback f42340c;
    public final String d;

    public q0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f42338a = i10;
        this.f42339b = w0Var;
        this.f42340c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42338a) {
            case 0:
                w0 w0Var = this.f42339b;
                if (w0Var.f42421a != null) {
                    w0Var.f42421a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f42340c;
                    String str = this.d;
                    if (booleanValue) {
                        c1.a(w0Var.f42424e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new q0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42339b;
                w0Var2.getClass();
                this.f42340c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.f42424e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
