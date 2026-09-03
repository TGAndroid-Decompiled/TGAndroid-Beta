package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class m0 implements q0.a {
    public final int f42598a;
    public final u0 f42599b;
    public final PermissionRequest f42600c;
    public final String d;

    public m0(u0 u0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f42598a = i10;
        this.f42599b = u0Var;
        this.f42600c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42598a) {
            case 0:
                u0 u0Var = this.f42599b;
                if (u0Var.f42698a != null) {
                    u0Var.f42698a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42600c;
                    if (booleanValue) {
                        a1.a(u0Var.f42701e.N, new String[]{"android.permission.RECORD_AUDIO"}, new m0(u0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                u0 u0Var2 = this.f42599b;
                if (u0Var2.f42698a != null) {
                    u0Var2.f42698a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f42600c;
                    if (booleanValue2) {
                        a1.a(u0Var2.f42701e.N, new String[]{"android.permission.CAMERA"}, new m0(u0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                u0 u0Var3 = this.f42599b;
                u0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f42600c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    u0Var3.f42701e.N.Q = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                u0 u0Var4 = this.f42599b;
                u0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f42600c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    u0Var4.f42701e.N.Q = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
