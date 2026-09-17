package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class p0 implements q0.a {
    public final int f38899a;
    public final w0 f38900b;
    public final PermissionRequest f38901c;
    public final String[] d;

    public p0(w0 w0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f38899a = i10;
        this.f38900b = w0Var;
        this.f38901c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f38899a) {
            case 0:
                w0 w0Var = this.f38900b;
                if (w0Var.f38988a != null) {
                    w0Var.f38988a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f38901c;
                    if (booleanValue) {
                        d1.a(w0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new p0(w0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f38900b;
                w0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f38901c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    w0Var2.e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
