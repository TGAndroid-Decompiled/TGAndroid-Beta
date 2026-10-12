package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class m2 {
    public static m2 f43342e;
    public HashMap f43343a;
    public boolean f43344b;
    public boolean f43345c;
    public boolean d;

    public static m2 b() {
        if (f43342e == null) {
            f43342e = new Object();
        }
        return f43342e;
    }

    public final l2 a(String str) {
        c();
        l2 l2Var = (l2) this.f43343a.get(str);
        if (l2Var == null) {
            return null;
        }
        l2Var.f43329a = Math.max(l2Var.f43329a, System.currentTimeMillis());
        d();
        return l2Var;
    }

    public final void c() {
        if (!this.f43344b && !this.f43345c) {
            this.f43345c = true;
            if (this.f43343a == null) {
                this.f43343a = new HashMap();
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
