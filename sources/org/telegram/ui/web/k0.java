package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class k0 implements q0.a {
    public final int f51171a;
    public final r0 f51172b;
    public final PermissionRequest f51173c;
    public final String d;

    public k0(r0 r0Var, PermissionRequest permissionRequest, String str, int i7) {
        this.f51171a = i7;
        this.f51172b = r0Var;
        this.f51173c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f51171a) {
            case 0:
                r0 r0Var = this.f51172b;
                if (r0Var.f51278a != null) {
                    r0Var.f51278a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f51173c;
                    if (booleanValue) {
                        x0.a(r0Var.f51281e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new k0(r0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                r0 r0Var2 = this.f51172b;
                if (r0Var2.f51278a != null) {
                    r0Var2.f51278a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f51173c;
                    if (booleanValue2) {
                        x0.a(r0Var2.f51281e.Q, new String[]{"android.permission.CAMERA"}, new k0(r0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                r0 r0Var3 = this.f51172b;
                r0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f51173c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    r0Var3.f51281e.Q.T = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                r0 r0Var4 = this.f51172b;
                r0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f51173c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    r0Var4.f51281e.Q.T = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
