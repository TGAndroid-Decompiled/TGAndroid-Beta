package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class m0 implements q0.a {
    public final int f44115a;
    public final t0 f44116b;
    public final PermissionRequest f44117c;
    public final String d;

    public m0(t0 t0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f44115a = i10;
        this.f44116b = t0Var;
        this.f44117c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f44115a) {
            case 0:
                t0 t0Var = this.f44116b;
                if (t0Var.f44202a != null) {
                    t0Var.f44202a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f44117c;
                    if (booleanValue) {
                        z0.a(t0Var.f44205e.M, new String[]{"android.permission.RECORD_AUDIO"}, new m0(t0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                t0 t0Var2 = this.f44116b;
                if (t0Var2.f44202a != null) {
                    t0Var2.f44202a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f44117c;
                    if (booleanValue2) {
                        z0.a(t0Var2.f44205e.M, new String[]{"android.permission.CAMERA"}, new m0(t0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                t0 t0Var3 = this.f44116b;
                t0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f44117c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    t0Var3.f44205e.M.P = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                t0 t0Var4 = this.f44116b;
                t0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f44117c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    t0Var4.f44205e.M.P = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
