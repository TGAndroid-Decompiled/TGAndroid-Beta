package org.telegram.ui.web;

import bi.a3;
import di.p7;
import java.io.File;
import org.telegram.messenger.c20;
public final class v implements c20 {
    public final int f51316a = 0;
    public final x0 f51317b;
    public final String f51318c;
    public final String d;
    public final Object f51319e;
    public final Object f51320f;

    public v(x0 x0Var, p7 p7Var, String str, hi.m1 m1Var, String str2) {
        this.f51317b = x0Var;
        this.f51319e = p7Var;
        this.f51318c = str;
        this.f51320f = m1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51316a) {
            case 0:
                p7 p7Var = (p7) this.f51319e;
                hi.m1 m1Var = (hi.m1) this.f51320f;
                String str = this.d;
                String str2 = (String) obj;
                x0 x0Var = this.f51317b;
                String str3 = this.f51318c;
                if (str2 == null) {
                    x0Var.x(p7Var, "secure_storage_failed", x0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    m1Var.j(str2);
                    x0Var.x(p7Var, "secure_storage_key_restored", x0.B("req_id", str3, "value", (String) m1Var.f(str).first));
                    return;
                } catch (Exception e10) {
                    x0Var.x(p7Var, "secure_storage_failed", x0.B("req_id", str3, "error", e10.getMessage()));
                    return;
                }
            default:
                x0 x0Var2 = this.f51317b;
                org.telegram.messenger.g0.h3(new a3(x0Var2, (File) obj, (org.telegram.ui.ActionBar.u1) this.f51319e, this.f51318c, this.d, (String) this.f51320f, 26));
                return;
        }
    }

    public v(x0 x0Var, org.telegram.ui.ActionBar.u1 u1Var, String str, String str2, String str3) {
        this.f51317b = x0Var;
        this.f51319e = u1Var;
        this.f51318c = str;
        this.d = str2;
        this.f51320f = str3;
    }
}
