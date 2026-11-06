package org.telegram.ui.web;

import bi.a3;
import di.o7;
import java.io.File;
import org.telegram.messenger.c20;
public final class u implements c20 {
    public final int f51303a = 0;
    public final x0 f51304b;
    public final String f51305c;
    public final String d;
    public final Object f51306e;
    public final Object f51307f;

    public u(x0 x0Var, o7 o7Var, String str, hi.m1 m1Var, String str2) {
        this.f51304b = x0Var;
        this.f51306e = o7Var;
        this.f51305c = str;
        this.f51307f = m1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51303a) {
            case 0:
                o7 o7Var = (o7) this.f51306e;
                hi.m1 m1Var = (hi.m1) this.f51307f;
                String str = this.d;
                String str2 = (String) obj;
                x0 x0Var = this.f51304b;
                String str3 = this.f51305c;
                if (str2 == null) {
                    x0Var.x(o7Var, "secure_storage_failed", x0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    m1Var.j(str2);
                    x0Var.x(o7Var, "secure_storage_key_restored", x0.B("req_id", str3, "value", (String) m1Var.f(str).first));
                    return;
                } catch (Exception e10) {
                    x0Var.x(o7Var, "secure_storage_failed", x0.B("req_id", str3, "error", e10.getMessage()));
                    return;
                }
            default:
                x0 x0Var2 = this.f51304b;
                org.telegram.messenger.g0.h3(new a3(x0Var2, (File) obj, (org.telegram.ui.ActionBar.u1) this.f51306e, this.f51305c, this.d, (String) this.f51307f, 26));
                return;
        }
    }

    public u(x0 x0Var, org.telegram.ui.ActionBar.u1 u1Var, String str, String str2, String str3) {
        this.f51304b = x0Var;
        this.f51306e = u1Var;
        this.f51305c = str;
        this.d = str2;
        this.f51307f = str3;
    }
}
