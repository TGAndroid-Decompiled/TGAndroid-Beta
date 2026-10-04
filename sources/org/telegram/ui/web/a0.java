package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f42089a = 0;
    public final c1 f42090b;
    public final String f42091c;
    public final String d;
    public final Object f42092e;
    public final Object f42093f;

    public a0(c1 c1Var, da daVar, String str, ei.u1 u1Var, String str2) {
        this.f42090b = c1Var;
        this.f42092e = daVar;
        this.f42091c = str;
        this.f42093f = u1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42089a) {
            case 0:
                da daVar = (da) this.f42092e;
                ei.u1 u1Var = (ei.u1) this.f42093f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.f42090b;
                String str3 = this.f42091c;
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
                c1 c1Var2 = this.f42090b;
                AndroidUtilities.runOnUIThread(new z8(c1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.f42092e, this.f42091c, this.d, (String) this.f42093f, 14));
                return;
        }
    }

    public a0(c1 c1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f42090b = c1Var;
        this.f42092e = b2Var;
        this.f42091c = str;
        this.d = str2;
        this.f42093f = str3;
    }
}
