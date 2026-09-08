package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class p0 implements q0.a {
    public final int f42232a;
    public final w0 f42233b;
    public final PermissionRequest f42234c;
    public final String d;

    public p0(w0 w0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f42232a = i10;
        this.f42233b = w0Var;
        this.f42234c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42232a) {
            case 0:
                w0 w0Var = this.f42233b;
                if (w0Var.f42297a != null) {
                    w0Var.f42297a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f42234c;
                    if (booleanValue) {
                        d1.a(w0Var.f42300e.Q, new String[]{"android.permission.RECORD_AUDIO"}, new p0(w0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                w0 w0Var2 = this.f42233b;
                if (w0Var2.f42297a != null) {
                    w0Var2.f42297a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f42234c;
                    if (booleanValue2) {
                        d1.a(w0Var2.f42300e.Q, new String[]{"android.permission.CAMERA"}, new p0(w0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                w0 w0Var3 = this.f42233b;
                w0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f42234c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    w0Var3.f42300e.Q.T = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                w0 w0Var4 = this.f42233b;
                w0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f42234c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    w0Var4.f42300e.Q.T = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
