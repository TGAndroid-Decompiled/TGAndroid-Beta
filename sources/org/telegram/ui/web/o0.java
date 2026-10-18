package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class o0 implements q0.a {
    public final int f42690a;
    public final v0 f42691b;
    public final PermissionRequest f42692c;
    public final String d;

    public o0(v0 v0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f42690a = i10;
        this.f42691b = v0Var;
        this.f42692c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42690a) {
            case 0:
                v0 v0Var = this.f42691b;
                if (v0Var.f42784a != null) {
                    v0Var.f42784a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42692c;
                    if (booleanValue) {
                        b1.a(v0Var.e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new o0(v0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                v0 v0Var2 = this.f42691b;
                if (v0Var2.f42784a != null) {
                    v0Var2.f42784a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f42692c;
                    if (booleanValue2) {
                        b1.a(v0Var2.e.Q, new String[]{"android.permission.CAMERA"}, new o0(v0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                v0 v0Var3 = this.f42691b;
                v0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f42692c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    v0Var3.e.Q.T = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                v0 v0Var4 = this.f42691b;
                v0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f42692c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    v0Var4.e.Q.T = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
