package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class n0 implements q0.a {
    public final int f42609a;
    public final u0 f42610b;
    public final PermissionRequest f42611c;
    public final String[] d;

    public n0(u0 u0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f42609a = i10;
        this.f42610b = u0Var;
        this.f42611c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42609a) {
            case 0:
                u0 u0Var = this.f42610b;
                if (u0Var.f42698a != null) {
                    u0Var.f42698a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42611c;
                    if (booleanValue) {
                        a1.a(u0Var.f42701e.N, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new n0(u0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                u0 u0Var2 = this.f42610b;
                u0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f42611c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    u0Var2.f42701e.N.Q = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
