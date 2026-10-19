package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class m2 {
    public static m2 e;
    public HashMap f42722a;
    public boolean f42723b;
    public boolean f42724c;
    public boolean d;

    public static m2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final l2 a(String str) {
        c();
        l2 l2Var = (l2) this.f42722a.get(str);
        if (l2Var == null) {
            return null;
        }
        l2Var.f42707a = Math.max(l2Var.f42707a, System.currentTimeMillis());
        d();
        return l2Var;
    }

    public final void c() {
        if (!this.f42723b && !this.f42724c) {
            this.f42724c = true;
            if (this.f42722a == null) {
                this.f42722a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new i2(this, 1));
        }
    }

    public final void d() {
        long j10;
        AndroidUtilities.cancelRunOnUIThread(new i2(this, 0));
        if (this.d) {
            return;
        }
        i2 i2Var = new i2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j10 = 1;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(i2Var, j10);
    }
}
