package org.telegram.ui.web;

import android.webkit.PermissionRequest;

public final class n0 implements q0.a {

    public final int f43918a;

    public final t0 f43919b;

    public final PermissionRequest f43920c;
    public final String[] d;

    public n0(t0 t0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f43918a = i10;
        this.f43919b = t0Var;
        this.f43920c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43918a) {
            case 0:
                t0 t0Var = this.f43919b;
                if (t0Var.f43999a != null) {
                    t0Var.f43999a = null;
                    boolean zBooleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f43920c;
                    if (!zBooleanValue) {
                        permissionRequest.deny();
                    } else {
                        z0.a(t0Var.f44002e.M, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new n0(t0Var, permissionRequest, this.d, 1));
                    }
                }
                break;
            default:
                t0 t0Var2 = this.f43919b;
                t0Var2.getClass();
                boolean zBooleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f43920c;
                if (!zBooleanValue2) {
                    permissionRequest2.deny();
                } else {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    t0Var2.f44002e.M.P = true;
                }
                break;
        }
    }
}
