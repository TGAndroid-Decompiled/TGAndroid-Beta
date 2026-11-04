package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class k0 implements q0.a {
    public final int f50921a;
    public final q0 f50922b;
    public final PermissionRequest f50923c;
    public final String d;

    public k0(q0 q0Var, PermissionRequest permissionRequest, String str, int i3) {
        this.f50921a = i3;
        this.f50922b = q0Var;
        this.f50923c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f50921a) {
            case 0:
                q0 q0Var = this.f50922b;
                if (q0Var.f50993a != null) {
                    q0Var.f50993a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f50923c;
                    if (booleanValue) {
                        w0.a(q0Var.f50996e.R, new String[]{"android.permission.RECORD_AUDIO"}, new k0(q0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                q0 q0Var2 = this.f50922b;
                if (q0Var2.f50993a != null) {
                    q0Var2.f50993a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f50923c;
                    if (booleanValue2) {
                        w0.a(q0Var2.f50996e.R, new String[]{"android.permission.CAMERA"}, new k0(q0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                q0 q0Var3 = this.f50922b;
                q0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f50923c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    q0Var3.f50996e.R.U = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                q0 q0Var4 = this.f50922b;
                q0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f50923c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    q0Var4.f50996e.R.U = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
