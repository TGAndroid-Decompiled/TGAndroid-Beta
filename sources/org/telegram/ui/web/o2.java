package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class o2 {
    public static o2 f42301e;
    public HashMap f42302a;
    public boolean f42303b;
    public boolean f42304c;
    public boolean d;

    public static o2 b() {
        if (f42301e == null) {
            f42301e = new Object();
        }
        return f42301e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.f42302a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.f42280a = Math.max(n2Var.f42280a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (!this.f42303b && !this.f42304c) {
            this.f42304c = true;
            if (this.f42302a == null) {
                this.f42302a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new k2(this, 1));
        }
    }

    public final void d() {
        long j3;
        AndroidUtilities.cancelRunOnUIThread(new k2(this, 0));
        if (this.d) {
            return;
        }
        k2 k2Var = new k2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j3 = 1;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(k2Var, j3);
    }
}
