package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class p0 implements q0.a {
    public final int f41150a;
    public final w0 f41151b;
    public final PermissionRequest f41152c;
    public final String d;

    public p0(w0 w0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f41150a = i10;
        this.f41151b = w0Var;
        this.f41152c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f41150a) {
            case 0:
                w0 w0Var = this.f41151b;
                if (w0Var.f41240a != null) {
                    w0Var.f41240a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f41152c;
                    if (booleanValue) {
                        c1.a(w0Var.e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new p0(w0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                w0 w0Var2 = this.f41151b;
                if (w0Var2.f41240a != null) {
                    w0Var2.f41240a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f41152c;
                    if (booleanValue2) {
                        c1.a(w0Var2.e.Q, new String[]{"android.permission.CAMERA"}, new p0(w0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                w0 w0Var3 = this.f41151b;
                w0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f41152c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    w0Var3.e.Q.T = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                w0 w0Var4 = this.f41151b;
                w0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f41152c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    w0Var4.e.Q.T = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
