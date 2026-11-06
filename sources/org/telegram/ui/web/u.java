package org.telegram.ui.web;

import bi.a3;
import di.o7;
import java.io.File;
import org.telegram.messenger.c20;
public final class u implements c20 {
    public final int f51311a = 0;
    public final x0 f51312b;
    public final String f51313c;
    public final String d;
    public final Object f51314e;
    public final Object f51315f;

    public u(x0 x0Var, o7 o7Var, String str, hi.m1 m1Var, String str2) {
        this.f51312b = x0Var;
        this.f51314e = o7Var;
        this.f51313c = str;
        this.f51315f = m1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51311a) {
            case 0:
                o7 o7Var = (o7) this.f51314e;
                hi.m1 m1Var = (hi.m1) this.f51315f;
                String str = this.d;
                String str2 = (String) obj;
                x0 x0Var = this.f51312b;
                String str3 = this.f51313c;
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
                x0 x0Var2 = this.f51312b;
                org.telegram.messenger.g0.h3(new a3(x0Var2, (File) obj, (org.telegram.ui.ActionBar.u1) this.f51314e, this.f51313c, this.d, (String) this.f51315f, 26));
                return;
        }
    }

    public u(x0 x0Var, org.telegram.ui.ActionBar.u1 u1Var, String str, String str2, String str3) {
        this.f51312b = x0Var;
        this.f51314e = u1Var;
        this.f51313c = str;
        this.d = str2;
        this.f51315f = str3;
    }
}
