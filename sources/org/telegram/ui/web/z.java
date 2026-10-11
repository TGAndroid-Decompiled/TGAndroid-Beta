package org.telegram.ui.web;

import ai.a9;
import ai.ea;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z implements Utilities.Callback {
    public final int f43777a = 0;
    public final b1 f43778b;
    public final String f43779c;
    public final String d;
    public final Object f43780e;
    public final Object f43781f;

    public z(b1 b1Var, ea eaVar, String str, ei.t1 t1Var, String str2) {
        this.f43778b = b1Var;
        this.f43780e = eaVar;
        this.f43779c = str;
        this.f43781f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43777a) {
            case 0:
                ea eaVar = (ea) this.f43780e;
                ei.t1 t1Var = (ei.t1) this.f43781f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.f43778b;
                String str3 = this.f43779c;
                if (str2 == null) {
                    b1Var.x(eaVar, "secure_storage_failed", b1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    t1Var.j(str2);
                    b1Var.x(eaVar, "secure_storage_key_restored", b1.B("req_id", str3, "value", (String) t1Var.f(str).first));
                    return;
                } catch (Exception e7) {
                    b1Var.x(eaVar, "secure_storage_failed", b1.B("req_id", str3, "error", e7.getMessage()));
                    return;
                }
            default:
                b1 b1Var2 = this.f43778b;
                AndroidUtilities.runOnUIThread(new a9(b1Var2, (File) obj, (org.telegram.ui.ActionBar.a2) this.f43780e, this.f43779c, this.d, (String) this.f43781f, 19));
                return;
        }
    }

    public z(b1 b1Var, org.telegram.ui.ActionBar.a2 a2Var, String str, String str2, String str3) {
        this.f43778b = b1Var;
        this.f43780e = a2Var;
        this.f43779c = str;
        this.d = str2;
        this.f43781f = str3;
    }
}
