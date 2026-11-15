package org.telegram.ui.web;

import fi.i7;
import java.io.File;
import org.telegram.messenger.z10;
public final class v implements z10 {
    public final int f52806a = 0;
    public final v0 f52807b;
    public final String f52808c;
    public final String d;
    public final Object f52809e;
    public final Object f52810f;

    public v(v0 v0Var, i7 i7Var, String str, ki.n1 n1Var, String str2) {
        this.f52807b = v0Var;
        this.f52809e = i7Var;
        this.f52808c = str;
        this.f52810f = n1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f52806a) {
            case 0:
                i7 i7Var = (i7) this.f52809e;
                ki.n1 n1Var = (ki.n1) this.f52810f;
                String str = this.d;
                String str2 = (String) obj;
                v0 v0Var = this.f52807b;
                String str3 = this.f52808c;
                if (str2 == null) {
                    v0Var.x(i7Var, "secure_storage_failed", v0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    n1Var.j(str2);
                    v0Var.x(i7Var, "secure_storage_key_restored", v0.B("req_id", str3, "value", (String) n1Var.f(str).first));
                    return;
                } catch (Exception e10) {
                    v0Var.x(i7Var, "secure_storage_failed", v0.B("req_id", str3, "error", e10.getMessage()));
                    return;
                }
            default:
                v0 v0Var2 = this.f52807b;
                org.telegram.messenger.g0.h3(new bi.p1(v0Var2, (File) obj, (org.telegram.ui.ActionBar.t1) this.f52809e, this.f52808c, this.d, (String) this.f52810f, 28, false));
                return;
        }
    }

    public v(v0 v0Var, org.telegram.ui.ActionBar.t1 t1Var, String str, String str2, String str3) {
        this.f52807b = v0Var;
        this.f52809e = t1Var;
        this.f52808c = str;
        this.d = str2;
        this.f52810f = str3;
    }
}
