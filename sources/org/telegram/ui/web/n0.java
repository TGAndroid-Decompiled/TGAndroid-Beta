package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class n0 implements q0.a {
    public final int f42732a;
    public final u0 f42733b;
    public final PermissionRequest f42734c;
    public final String d;

    public n0(u0 u0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f42732a = i10;
        this.f42733b = u0Var;
        this.f42734c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42732a) {
            case 0:
                u0 u0Var = this.f42733b;
                if (u0Var.f42823a != null) {
                    u0Var.f42823a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42734c;
                    if (booleanValue) {
                        a1.a(u0Var.e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new n0(u0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                u0 u0Var2 = this.f42733b;
                if (u0Var2.f42823a != null) {
                    u0Var2.f42823a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f42734c;
                    if (booleanValue2) {
                        a1.a(u0Var2.e.Q, new String[]{"android.permission.CAMERA"}, new n0(u0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                u0 u0Var3 = this.f42733b;
                u0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f42734c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    u0Var3.e.Q.T = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                u0 u0Var4 = this.f42733b;
                u0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f42734c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    u0Var4.e.Q.T = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
