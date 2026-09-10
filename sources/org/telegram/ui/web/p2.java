package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class p2 {
    public static p2 e;
    public HashMap f38052a;
    public boolean f38053b;
    public boolean f38054c;
    public boolean d;

    public static p2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final o2 a(String str) {
        c();
        o2 o2Var = (o2) this.f38052a.get(str);
        if (o2Var == null) {
            return null;
        }
        o2Var.f38034a = Math.max(o2Var.f38034a, System.currentTimeMillis());
        d();
        return o2Var;
    }

    public final void c() {
        if (!this.f38053b && !this.f38054c) {
            this.f38054c = true;
            if (this.f38052a == null) {
                this.f38052a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new l2(this, 1));
        }
    }

    public final void d() {
        long j3;
        AndroidUtilities.cancelRunOnUIThread(new l2(this, 0));
        if (this.d) {
            return;
        }
        l2 l2Var = new l2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j3 = 1;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(l2Var, j3);
    }
}
