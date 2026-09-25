package org.telegram.ui.web;

import ai.da;
import ai.z8;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z implements Utilities.Callback {
    public final int f39290a = 0;
    public final b1 f39291b;
    public final String f39292c;
    public final String d;
    public final Object e;
    public final Object f39293f;

    public z(b1 b1Var, da daVar, String str, ei.t1 t1Var, String str2) {
        this.f39291b = b1Var;
        this.e = daVar;
        this.f39292c = str;
        this.f39293f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39290a) {
            case 0:
                da daVar = (da) this.e;
                ei.t1 t1Var = (ei.t1) this.f39293f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.f39291b;
                String str3 = this.f39292c;
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
                b1 b1Var2 = this.f39291b;
                AndroidUtilities.runOnUIThread(new z8(b1Var2, (File) obj, (org.telegram.ui.ActionBar.a2) this.e, this.f39292c, this.d, (String) this.f39293f, 14));
                return;
        }
    }

    public z(b1 b1Var, org.telegram.ui.ActionBar.a2 a2Var, String str, String str2, String str3) {
        this.f39291b = b1Var;
        this.e = a2Var;
        this.f39292c = str;
        this.d = str2;
        this.f39293f = str3;
    }
}
