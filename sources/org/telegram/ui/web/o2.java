package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class o2 {
    public static o2 f42227e;
    public HashMap f42228a;
    public boolean f42229b;
    public boolean f42230c;
    public boolean d;

    public static o2 b() {
        if (f42227e == null) {
            f42227e = new Object();
        }
        return f42227e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.f42228a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.f42215a = Math.max(n2Var.f42215a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (!this.f42229b && !this.f42230c) {
            this.f42230c = true;
            if (this.f42228a == null) {
                this.f42228a = new HashMap();
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
