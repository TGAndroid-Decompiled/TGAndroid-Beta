package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class n0 implements q0.a {
    public final int f44121a;
    public final t0 f44122b;
    public final PermissionRequest f44123c;
    public final String[] d;

    public n0(t0 t0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f44121a = i10;
        this.f44122b = t0Var;
        this.f44123c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f44121a) {
            case 0:
                t0 t0Var = this.f44122b;
                if (t0Var.f44202a != null) {
                    t0Var.f44202a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f44123c;
                    if (booleanValue) {
                        z0.a(t0Var.f44205e.M, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new n0(t0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                t0 t0Var2 = this.f44122b;
                t0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f44123c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    t0Var2.f44205e.M.P = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
