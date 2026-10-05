package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f42108a = 0;
    public final c1 f42109b;
    public final String f42110c;
    public final String d;
    public final Object f42111e;
    public final Object f42112f;

    public a0(c1 c1Var, da daVar, String str, ei.u1 u1Var, String str2) {
        this.f42109b = c1Var;
        this.f42111e = daVar;
        this.f42110c = str;
        this.f42112f = u1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42108a) {
            case 0:
                da daVar = (da) this.f42111e;
                ei.u1 u1Var = (ei.u1) this.f42112f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.f42109b;
                String str3 = this.f42110c;
                if (str2 == null) {
                    c1Var.y(daVar, "secure_storage_failed", c1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    u1Var.j(str2);
                    c1Var.y(daVar, "secure_storage_key_restored", c1.C("req_id", str3, "value", (String) u1Var.f(str).first));
                    return;
                } catch (Exception e7) {
                    c1Var.y(daVar, "secure_storage_failed", c1.C("req_id", str3, "error", e7.getMessage()));
                    return;
                }
            default:
                c1 c1Var2 = this.f42109b;
                AndroidUtilities.runOnUIThread(new z8(c1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.f42111e, this.f42110c, this.d, (String) this.f42112f, 14));
                return;
        }
    }

    public a0(c1 c1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f42109b = c1Var;
        this.f42111e = b2Var;
        this.f42110c = str;
        this.d = str2;
        this.f42112f = str3;
    }
}
