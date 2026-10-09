package org.telegram.ui.web;

import ai.a9;
import ai.ea;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z implements Utilities.Callback {
    public final int f43553a = 0;
    public final b1 f43554b;
    public final String f43555c;
    public final String d;
    public final Object f43556e;
    public final Object f43557f;

    public z(b1 b1Var, ea eaVar, String str, ei.t1 t1Var, String str2) {
        this.f43554b = b1Var;
        this.f43556e = eaVar;
        this.f43555c = str;
        this.f43557f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43553a) {
            case 0:
                ea eaVar = (ea) this.f43556e;
                ei.t1 t1Var = (ei.t1) this.f43557f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.f43554b;
                String str3 = this.f43555c;
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
                b1 b1Var2 = this.f43554b;
                AndroidUtilities.runOnUIThread(new a9(b1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.f43556e, this.f43555c, this.d, (String) this.f43557f, 19));
                return;
        }
    }

    public z(b1 b1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f43554b = b1Var;
        this.f43556e = b2Var;
        this.f43555c = str;
        this.d = str2;
        this.f43557f = str3;
    }
}
