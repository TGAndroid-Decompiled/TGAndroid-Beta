package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class l2 {
    public static l2 e;
    public HashMap f39573a;
    public boolean f39574b;
    public boolean f39575c;
    public boolean d;

    public static l2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final k2 a(String str) {
        c();
        k2 k2Var = (k2) this.f39573a.get(str);
        if (k2Var == null) {
            return null;
        }
        k2Var.f39559a = Math.max(k2Var.f39559a, System.currentTimeMillis());
        d();
        return k2Var;
    }

    public final void c() {
        if (!this.f39574b && !this.f39575c) {
            this.f39575c = true;
            if (this.f39573a == null) {
                this.f39573a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new h2(this, 1));
        }
    }

    public final void d() {
        long j10;
        AndroidUtilities.cancelRunOnUIThread(new h2(this, 0));
        if (this.d) {
            return;
        }
        h2 h2Var = new h2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j10 = 1;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(h2Var, j10);
    }
}
