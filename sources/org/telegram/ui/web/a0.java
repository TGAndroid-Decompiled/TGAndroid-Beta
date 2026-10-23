package org.telegram.ui.web;

import ai.g3;
import ci.z7;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a0 implements Utilities.Callback {
    public final int f42561a = 0;
    public final a1 f42562b;
    public final String f42563c;
    public final String d;
    public final Object e;
    public final Object f42564f;

    public a0(a1 a1Var, z7 z7Var, String str, gi.p1 p1Var, String str2) {
        this.f42562b = a1Var;
        this.e = z7Var;
        this.f42563c = str;
        this.f42564f = p1Var;
        this.d = str2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42561a) {
            case 0:
                z7 z7Var = (z7) this.e;
                gi.p1 p1Var = (gi.p1) this.f42564f;
                String str = this.d;
                String str2 = (String) obj;
                a1 a1Var = this.f42562b;
                String str3 = this.f42563c;
                if (str2 == null) {
                    a1Var.x(z7Var, "secure_storage_failed", a1.B("req_id", str3, "error", "RESTORE_CANCELLED"));
                    return;
                }
                try {
                    p1Var.j(str2);
                    a1Var.x(z7Var, "secure_storage_key_restored", a1.B("req_id", str3, "value", (String) p1Var.f(str).first));
                    return;
                } catch (Exception e) {
                    a1Var.x(z7Var, "secure_storage_failed", a1.B("req_id", str3, "error", e.getMessage()));
                    return;
                }
            default:
                a1 a1Var2 = this.f42562b;
                AndroidUtilities.runOnUIThread(new g3(a1Var2, (File) obj, (org.telegram.ui.ActionBar.b2) this.e, this.f42563c, this.d, (String) this.f42564f, 26));
                return;
        }
    }

    public a0(a1 a1Var, org.telegram.ui.ActionBar.b2 b2Var, String str, String str2, String str3) {
        this.f42562b = a1Var;
        this.e = b2Var;
        this.f42563c = str;
        this.d = str2;
        this.f42564f = str3;
    }
}
