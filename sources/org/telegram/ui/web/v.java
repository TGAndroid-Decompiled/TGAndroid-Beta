package org.telegram.ui.web;

import bi.h2;
import fi.f7;
import java.io.File;
import org.telegram.messenger.x10;
public final class v implements x10 {
    public final int f53338a = 0;
    public final v0 f53339b;
    public final String f53340c;
    public final String d;
    public final Object f53341e;
    public final Object f53342f;

    public v(v0 v0Var, f7 f7Var, String str, ki.l1 l1Var, String str2) {
        this.f53339b = v0Var;
        this.f53341e = f7Var;
        this.f53340c = str;
        this.f53342f = l1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53338a) {
            case 0:
                f7 f7Var = (f7) this.f53341e;
                ki.l1 l1Var = (ki.l1) this.f53342f;
                String str = this.d;
                String str2 = (String) obj;
                v0 v0Var = this.f53339b;
                String str3 = this.f53340c;
                if (str2 == null) {
                    v0Var.x(f7Var, "secure_storage_failed", v0.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    l1Var.j(str2);
                    v0Var.x(f7Var, "secure_storage_key_restored", v0.B("req_id", str3, "value", (String) l1Var.f(str).first));
                    return;
                } catch (Exception e10) {
                    v0Var.x(f7Var, "secure_storage_failed", v0.B("req_id", str3, "error", e10.getMessage()));
                    return;
                }
            default:
                v0 v0Var2 = this.f53339b;
                org.telegram.messenger.g0.g3(new h2(v0Var2, (File) obj, (org.telegram.ui.ActionBar.u1) this.f53341e, this.f53340c, this.d, (String) this.f53342f, 29, false));
                return;
        }
    }

    public v(v0 v0Var, org.telegram.ui.ActionBar.u1 u1Var, String str, String str2, String str3) {
        this.f53339b = v0Var;
        this.f53341e = u1Var;
        this.f53340c = str;
        this.d = str2;
        this.f53342f = str3;
    }
}
