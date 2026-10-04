package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class o2 {
    public static o2 f42309e;
    public HashMap f42310a;
    public boolean f42311b;
    public boolean f42312c;
    public boolean d;

    public static o2 b() {
        if (f42309e == null) {
            f42309e = new Object();
        }
        return f42309e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.f42310a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.f42288a = Math.max(n2Var.f42288a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (!this.f42311b && !this.f42312c) {
            this.f42312c = true;
            if (this.f42310a == null) {
                this.f42310a = new HashMap();
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
