package org.telegram.ui.web;

import bi.a3;
import di.p7;
import java.io.File;
import org.telegram.messenger.c20;
public final class v implements c20 {
    public final int f51270a = 0;
    public final x0 f51271b;
    public final String f51272c;
    public final String d;
    public final Object f51273e;
    public final Object f51274f;

    public v(x0 x0Var, p7 p7Var, String str, hi.m1 m1Var, String str2) {
        this.f51271b = x0Var;
        this.f51273e = p7Var;
        this.f51272c = str;
        this.f51274f = m1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51270a) {
            case 0:
                p7 p7Var = (p7) this.f51273e;
                hi.m1 m1Var = (hi.m1) this.f51274f;
                String str = this.d;
                String str2 = (String) obj;
                x0 x0Var = this.f51271b;
                String str3 = this.f51272c;
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
                x0 x0Var2 = this.f51271b;
                org.telegram.messenger.g0.h3(new a3(x0Var2, (File) obj, (org.telegram.ui.ActionBar.u1) this.f51273e, this.f51272c, this.d, (String) this.f51274f, 26));
                return;
        }
    }

    public v(x0 x0Var, org.telegram.ui.ActionBar.u1 u1Var, String str, String str2, String str3) {
        this.f51271b = x0Var;
        this.f51273e = u1Var;
        this.f51272c = str;
        this.d = str2;
        this.f51274f = str3;
    }
}
