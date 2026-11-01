package org.telegram.ui.web;

import java.io.File;
import org.telegram.messenger.r20;
import org.telegram.ui.v8;
public final class v implements r20 {
    public final int f43006a = 1;
    public final z0 f43007b;
    public final String f43008c;
    public final String d;
    public final Object e;
    public final Object f43009f;

    public v(z0 z0Var, org.telegram.ui.ActionBar.x1 x1Var, String str, String str2, String str3) {
        this.f43007b = z0Var;
        this.e = x1Var;
        this.f43008c = str;
        this.d = str2;
        this.f43009f = str3;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43006a) {
            case 0:
                x0 x0Var = (x0) this.e;
                xh.g1 g1Var = (xh.g1) this.f43009f;
                String str = this.d;
                String str2 = (String) obj;
                z0 z0Var = this.f43007b;
                String str3 = this.f43008c;
                if (str2 == null) {
                    z0Var.y(x0Var, "secure_storage_failed", z0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    g1Var.j(str2);
                    z0Var.y(x0Var, "secure_storage_key_restored", z0.B("req_id", str3, "value", (String) g1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    z0Var.y(x0Var, "secure_storage_failed", z0.B("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                z0 z0Var2 = this.f43007b;
                org.telegram.messenger.i0.g3(new v8(z0Var2, (File) obj, (org.telegram.ui.ActionBar.x1) this.e, this.f43008c, this.d, (String) this.f43009f, 16));
                return;
        }
    }

    public v(z0 z0Var, x0 x0Var, String str, xh.g1 g1Var, String str2) {
        this.f43007b = z0Var;
        this.e = x0Var;
        this.f43008c = str;
        this.f43009f = g1Var;
        this.d = str2;
    }
}
