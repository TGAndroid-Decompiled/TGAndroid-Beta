package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z implements Utilities.Callback {
    public final int f39237a = 0;
    public final c1 f39238b;
    public final String f39239c;
    public final String d;
    public final Object e;
    public final Object f39240f;

    public z(c1 c1Var, da daVar, String str, ei.t1 t1Var, String str2) {
        this.f39238b = c1Var;
        this.e = daVar;
        this.f39239c = str;
        this.f39240f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39237a) {
            case 0:
                da daVar = (da) this.e;
                ei.t1 t1Var = (ei.t1) this.f39240f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.f39238b;
                String str3 = this.f39239c;
                if (str2 == null) {
                    c1Var.y(daVar, "secure_storage_failed", c1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    t1Var.j(str2);
                    c1Var.y(daVar, "secure_storage_key_restored", c1.C("req_id", str3, "value", (String) t1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    c1Var.y(daVar, "secure_storage_failed", c1.C("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                c1 c1Var2 = this.f39238b;
                AndroidUtilities.runOnUIThread(new z8(c1Var2, (File) obj, (org.telegram.ui.ActionBar.c2) this.e, this.f39239c, this.d, (String) this.f39240f, 14));
                return;
        }
    }

    public z(c1 c1Var, org.telegram.ui.ActionBar.c2 c2Var, String str, String str2, String str3) {
        this.f39238b = c1Var;
        this.e = c2Var;
        this.f39239c = str;
        this.d = str2;
        this.f39240f = str3;
    }
}
