package org.telegram.ui.web;

import bi.h8;
import bi.k9;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b0 implements Utilities.Callback {
    public final int f42006a = 0;
    public final d1 f42007b;
    public final String f42008c;
    public final String d;
    public final Object f42009e;
    public final Object f42010f;

    public b0(d1 d1Var, k9 k9Var, String str, fi.t1 t1Var, String str2) {
        this.f42007b = d1Var;
        this.f42009e = k9Var;
        this.f42008c = str;
        this.f42010f = t1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42006a) {
            case 0:
                k9 k9Var = (k9) this.f42009e;
                fi.t1 t1Var = (fi.t1) this.f42010f;
                String str = this.d;
                String str2 = (String) obj;
                d1 d1Var = this.f42007b;
                String str3 = this.f42008c;
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
                d1 d1Var2 = this.f42007b;
                AndroidUtilities.runOnUIThread(new h8(d1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.f42009e, this.f42008c, this.d, (String) this.f42010f, 14));
                return;
        }
    }

    public b0(d1 d1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f42007b = d1Var;
        this.f42009e = b2Var;
        this.f42008c = str;
        this.d = str2;
        this.f42010f = str3;
    }
}
