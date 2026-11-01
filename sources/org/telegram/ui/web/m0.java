package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class m0 implements q0.a {
    public final int f42936a;
    public final s0 f42937b;
    public final PermissionRequest f42938c;
    public final String[] d;

    public m0(s0 s0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f42936a = i10;
        this.f42937b = s0Var;
        this.f42938c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42936a) {
            case 0:
                s0 s0Var = this.f42937b;
                if (s0Var.f42989a != null) {
                    s0Var.f42989a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42938c;
                    if (booleanValue) {
                        z0.a(s0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new m0(s0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                s0 s0Var2 = this.f42937b;
                s0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f42938c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    s0Var2.e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
