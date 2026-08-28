package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class i2 {
    public static i2 f43893e;
    public HashMap f43894a;
    public boolean f43895b;
    public boolean f43896c;
    public boolean d;

    public static i2 b() {
        if (f43893e == null) {
            f43893e = new Object();
        }
        return f43893e;
    }

    public final h2 a(String str) {
        c();
        h2 h2Var = (h2) this.f43894a.get(str);
        if (h2Var == null) {
            return null;
        }
        h2Var.f43879a = Math.max(h2Var.f43879a, System.currentTimeMillis());
        d();
        return h2Var;
    }

    public final void c() {
        if (!this.f43895b && !this.f43896c) {
            this.f43896c = true;
            if (this.f43894a == null) {
                this.f43894a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new e2(this, 1));
        }
    }

    public final void d() {
        long j10;
        AndroidUtilities.cancelRunOnUIThread(new e2(this, 0));
        if (this.d) {
            return;
        }
        e2 e2Var = new e2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j10 = 1;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(e2Var, j10);
    }
}
