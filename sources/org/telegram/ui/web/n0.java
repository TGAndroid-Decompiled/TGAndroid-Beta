package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class n0 implements q0.a {
    public final int f43593a;
    public final v0 f43594b;
    public final PermissionRequest f43595c;
    public final String d;

    public n0(v0 v0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f43593a = i10;
        this.f43594b = v0Var;
        this.f43595c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43593a) {
            case 0:
                v0 v0Var = this.f43594b;
                if (v0Var.f43705a != null) {
                    v0Var.f43705a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f43595c;
                    if (booleanValue) {
                        b1.a(v0Var.f43708e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new n0(v0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                v0 v0Var2 = this.f43594b;
                if (v0Var2.f43705a != null) {
                    v0Var2.f43705a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f43595c;
                    if (booleanValue2) {
                        b1.a(v0Var2.f43708e.Q, new String[]{"android.permission.CAMERA"}, new n0(v0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                v0 v0Var3 = this.f43594b;
                v0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f43595c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    v0Var3.f43708e.Q.T = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                v0 v0Var4 = this.f43594b;
                v0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f43595c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    v0Var4.f43708e.Q.T = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
