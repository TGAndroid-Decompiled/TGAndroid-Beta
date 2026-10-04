package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class p0 implements q0.a {
    public final int f42309a;
    public final w0 f42310b;
    public final PermissionRequest f42311c;
    public final String[] d;

    public p0(w0 w0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f42309a = i10;
        this.f42310b = w0Var;
        this.f42311c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42309a) {
            case 0:
                w0 w0Var = this.f42310b;
                if (w0Var.f42401a != null) {
                    w0Var.f42401a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42311c;
                    if (booleanValue) {
                        c1.a(w0Var.f42404e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new p0(w0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42310b;
                w0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f42311c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    w0Var2.f42404e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
