package org.telegram.ui.web;

import bi.l2;
import fi.f7;
import java.io.File;
import org.telegram.messenger.y10;
public final class v implements y10 {
    public final int f53336a = 0;
    public final v0 f53337b;
    public final String f53338c;
    public final String d;
    public final Object f53339e;
    public final Object f53340f;

    public v(v0 v0Var, f7 f7Var, String str, ki.k1 k1Var, String str2) {
        this.f53337b = v0Var;
        this.f53339e = f7Var;
        this.f53338c = str;
        this.f53340f = k1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53336a) {
            case 0:
                f7 f7Var = (f7) this.f53339e;
                ki.k1 k1Var = (ki.k1) this.f53340f;
                String str = this.d;
                String str2 = (String) obj;
                v0 v0Var = this.f53337b;
                String str3 = this.f53338c;
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
                v0 v0Var2 = this.f53337b;
                org.telegram.messenger.g0.g3(new l2(v0Var2, (File) obj, (org.telegram.ui.ActionBar.t1) this.f53339e, this.f53338c, this.d, (String) this.f53340f, 29, false));
                return;
        }
    }

    public v(v0 v0Var, org.telegram.ui.ActionBar.t1 t1Var, String str, String str2, String str3) {
        this.f53337b = v0Var;
        this.f53339e = t1Var;
        this.f53338c = str;
        this.d = str2;
        this.f53340f = str3;
    }
}
