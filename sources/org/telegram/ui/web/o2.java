package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class o2 {
    public static o2 f42201e;
    public HashMap f42202a;
    public boolean f42203b;
    public boolean f42204c;
    public boolean d;

    public static o2 b() {
        if (f42201e == null) {
            f42201e = new Object();
        }
        return f42201e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.f42202a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.f42189a = Math.max(n2Var.f42189a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (!this.f42203b && !this.f42204c) {
            this.f42204c = true;
            if (this.f42202a == null) {
                this.f42202a = new HashMap();
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
