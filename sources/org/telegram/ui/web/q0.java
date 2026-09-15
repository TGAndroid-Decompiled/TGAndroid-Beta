package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class q0 implements q0.a {
    public final int f39065a;
    public final w0 f39066b;
    public final GeolocationPermissions.Callback f39067c;
    public final String d;

    public q0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f39065a = i10;
        this.f39066b = w0Var;
        this.f39067c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39065a) {
            case 0:
                w0 w0Var = this.f39066b;
                if (w0Var.f39145a != null) {
                    w0Var.f39145a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f39067c;
                    String str = this.d;
                    if (booleanValue) {
                        d1.a(w0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new q0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f39066b;
                w0Var2.getClass();
                this.f39067c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
