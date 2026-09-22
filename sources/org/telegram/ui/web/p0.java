package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class p0 implements q0.a {
    public final int f39035a;
    public final w0 f39036b;
    public final PermissionRequest f39037c;
    public final String[] d;

    public p0(w0 w0Var, PermissionRequest permissionRequest, String[] strArr, int i10) {
        this.f39035a = i10;
        this.f39036b = w0Var;
        this.f39037c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f39035a) {
            case 0:
                w0 w0Var = this.f39036b;
                if (w0Var.f39092a != null) {
                    w0Var.f39092a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f39037c;
                    if (booleanValue) {
                        d1.a(w0Var.e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new p0(w0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                w0 w0Var2 = this.f39036b;
                w0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f39037c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    w0Var2.e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
