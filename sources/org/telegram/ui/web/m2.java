package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class m2 {
    public static m2 e;
    public HashMap f38779a;
    public boolean f38780b;
    public boolean f38781c;
    public boolean d;

    public static m2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final l2 a(String str) {
        c();
        l2 l2Var = (l2) this.f38779a.get(str);
        if (l2Var == null) {
            return null;
        }
        l2Var.f38769a = Math.max(l2Var.f38769a, System.currentTimeMillis());
        d();
        return l2Var;
    }

    public final void c() {
        if (!this.f38780b && !this.f38781c) {
            this.f38781c = true;
            if (this.f38779a == null) {
                this.f38779a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new i2(this, 1));
        }
    }

    public final void d() {
        long j3;
        AndroidUtilities.cancelRunOnUIThread(new i2(this, 0));
        if (this.d) {
            return;
        }
        i2 i2Var = new i2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j3 = 1;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(i2Var, j3);
    }
}
