package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class j0 implements q0.a {
    public final int f53135a;
    public final p0 f53136b;
    public final PermissionRequest f53137c;
    public final String d;

    public j0(p0 p0Var, PermissionRequest permissionRequest, String str, int i7) {
        this.f53135a = i7;
        this.f53136b = p0Var;
        this.f53137c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f53135a) {
            case 0:
                p0 p0Var = this.f53136b;
                if (p0Var.f53238a != null) {
                    p0Var.f53238a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f53137c;
                    if (booleanValue) {
                        v0.a(p0Var.f53241e.R, new String[]{"android.permission.RECORD_AUDIO"}, new j0(p0Var, permissionRequest, this.d, 2));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            case 1:
                p0 p0Var2 = this.f53136b;
                if (p0Var2.f53238a != null) {
                    p0Var2.f53238a = null;
                    boolean booleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f53137c;
                    if (booleanValue2) {
                        v0.a(p0Var2.f53241e.R, new String[]{"android.permission.CAMERA"}, new j0(p0Var2, permissionRequest2, this.d, 3));
                        return;
                    } else {
                        permissionRequest2.deny();
                        return;
                    }
                }
                return;
            case 2:
                p0 p0Var3 = this.f53136b;
                p0Var3.getClass();
                boolean booleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f53137c;
                if (booleanValue3) {
                    permissionRequest3.grant(new String[]{this.d});
                    p0Var3.f53241e.R.U = true;
                    return;
                }
                permissionRequest3.deny();
                return;
            default:
                p0 p0Var4 = this.f53136b;
                p0Var4.getClass();
                boolean booleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f53137c;
                if (booleanValue4) {
                    permissionRequest4.grant(new String[]{this.d});
                    p0Var4.f53241e.R.U = true;
                    return;
                }
                permissionRequest4.deny();
                return;
        }
    }
}
