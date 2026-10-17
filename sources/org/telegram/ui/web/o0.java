package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class o0 implements q0.a {
    public final int f42695a;
    public final u0 f42696b;
    public final PermissionRequest f42697c;
    public final String[] d;

    public o0(u0 u0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f42695a = i10;
        this.f42696b = u0Var;
        this.f42697c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42695a) {
            case 0:
                u0 u0Var = this.f42696b;
                if (u0Var.f42775a != null) {
                    u0Var.f42775a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42697c;
                    if (booleanValue) {
                        a1.a(u0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o0(u0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                u0 u0Var2 = this.f42696b;
                u0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f42697c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    u0Var2.e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
