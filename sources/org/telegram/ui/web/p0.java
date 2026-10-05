package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class p0 implements q0.a {
    public final int f42329a;
    public final w0 f42330b;
    public final PermissionRequest f42331c;
    public final String[] d;

    public p0(w0 w0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f42329a = i10;
        this.f42330b = w0Var;
        this.f42331c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42329a) {
            case 0:
                w0 w0Var = this.f42330b;
                if (w0Var.f42421a != null) {
                    w0Var.f42421a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42331c;
                    if (booleanValue) {
                        c1.a(w0Var.f42424e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new p0(w0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42330b;
                w0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f42331c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    w0Var2.f42424e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
