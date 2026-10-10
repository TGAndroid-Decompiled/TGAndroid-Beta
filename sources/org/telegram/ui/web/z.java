package org.telegram.ui.web;

import ai.a9;
import ai.ea;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z implements Utilities.Callback {
    public final int f43599a = 0;
    public final b1 f43600b;
    public final String f43601c;
    public final String d;
    public final Object f43602e;
    public final Object f43603f;

    public z(b1 b1Var, ea eaVar, String str, ei.t1 t1Var, String str2) {
        this.f43600b = b1Var;
        this.f43602e = eaVar;
        this.f43601c = str;
        this.f43603f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43599a) {
            case 0:
                ea eaVar = (ea) this.f43602e;
                ei.t1 t1Var = (ei.t1) this.f43603f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.f43600b;
                String str3 = this.f43601c;
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
                b1 b1Var2 = this.f43600b;
                AndroidUtilities.runOnUIThread(new a9(b1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.f43602e, this.f43601c, this.d, (String) this.f43603f, 19));
                return;
        }
    }

    public z(b1 b1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f43600b = b1Var;
        this.f43602e = b2Var;
        this.f43601c = str;
        this.d = str2;
        this.f43603f = str3;
    }
}
