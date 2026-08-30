package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class l0 implements q0.a {
    public final int f39567a;
    public final t0 f39568b;
    public final PermissionRequest f39569c;
    public final String d;

    public l0(t0 t0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f39567a = i10;
        this.f39568b = t0Var;
        this.f39569c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39567a) {
            case 0:
                t0 t0Var = this.f39568b;
                if (t0Var.f39663a != null) {
                    t0Var.f39663a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f39569c;
                    if (booleanValue) {
                        a1.a(t0Var.e.N, new String[]{"android.permission.RECORD_AUDIO"}, new l0(t0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                t0 t0Var2 = this.f39568b;
                if (t0Var2.f39663a != null) {
                    t0Var2.f39663a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f39569c;
                    if (booleanValue2) {
                        a1.a(t0Var2.e.N, new String[]{"android.permission.CAMERA"}, new l0(t0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                t0 t0Var3 = this.f39568b;
                t0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f39569c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    t0Var3.e.N.Q = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                t0 t0Var4 = this.f39568b;
                t0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f39569c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    t0Var4.e.N.Q = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
