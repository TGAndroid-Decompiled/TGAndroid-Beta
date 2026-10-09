package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class o0 implements q0.a {
    public final int f43420a;
    public final v0 f43421b;
    public final PermissionRequest f43422c;
    public final String[] d;

    public o0(v0 v0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f43420a = i10;
        this.f43421b = v0Var;
        this.f43422c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43420a) {
            case 0:
                v0 v0Var = this.f43421b;
                if (v0Var.f43515a != null) {
                    v0Var.f43515a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f43422c;
                    if (booleanValue) {
                        b1.a(v0Var.f43518e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o0(v0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f43421b;
                v0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f43422c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    v0Var2.f43518e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
