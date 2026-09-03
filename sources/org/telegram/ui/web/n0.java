package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class n0 implements q0.a {
    public final int f39533a;
    public final v0 f39534b;
    public final PermissionRequest f39535c;
    public final String d;

    public n0(v0 v0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f39533a = i10;
        this.f39534b = v0Var;
        this.f39535c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39533a) {
            case 0:
                v0 v0Var = this.f39534b;
                if (v0Var.f39629a != null) {
                    v0Var.f39629a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f39535c;
                    if (booleanValue) {
                        c1.a(v0Var.e.N, new String[]{"android.permission.RECORD_AUDIO"}, new n0(v0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                v0 v0Var2 = this.f39534b;
                if (v0Var2.f39629a != null) {
                    v0Var2.f39629a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f39535c;
                    if (booleanValue2) {
                        c1.a(v0Var2.e.N, new String[]{"android.permission.CAMERA"}, new n0(v0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                v0 v0Var3 = this.f39534b;
                v0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f39535c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    v0Var3.e.N.Q = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                v0 v0Var4 = this.f39534b;
                v0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f39535c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    v0Var4.e.N.Q = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
