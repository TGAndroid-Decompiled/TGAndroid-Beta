package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z implements Utilities.Callback {
    public final int f38917a = 0;
    public final b1 f38918b;
    public final String f38919c;
    public final String d;
    public final Object e;
    public final Object f38920f;

    public z(b1 b1Var, da daVar, String str, ei.t1 t1Var, String str2) {
        this.f38918b = b1Var;
        this.e = daVar;
        this.f38919c = str;
        this.f38920f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38917a) {
            case 0:
                da daVar = (da) this.e;
                ei.t1 t1Var = (ei.t1) this.f38920f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.f38918b;
                String str3 = this.f38919c;
                if (str2 == null) {
                    b1Var.y(daVar, "secure_storage_failed", b1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    t1Var.j(str2);
                    b1Var.y(daVar, "secure_storage_key_restored", b1.C("req_id", str3, "value", (String) t1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    b1Var.y(daVar, "secure_storage_failed", b1.C("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                b1 b1Var2 = this.f38918b;
                AndroidUtilities.runOnUIThread(new z8(b1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.f38919c, this.d, (String) this.f38920f, 14));
                return;
        }
    }

    public z(b1 b1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f38918b = b1Var;
        this.e = b2Var;
        this.f38919c = str;
        this.d = str2;
        this.f38920f = str3;
    }
}
