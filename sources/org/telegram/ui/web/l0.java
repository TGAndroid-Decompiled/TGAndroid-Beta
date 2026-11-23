package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class l0 implements q0.a {
    public final int f53192a;
    public final p0 f53193b;
    public final GeolocationPermissions.Callback f53194c;
    public final String d;

    public l0(p0 p0Var, GeolocationPermissions.Callback callback, String str, int i7) {
        this.f53192a = i7;
        this.f53193b = p0Var;
        this.f53194c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f53192a) {
            case 0:
                p0 p0Var = this.f53193b;
                if (p0Var.f53238a != null) {
                    p0Var.f53238a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f53194c;
                    String str = this.d;
                    if (booleanValue) {
                        v0.a(p0Var.f53241e.R, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new l0(p0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                p0 p0Var2 = this.f53193b;
                p0Var2.getClass();
                this.f53194c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    p0Var2.f53241e.R.U = true;
                    return;
                }
                return;
        }
    }
}
