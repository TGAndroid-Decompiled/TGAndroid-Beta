package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class n2 {
    public static n2 f43409e;
    public HashMap f43410a;
    public boolean f43411b;
    public boolean f43412c;
    public boolean d;

    public static n2 b() {
        if (f43409e == null) {
            f43409e = new Object();
        }
        return f43409e;
    }

    public final m2 a(String str) {
        c();
        m2 m2Var = (m2) this.f43410a.get(str);
        if (m2Var == null) {
            return null;
        }
        m2Var.f43395a = Math.max(m2Var.f43395a, System.currentTimeMillis());
        d();
        return m2Var;
    }

    public final void c() {
        if (!this.f43411b && !this.f43412c) {
            this.f43412c = true;
            if (this.f43410a == null) {
                this.f43410a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new j2(this, 1));
        }
    }

    public final void d() {
        long j3;
        AndroidUtilities.cancelRunOnUIThread(new j2(this, 0));
        if (this.d) {
            return;
        }
        j2 j2Var = new j2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j3 = 1;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(j2Var, j3);
    }
}
