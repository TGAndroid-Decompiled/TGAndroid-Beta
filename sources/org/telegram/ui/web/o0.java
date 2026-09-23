package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class o0 implements q0.a {
    public final int f38795a;
    public final v0 f38796b;
    public final PermissionRequest f38797c;
    public final String[] d;

    public o0(v0 v0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f38795a = i10;
        this.f38796b = v0Var;
        this.f38797c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f38795a) {
            case 0:
                v0 v0Var = this.f38796b;
                if (v0Var.f38884a != null) {
                    v0Var.f38884a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f38797c;
                    if (booleanValue) {
                        b1.a(v0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o0(v0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f38796b;
                v0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f38797c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    v0Var2.e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
