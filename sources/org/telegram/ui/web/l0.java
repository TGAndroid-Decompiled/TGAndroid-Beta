package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class l0 implements q0.a {
    public final int f43089a;
    public final s0 f43090b;
    public final PermissionRequest f43091c;
    public final String d;

    public l0(s0 s0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f43089a = i10;
        this.f43090b = s0Var;
        this.f43091c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43089a) {
            case 0:
                s0 s0Var = this.f43090b;
                if (s0Var.f43187a != null) {
                    s0Var.f43187a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f43091c;
                    if (booleanValue) {
                        z0.a(s0Var.e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new l0(s0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                s0 s0Var2 = this.f43090b;
                if (s0Var2.f43187a != null) {
                    s0Var2.f43187a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f43091c;
                    if (booleanValue2) {
                        z0.a(s0Var2.e.Q, new String[]{"android.permission.CAMERA"}, new l0(s0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                s0 s0Var3 = this.f43090b;
                s0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f43091c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    s0Var3.e.Q.T = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                s0 s0Var4 = this.f43090b;
                s0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f43091c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    s0Var4.e.Q.T = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
