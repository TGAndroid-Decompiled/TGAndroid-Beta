package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class o2 {
    public static o2 e;
    public HashMap f39025a;
    public boolean f39026b;
    public boolean f39027c;
    public boolean d;

    public static o2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.f39025a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.f39015a = Math.max(n2Var.f39015a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (!this.f39026b && !this.f39027c) {
            this.f39027c = true;
            if (this.f39025a == null) {
                this.f39025a = new HashMap();
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
