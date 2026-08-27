package org.telegram.ui.web;

import android.webkit.PermissionRequest;

public final class m0 implements q0.a {

    public final int f43912a;

    public final t0 f43913b;

    public final PermissionRequest f43914c;
    public final String d;

    public m0(t0 t0Var, PermissionRequest permissionRequest, String str, int i10) {
        this.f43912a = i10;
        this.f43913b = t0Var;
        this.f43914c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43912a) {
            case 0:
                t0 t0Var = this.f43913b;
                if (t0Var.f43999a != null) {
                    t0Var.f43999a = null;
                    boolean zBooleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f43914c;
                    if (!zBooleanValue) {
                        permissionRequest.deny();
                    } else {
                        z0.a(t0Var.f44002e.M, new String[]{"android.permission.RECORD_AUDIO"}, new m0(t0Var, permissionRequest, this.d, 2));
                    }
                }
                break;
            case 1:
                t0 t0Var2 = this.f43913b;
                if (t0Var2.f43999a != null) {
                    t0Var2.f43999a = null;
                    boolean zBooleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f43914c;
                    if (!zBooleanValue2) {
                        permissionRequest2.deny();
                    } else {
                        z0.a(t0Var2.f44002e.M, new String[]{"android.permission.CAMERA"}, new m0(t0Var2, permissionRequest2, this.d, 3));
                    }
                }
                break;
            case 2:
                t0 t0Var3 = this.f43913b;
                t0Var3.getClass();
                boolean zBooleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f43914c;
                if (!zBooleanValue3) {
                    permissionRequest3.deny();
                } else {
                    permissionRequest3.grant(new String[]{this.d});
                    t0Var3.f44002e.M.P = true;
                }
                break;
            default:
                t0 t0Var4 = this.f43913b;
                t0Var4.getClass();
                boolean zBooleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f43914c;
                if (!zBooleanValue4) {
                    permissionRequest4.deny();
                } else {
                    permissionRequest4.grant(new String[]{this.d});
                    t0Var4.f44002e.M.P = true;
                }
                break;
        }
    }
}
