package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f38817a = 0;
    public final d1 f38818b;
    public final String f38819c;
    public final String d;
    public final Object e;
    public final Object f38820f;

    public a0(d1 d1Var, da daVar, String str, ei.t1 t1Var, String str2) {
        this.f38818b = d1Var;
        this.e = daVar;
        this.f38819c = str;
        this.f38820f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38817a) {
            case 0:
                da daVar = (da) this.e;
                ei.t1 t1Var = (ei.t1) this.f38820f;
                String str = this.d;
                String str2 = (String) obj;
                d1 d1Var = this.f38818b;
                String str3 = this.f38819c;
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
                d1 d1Var2 = this.f38818b;
                AndroidUtilities.runOnUIThread(new z8(d1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.f38819c, this.d, (String) this.f38820f, 14));
                return;
        }
    }

    public a0(d1 d1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f38818b = d1Var;
        this.e = b2Var;
        this.f38819c = str;
        this.d = str2;
        this.f38820f = str3;
    }
}
