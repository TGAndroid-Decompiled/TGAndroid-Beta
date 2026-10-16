package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class r0 implements q0.a {
    public final int f41167a;
    public final w0 f41168b;
    public final GeolocationPermissions.Callback f41169c;
    public final String d;

    public r0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f41167a = i10;
        this.f41168b = w0Var;
        this.f41169c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f41167a) {
            case 0:
                w0 w0Var = this.f41168b;
                if (w0Var.f41240a != null) {
                    w0Var.f41240a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f41169c;
                    String str = this.d;
                    if (booleanValue) {
                        c1.a(w0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new r0(w0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f41168b;
                w0Var2.getClass();
                this.f41169c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
