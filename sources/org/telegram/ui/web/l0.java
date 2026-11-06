package org.telegram.ui.web;

import android.webkit.PermissionRequest;
public final class l0 implements q0.a {
    public final int f51197a;
    public final r0 f51198b;
    public final PermissionRequest f51199c;
    public final String[] d;

    public l0(r0 r0Var, PermissionRequest permissionRequest, String[] strArr, int i7) {
        this.f51197a = i7;
        this.f51198b = r0Var;
        this.f51199c = permissionRequest;
        this.d = strArr;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f51197a) {
            case 0:
                r0 r0Var = this.f51198b;
                if (r0Var.f51289a != null) {
                    r0Var.f51289a = null;
                    boolean booleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f51199c;
                    if (booleanValue) {
                        x0.a(r0Var.f51292e.Q, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new l0(r0Var, permissionRequest, this.d, 1));
                        return;
                    } else {
                        permissionRequest.deny();
                        return;
                    }
                }
                return;
            default:
                r0 r0Var2 = this.f51198b;
                r0Var2.getClass();
                boolean booleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f51199c;
                if (booleanValue2) {
                    String[] strArr = this.d;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    r0Var2.f51292e.Q.T = true;
                    return;
                }
                permissionRequest2.deny();
                return;
        }
    }
}
