package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class m0 implements q0.a {
    public final int f43931a;
    public final s0 f43932b;
    public final PermissionRequest f43933c;
    public final String[] d;

    public m0(s0 s0Var, PermissionRequest permissionRequest, String[] strArr, int i9) {
        this.f43931a = i9;
        this.f43932b = s0Var;
        this.f43933c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43931a) {
            case 0:
                s0 s0Var = this.f43932b;
                if (s0Var.f44012a != null) {
                    s0Var.f44012a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f43933c;
                    if (booleanValue) {
                        y0.a(s0Var.f44015e.M, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new m0(s0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                s0 s0Var2 = this.f43932b;
                s0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f43933c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    s0Var2.f44015e.M.P = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
