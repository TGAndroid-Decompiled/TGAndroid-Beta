package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class o0 implements q0.a {
    public final int f39167a;
    public final v0 f39168b;
    public final PermissionRequest f39169c;
    public final String[] d;

    public o0(v0 v0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f39167a = i10;
        this.f39168b = v0Var;
        this.f39169c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39167a) {
            case 0:
                v0 v0Var = this.f39168b;
                if (v0Var.f39224a != null) {
                    v0Var.f39224a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f39169c;
                    if (booleanValue) {
                        b1.a(v0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o0(v0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f39168b;
                v0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f39169c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    v0Var2.e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
