package org.telegram.ui.web;

import bi.te;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f37851a = 1;
    public final c1 f37852b;
    public final String f37853c;
    public final String d;
    public final Object e;
    public final Object f37854f;

    public a0(c1 c1Var, org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, String str3) {
        this.f37852b = c1Var;
        this.e = d2Var;
        this.f37853c = str;
        this.d = str2;
        this.f37854f = str3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37851a) {
            case 0:
                a1 a1Var = (a1) this.e;
                di.w1 w1Var = (di.w1) this.f37854f;
                String str = this.d;
                String str2 = (String) obj;
                c1 c1Var = this.f37852b;
                String str3 = this.f37853c;
                if (str2 == null) {
                    c1Var.z(a1Var, "secure_storage_failed", c1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    w1Var.j(str2);
                    c1Var.z(a1Var, "secure_storage_key_restored", c1.C("req_id", str3, "value", (String) w1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    c1Var.z(a1Var, "secure_storage_failed", c1.C("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                c1 c1Var2 = this.f37852b;
                AndroidUtilities.runOnUIThread(new te(c1Var2, (File) obj, (org.telegram.ui.ActionBar.d2) this.e, this.f37853c, this.d, (String) this.f37854f, 13));
                return;
        }
    }

    public a0(c1 c1Var, a1 a1Var, String str, di.w1 w1Var, String str2) {
        this.f37852b = c1Var;
        this.e = a1Var;
        this.f37853c = str;
        this.f37854f = w1Var;
        this.d = str2;
    }
}
