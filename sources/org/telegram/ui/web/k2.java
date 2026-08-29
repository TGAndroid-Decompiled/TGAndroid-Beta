package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class k2 {
    public static k2 f44091e;
    public HashMap f44092a;
    public boolean f44093b;
    public boolean f44094c;
    public boolean d;

    public static k2 b() {
        if (f44091e == null) {
            f44091e = new Object();
        }
        return f44091e;
    }

    public final j2 a(String str) {
        c();
        j2 j2Var = (j2) this.f44092a.get(str);
        if (j2Var == null) {
            return null;
        }
        j2Var.f44076a = Math.max(j2Var.f44076a, System.currentTimeMillis());
        d();
        return j2Var;
    }

    public final void c() {
        if (!this.f44093b && !this.f44094c) {
            this.f44094c = true;
            if (this.f44092a == null) {
                this.f44092a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new g2(this, 1));
        }
    }

    public final void d() {
        long j10;
        AndroidUtilities.cancelRunOnUIThread(new g2(this, 0));
        if (this.d) {
            return;
        }
        g2 g2Var = new g2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j10 = 1;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(g2Var, j10);
    }
}
