package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class n0 implements q0.a {
    public final int f43405a;
    public final v0 f43406b;
    public final PermissionRequest f43407c;
    public final String d;

    public n0(v0 v0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f43405a = i10;
        this.f43406b = v0Var;
        this.f43407c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43405a) {
            case 0:
                v0 v0Var = this.f43406b;
                if (v0Var.f43517a != null) {
                    v0Var.f43517a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f43407c;
                    if (booleanValue) {
                        b1.a(v0Var.f43520e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new n0(v0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                v0 v0Var2 = this.f43406b;
                if (v0Var2.f43517a != null) {
                    v0Var2.f43517a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f43407c;
                    if (booleanValue2) {
                        b1.a(v0Var2.f43520e.Q, new String[]{"android.permission.CAMERA"}, new n0(v0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                v0 v0Var3 = this.f43406b;
                v0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f43407c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    v0Var3.f43520e.Q.T = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                v0 v0Var4 = this.f43406b;
                v0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f43407c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    v0Var4.f43520e.Q.T = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
