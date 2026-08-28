package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class l0 implements q0.a {
    public final int f43925a;
    public final s0 f43926b;
    public final PermissionRequest f43927c;
    public final String d;

    public l0(s0 s0Var, PermissionRequest permissionRequest, String str, int i9) {
        this.f43925a = i9;
        this.f43926b = s0Var;
        this.f43927c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43925a) {
            case 0:
                s0 s0Var = this.f43926b;
                if (s0Var.f44012a != null) {
                    s0Var.f44012a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f43927c;
                    if (booleanValue) {
                        y0.a(s0Var.f44015e.M, new String[]{"android.permission.RECORD_AUDIO"}, new l0(s0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                s0 s0Var2 = this.f43926b;
                if (s0Var2.f44012a != null) {
                    s0Var2.f44012a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f43927c;
                    if (booleanValue2) {
                        y0.a(s0Var2.f44015e.M, new String[]{"android.permission.CAMERA"}, new l0(s0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                s0 s0Var3 = this.f43926b;
                s0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f43927c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    s0Var3.f44015e.M.P = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                s0 s0Var4 = this.f43926b;
                s0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f43927c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    s0Var4.f44015e.M.P = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
