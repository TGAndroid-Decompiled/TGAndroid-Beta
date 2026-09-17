package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class o2 {
    public static o2 f42228e;
    public HashMap f42229a;
    public boolean f42230b;
    public boolean f42231c;
    public boolean d;

    public static o2 b() {
        if (f42228e == null) {
            f42228e = new Object();
        }
        return f42228e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.f42229a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.f42216a = Math.max(n2Var.f42216a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (!this.f42230b && !this.f42231c) {
            this.f42231c = true;
            if (this.f42229a == null) {
                this.f42229a = new HashMap();
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
