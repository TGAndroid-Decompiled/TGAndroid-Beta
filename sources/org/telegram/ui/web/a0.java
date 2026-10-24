package org.telegram.ui.web;

import ai.g3;
import ci.y7;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f43019a = 0;
    public final b1 f43020b;
    public final String f43021c;
    public final String d;
    public final Object e;
    public final Object f43022f;

    public a0(b1 b1Var, y7 y7Var, String str, gi.p1 p1Var, String str2) {
        this.f43020b = b1Var;
        this.e = y7Var;
        this.f43021c = str;
        this.f43022f = p1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43019a) {
            case 0:
                y7 y7Var = (y7) this.e;
                gi.p1 p1Var = (gi.p1) this.f43022f;
                String str = this.d;
                String str2 = (String) obj;
                b1 b1Var = this.f43020b;
                String str3 = this.f43021c;
                if (str2 == null) {
                    b1Var.x(y7Var, "secure_storage_failed", b1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    p1Var.j(str2);
                    b1Var.x(y7Var, "secure_storage_key_restored", b1.B("req_id", str3, "value", (String) p1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    b1Var.x(y7Var, "secure_storage_failed", b1.B("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                b1 b1Var2 = this.f43020b;
                AndroidUtilities.runOnUIThread(new g3(b1Var2, (File) obj, (org.telegram.ui.ActionBar.c2) this.e, this.f43021c, this.d, (String) this.f43022f, 26));
                return;
        }
    }

    public a0(b1 b1Var, org.telegram.ui.ActionBar.c2 c2Var, String str, String str2, String str3) {
        this.f43020b = b1Var;
        this.e = c2Var;
        this.f43021c = str;
        this.d = str2;
        this.f43022f = str3;
    }
}
