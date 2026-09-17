package org.telegram.ui.web;

import bi.h8;
import bi.k9;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b0 implements Utilities.Callback {
    public final int f42034a = 0;
    public final d1 f42035b;
    public final String f42036c;
    public final String d;
    public final Object f42037e;
    public final Object f42038f;

    public b0(d1 d1Var, k9 k9Var, String str, fi.t1 t1Var, String str2) {
        this.f42035b = d1Var;
        this.f42037e = k9Var;
        this.f42036c = str;
        this.f42038f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42034a) {
            case 0:
                k9 k9Var = (k9) this.f42037e;
                fi.t1 t1Var = (fi.t1) this.f42038f;
                String str = this.d;
                String str2 = (String) obj;
                d1 d1Var = this.f42035b;
                String str3 = this.f42036c;
                if (str2 == null) {
                    d1Var.y(k9Var, "secure_storage_failed", d1.C("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    t1Var.j(str2);
                    d1Var.y(k9Var, "secure_storage_key_restored", d1.C("req_id", str3, "value", (String) t1Var.f(str).first));
                    return;
                } catch (Exception e7) {
                    d1Var.y(k9Var, "secure_storage_failed", d1.C("req_id", str3, "error", e7.getMessage()));
                    return;
                }
            default:
                d1 d1Var2 = this.f42035b;
                AndroidUtilities.runOnUIThread(new h8(d1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.f42037e, this.f42036c, this.d, (String) this.f42038f, 14));
                return;
        }
    }

    public b0(d1 d1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f42035b = d1Var;
        this.f42037e = b2Var;
        this.f42036c = str;
        this.d = str2;
        this.f42038f = str3;
    }
}
