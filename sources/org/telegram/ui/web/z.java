package org.telegram.ui.web;

import bi.k8;
import bi.n9;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z implements Utilities.Callback {
    public final int f41572a = 0;
    public final b1 f41573b;
    public final String f41574c;
    public final String d;
    public final Object e;
    public final Object f41575f;

    public z(b1 b1Var, n9 n9Var, String str, fi.s1 s1Var, String str2) {
        this.f41573b = b1Var;
        this.e = n9Var;
        this.f41574c = str;
        this.f41575f = s1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41572a) {
            case 0:
                n9 n9Var = (n9) this.e;
                fi.s1 s1Var = (fi.s1) this.f41575f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.f41573b;
                String str3 = this.f41574c;
                if (str2 == null) {
                    b1Var.x(n9Var, "secure_storage_failed", b1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    s1Var.j(str2);
                    b1Var.x(n9Var, "secure_storage_key_restored", b1.B("req_id", str3, "value", (String) s1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    b1Var.x(n9Var, "secure_storage_failed", b1.B("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                b1 b1Var2 = this.f41573b;
                AndroidUtilities.runOnUIThread(new k8(b1Var2, (File) obj, (org.telegram.ui.ActionBar.a2) this.e, this.f41574c, this.d, (String) this.f41575f, 19));
                return;
        }
    }

    public z(b1 b1Var, org.telegram.ui.ActionBar.a2 a2Var, String str, String str2, String str3) {
        this.f41573b = b1Var;
        this.e = a2Var;
        this.f41574c = str;
        this.d = str2;
        this.f41575f = str3;
    }
}
