package org.telegram.ui.web;

import bi.k8;
import bi.n9;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f40956a = 0;
    public final c1 f40957b;
    public final String f40958c;
    public final String d;
    public final Object e;
    public final Object f40959f;

    public a0(c1 c1Var, n9 n9Var, String str, fi.s1 s1Var, String str2) {
        this.f40957b = c1Var;
        this.e = n9Var;
        this.f40958c = str;
        this.f40959f = s1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40956a) {
            case 0:
                n9 n9Var = (n9) this.e;
                fi.s1 s1Var = (fi.s1) this.f40959f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.f40957b;
                String str3 = this.f40958c;
                if (str2 == null) {
                    c1Var.x(n9Var, "secure_storage_failed", c1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    s1Var.j(str2);
                    c1Var.x(n9Var, "secure_storage_key_restored", c1.B("req_id", str3, "value", (String) s1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    c1Var.x(n9Var, "secure_storage_failed", c1.B("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                c1 c1Var2 = this.f40957b;
                AndroidUtilities.runOnUIThread(new k8(c1Var2, (File) obj, (org.telegram.ui.ActionBar.a2) this.e, this.f40958c, this.d, (String) this.f40959f, 19));
                return;
        }
    }

    public a0(c1 c1Var, org.telegram.ui.ActionBar.a2 a2Var, String str, String str2, String str3) {
        this.f40957b = c1Var;
        this.e = a2Var;
        this.f40958c = str;
        this.d = str2;
        this.f40959f = str3;
    }
}
