package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class l0 implements q0.a {
    public final int f50936a;
    public final q0 f50937b;
    public final PermissionRequest f50938c;
    public final String[] d;

    public l0(q0 q0Var, PermissionRequest permissionRequest, String[] strArr, int i3) {
        this.f50936a = i3;
        this.f50937b = q0Var;
        this.f50938c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f50936a) {
            case 0:
                q0 q0Var = this.f50937b;
                if (q0Var.f50993a != null) {
                    q0Var.f50993a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f50938c;
                    if (booleanValue) {
                        w0.a(q0Var.f50996e.R, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new l0(q0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                q0 q0Var2 = this.f50937b;
                q0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f50938c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    q0Var2.f50996e.R.U = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
