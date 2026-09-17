package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class q0 implements q0.a {
    public final int f42219a;
    public final w0 f42220b;
    public final PermissionRequest f42221c;
    public final String[] d;

    public q0(w0 w0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f42219a = i10;
        this.f42220b = w0Var;
        this.f42221c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42219a) {
            case 0:
                w0 w0Var = this.f42220b;
                if (w0Var.f42271a != null) {
                    w0Var.f42271a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42221c;
                    if (booleanValue) {
                        d1.a(w0Var.f42274e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new q0(w0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f42220b;
                w0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f42221c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    w0Var2.f42274e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
