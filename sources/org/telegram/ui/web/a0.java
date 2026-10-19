package org.telegram.ui.web;

import ai.n3;
import ci.z7;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f42550a = 0;
    public final a1 f42551b;
    public final String f42552c;
    public final String d;
    public final Object e;
    public final Object f42553f;

    public a0(a1 a1Var, z7 z7Var, String str, gi.p1 p1Var, String str2) {
        this.f42551b = a1Var;
        this.e = z7Var;
        this.f42552c = str;
        this.f42553f = p1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42550a) {
            case 0:
                z7 z7Var = (z7) this.e;
                gi.p1 p1Var = (gi.p1) this.f42553f;
                String str = this.d;
                String str2 = (String) obj;
                a1 a1Var = this.f42551b;
                String str3 = this.f42552c;
                if (str2 == null) {
                    a1Var.x(z7Var, "secure_storage_failed", a1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    p1Var.j(str2);
                    a1Var.x(z7Var, "secure_storage_key_restored", a1.B("req_id", str3, "value", (String) p1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    a1Var.x(z7Var, "secure_storage_failed", a1.B("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                a1 a1Var2 = this.f42551b;
                AndroidUtilities.runOnUIThread(new n3(a1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.f42552c, this.d, (String) this.f42553f, 26));
                return;
        }
    }

    public a0(a1 a1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f42551b = a1Var;
        this.e = b2Var;
        this.f42552c = str;
        this.d = str2;
        this.f42553f = str3;
    }
}
