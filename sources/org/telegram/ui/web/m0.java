package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class m0 implements q0.a {
    public final int f39579a;
    public final t0 f39580b;
    public final PermissionRequest f39581c;
    public final String[] d;

    public m0(t0 t0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f39579a = i10;
        this.f39580b = t0Var;
        this.f39581c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39579a) {
            case 0:
                t0 t0Var = this.f39580b;
                if (t0Var.f39663a != null) {
                    t0Var.f39663a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f39581c;
                    if (booleanValue) {
                        a1.a(t0Var.e.N, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new m0(t0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                t0 t0Var2 = this.f39580b;
                t0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f39581c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    t0Var2.e.N.Q = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
