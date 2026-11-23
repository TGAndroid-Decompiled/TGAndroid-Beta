package org.telegram.ui.web;

import bi.n2;
import fi.f7;
import java.io.File;
import org.telegram.messenger.w10;
public final class v implements w10 {
    public final int f53570a = 0;
    public final v0 f53571b;
    public final String f53572c;
    public final String d;
    public final Object f53573e;
    public final Object f53574f;

    public v(v0 v0Var, f7 f7Var, String str, ki.k1 k1Var, String str2) {
        this.f53571b = v0Var;
        this.f53573e = f7Var;
        this.f53572c = str;
        this.f53574f = k1Var;
        this.d = str2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53570a) {
            case 0:
                f7 f7Var = (f7) this.f53573e;
                ki.k1 k1Var = (ki.k1) this.f53574f;
                String str = this.d;
                String str2 = (String) obj;
                v0 v0Var = this.f53571b;
                String str3 = this.f53572c;
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
                v0 v0Var2 = this.f53571b;
                org.telegram.messenger.g0.g3(new n2(v0Var2, (File) obj, (org.telegram.ui.ActionBar.t1) this.f53573e, this.f53572c, this.d, (String) this.f53574f, 29, false));
                return;
        }
    }

    public v(v0 v0Var, org.telegram.ui.ActionBar.t1 t1Var, String str, String str2, String str3) {
        this.f53571b = v0Var;
        this.f53573e = t1Var;
        this.f53572c = str;
        this.d = str2;
        this.f53574f = str3;
    }
}
