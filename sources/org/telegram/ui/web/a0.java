package org.telegram.ui.web;

import bi.c3;
import di.x7;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f44661a = 0;
    public final a1 f44662b;
    public final String f44663c;
    public final String d;
    public final Object e;
    public final Object f44664f;

    public a0(a1 a1Var, x7 x7Var, String str, hi.w1 w1Var, String str2) {
        this.f44662b = a1Var;
        this.e = x7Var;
        this.f44663c = str;
        this.f44664f = w1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44661a) {
            case 0:
                x7 x7Var = (x7) this.e;
                hi.w1 w1Var = (hi.w1) this.f44664f;
                String str = this.d;
                String str2 = (String) obj;
                a1 a1Var = this.f44662b;
                String str3 = this.f44663c;
                if (str2 == null) {
                    a1Var.x(x7Var, "secure_storage_failed", a1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    w1Var.j(str2);
                    a1Var.x(x7Var, "secure_storage_key_restored", a1.B("req_id", str3, "value", (String) w1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    a1Var.x(x7Var, "secure_storage_failed", a1.B("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                a1 a1Var2 = this.f44662b;
                AndroidUtilities.runOnUIThread(new c3(a1Var2, (File) obj, (org.telegram.ui.ActionBar.e2) this.e, this.f44663c, this.d, (String) this.f44664f, 26));
                return;
        }
    }

    public a0(a1 a1Var, org.telegram.ui.ActionBar.e2 e2Var, String str, String str2, String str3) {
        this.f44662b = a1Var;
        this.e = e2Var;
        this.f44663c = str;
        this.d = str2;
        this.f44664f = str3;
    }
}
