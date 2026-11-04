package org.telegram.ui.web;

import ei.p7;
import java.io.File;
import org.telegram.messenger.u10;
public final class w implements u10 {
    public final int f51055a = 0;
    public final w0 f51056b;
    public final String f51057c;
    public final String d;
    public final Object f51058e;
    public final Object f51059f;

    public w(w0 w0Var, p7 p7Var, String str, ii.n1 n1Var, String str2) {
        this.f51056b = w0Var;
        this.f51058e = p7Var;
        this.f51057c = str;
        this.f51059f = n1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51055a) {
            case 0:
                p7 p7Var = (p7) this.f51058e;
                ii.n1 n1Var = (ii.n1) this.f51059f;
                String str = this.d;
                String str2 = (String) obj;
                w0 w0Var = this.f51056b;
                String str3 = this.f51057c;
                if (str2 == null) {
                    w0Var.x(p7Var, "secure_storage_failed", w0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    n1Var.j(str2);
                    w0Var.x(p7Var, "secure_storage_key_restored", w0.B("req_id", str3, "value", (String) n1Var.f(str).first));
                    return;
                } catch (Exception e10) {
                    w0Var.x(p7Var, "secure_storage_failed", w0.B("req_id", str3, "error", e10.getMessage()));
                    return;
                }
            default:
                w0 w0Var2 = this.f51056b;
                org.telegram.messenger.g0.h3(new ai.w1(w0Var2, (File) obj, (org.telegram.ui.ActionBar.s1) this.f51058e, this.f51057c, this.d, (String) this.f51059f, 27, false));
                return;
        }
    }

    public w(w0 w0Var, org.telegram.ui.ActionBar.s1 s1Var, String str, String str2, String str3) {
        this.f51056b = w0Var;
        this.f51058e = s1Var;
        this.f51057c = str;
        this.d = str2;
        this.f51059f = str3;
    }
}
