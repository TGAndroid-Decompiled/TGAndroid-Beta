package org.telegram.ui.web;

import bi.n2;
import fi.f7;
import java.io.File;
import org.telegram.messenger.y10;
public final class v implements y10 {
    public final int f53300a = 0;
    public final v0 f53301b;
    public final String f53302c;
    public final String d;
    public final Object f53303e;
    public final Object f53304f;

    public v(v0 v0Var, f7 f7Var, String str, ki.k1 k1Var, String str2) {
        this.f53301b = v0Var;
        this.f53303e = f7Var;
        this.f53302c = str;
        this.f53304f = k1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53300a) {
            case 0:
                f7 f7Var = (f7) this.f53303e;
                ki.k1 k1Var = (ki.k1) this.f53304f;
                String str = this.d;
                String str2 = (String) obj;
                v0 v0Var = this.f53301b;
                String str3 = this.f53302c;
                if (str2 == null) {
                    v0Var.x(f7Var, "secure_storage_failed", v0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    k1Var.j(str2);
                    v0Var.x(f7Var, "secure_storage_key_restored", v0.B("req_id", str3, "value", (String) k1Var.f(str).first));
                    return;
                } catch (Exception e10) {
                    v0Var.x(f7Var, "secure_storage_failed", v0.B("req_id", str3, "error", e10.getMessage()));
                    return;
                }
            default:
                v0 v0Var2 = this.f53301b;
                org.telegram.messenger.g0.g3(new n2(v0Var2, (File) obj, (org.telegram.ui.ActionBar.t1) this.f53303e, this.f53302c, this.d, (String) this.f53304f, 29, false));
                return;
        }
    }

    public v(v0 v0Var, org.telegram.ui.ActionBar.t1 t1Var, String str, String str2, String str3) {
        this.f53301b = v0Var;
        this.f53303e = t1Var;
        this.f53302c = str;
        this.d = str2;
        this.f53304f = str3;
    }
}
