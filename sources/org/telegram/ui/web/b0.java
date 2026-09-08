package org.telegram.ui.web;

import bi.h8;
import bi.k9;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b0 implements Utilities.Callback {
    public final int f42033a = 0;
    public final d1 f42034b;
    public final String f42035c;
    public final String d;
    public final Object f42036e;
    public final Object f42037f;

    public b0(d1 d1Var, k9 k9Var, String str, fi.t1 t1Var, String str2) {
        this.f42034b = d1Var;
        this.f42036e = k9Var;
        this.f42035c = str;
        this.f42037f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42033a) {
            case 0:
                k9 k9Var = (k9) this.f42036e;
                fi.t1 t1Var = (fi.t1) this.f42037f;
                String str = this.d;
                String str2 = (String) obj;
                d1 d1Var = this.f42034b;
                String str3 = this.f42035c;
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
                d1 d1Var2 = this.f42034b;
                AndroidUtilities.runOnUIThread(new h8(d1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.f42036e, this.f42035c, this.d, (String) this.f42037f, 14));
                return;
        }
    }

    public b0(d1 d1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f42034b = d1Var;
        this.f42036e = b2Var;
        this.f42035c = str;
        this.d = str2;
        this.f42037f = str3;
    }
}
