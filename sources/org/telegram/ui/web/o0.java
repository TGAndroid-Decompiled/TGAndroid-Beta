package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class o0 implements q0.a {
    public final int f44848a;
    public final u0 f44849b;
    public final PermissionRequest f44850c;
    public final String[] d;

    public o0(u0 u0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f44848a = i10;
        this.f44849b = u0Var;
        this.f44850c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f44848a) {
            case 0:
                u0 u0Var = this.f44849b;
                if (u0Var.f44900a != null) {
                    u0Var.f44900a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f44850c;
                    if (booleanValue) {
                        a1.a(u0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o0(u0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                u0 u0Var2 = this.f44849b;
                u0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f44850c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    u0Var2.e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
