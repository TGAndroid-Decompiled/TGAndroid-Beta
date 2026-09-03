package org.telegram.ui.web;

import java.io.File;
import nh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f39362a = 0;
    public final c1 f39363b;
    public final String f39364c;
    public final String d;
    public final Object e;
    public final Object f39365f;

    public a0(c1 c1Var, j7 j7Var, String str, rh.i1 i1Var, String str2) {
        this.f39363b = c1Var;
        this.e = j7Var;
        this.f39364c = str;
        this.f39365f = i1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39362a) {
            case 0:
                j7 j7Var = (j7) this.e;
                rh.i1 i1Var = (rh.i1) this.f39365f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.f39363b;
                String str3 = this.f39364c;
                if (str2 == null) {
                    c1Var.z(j7Var, "secure_storage_failed", c1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    i1Var.j(str2);
                    c1Var.z(j7Var, "secure_storage_key_restored", c1.C("req_id", str3, "value", (String) i1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    c1Var.z(j7Var, "secure_storage_failed", c1.C("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                c1 c1Var2 = this.f39363b;
                AndroidUtilities.runOnUIThread(new kh.e1(c1Var2, (File) obj, (org.telegram.ui.ActionBar.d2) this.e, this.f39364c, this.d, (String) this.f39365f, 19, false));
                return;
        }
    }

    public a0(c1 c1Var, org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, String str3) {
        this.f39363b = c1Var;
        this.e = d2Var;
        this.f39364c = str;
        this.d = str2;
        this.f39365f = str3;
    }
}
