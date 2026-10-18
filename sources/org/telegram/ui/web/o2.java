package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class o2 {
    public static o2 e;
    public HashMap f42696a;
    public boolean f42697b;
    public boolean f42698c;
    public boolean d;

    public static o2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.f42696a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.f42683a = Math.max(n2Var.f42683a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (!this.f42697b && !this.f42698c) {
            this.f42698c = true;
            if (this.f42696a == null) {
                this.f42696a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new k2(this, 1));
        }
    }

    public final void d() {
        long j10;
        AndroidUtilities.cancelRunOnUIThread(new k2(this, 0));
        if (this.d) {
            return;
        }
        k2 k2Var = new k2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j10 = 1;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(k2Var, j10);
    }
}
