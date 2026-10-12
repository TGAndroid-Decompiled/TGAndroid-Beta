package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
public final class p0 implements q0.a {
    public final int f43370a;
    public final v0 f43371b;
    public final GeolocationPermissions.Callback f43372c;
    public final String d;

    public p0(v0 v0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.f43370a = i10;
        this.f43371b = v0Var;
        this.f43372c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43370a) {
            case 0:
                v0 v0Var = this.f43371b;
                if (v0Var.f43455a != null) {
                    v0Var.f43455a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f43372c;
                    String str = this.d;
                    if (booleanValue) {
                        b1.a(v0Var.f43458e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new p0(v0Var, callback, str, 1));
                        return;
                    } else {
                        callback.invoke(str, false, false);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f43371b;
                v0Var2.getClass();
                this.f43372c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    v0Var2.f43458e.Q.T = true;
                    return;
                }
                return;
        }
    }
}
