package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f38868a = 0;
    public final d1 f38869b;
    public final String f38870c;
    public final String d;
    public final Object e;
    public final Object f38871f;

    public a0(d1 d1Var, da daVar, String str, ei.t1 t1Var, String str2) {
        this.f38869b = d1Var;
        this.e = daVar;
        this.f38870c = str;
        this.f38871f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38868a) {
            case 0:
                da daVar = (da) this.e;
                ei.t1 t1Var = (ei.t1) this.f38871f;
                String str = this.d;
                String str2 = (String) obj;
                d1 d1Var = this.f38869b;
                String str3 = this.f38870c;
                if (str2 == null) {
                    d1Var.y(daVar, "secure_storage_failed", d1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    t1Var.j(str2);
                    d1Var.y(daVar, "secure_storage_key_restored", d1.C("req_id", str3, "value", (String) t1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    d1Var.y(daVar, "secure_storage_failed", d1.C("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                d1 d1Var2 = this.f38869b;
                AndroidUtilities.runOnUIThread(new z8(d1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.f38870c, this.d, (String) this.f38871f, 14));
                return;
        }
    }

    public a0(d1 d1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f38869b = d1Var;
        this.e = b2Var;
        this.f38870c = str;
        this.d = str2;
        this.f38871f = str3;
    }
}
