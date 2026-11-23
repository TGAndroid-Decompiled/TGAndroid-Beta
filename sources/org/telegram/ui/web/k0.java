package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class k0 implements q0.a {
    public final int f53221a;
    public final p0 f53222b;
    public final PermissionRequest f53223c;
    public final String[] d;

    public k0(p0 p0Var, PermissionRequest permissionRequest, String[] strArr, int i7) {
        this.f53221a = i7;
        this.f53222b = p0Var;
        this.f53223c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f53221a) {
            case 0:
                p0 p0Var = this.f53222b;
                if (p0Var.f53274a != null) {
                    p0Var.f53274a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f53223c;
                    if (booleanValue) {
                        v0.a(p0Var.f53277e.R, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new k0(p0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                p0 p0Var2 = this.f53222b;
                p0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f53223c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    p0Var2.f53277e.R.U = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
