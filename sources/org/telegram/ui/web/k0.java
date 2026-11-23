package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class k0 implements q0.a {
    public final int f53456a;
    public final p0 f53457b;
    public final PermissionRequest f53458c;
    public final String[] d;

    public k0(p0 p0Var, PermissionRequest permissionRequest, String[] strArr, int i7) {
        this.f53456a = i7;
        this.f53457b = p0Var;
        this.f53458c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f53456a) {
            case 0:
                p0 p0Var = this.f53457b;
                if (p0Var.f53509a != null) {
                    p0Var.f53509a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f53458c;
                    if (booleanValue) {
                        v0.a(p0Var.f53512e.R, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new k0(p0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                p0 p0Var2 = this.f53457b;
                p0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f53458c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    p0Var2.f53512e.R.U = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
