package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class n2 {
    public static n2 f43633e;
    public HashMap f43634a;
    public boolean f43635b;
    public boolean f43636c;
    public boolean d;

    public static n2 b() {
        if (f43633e == null) {
            f43633e = new Object();
        }
        return f43633e;
    }

    public final m2 a(String str) {
        c();
        m2 m2Var = (m2) this.f43634a.get(str);
        if (m2Var == null) {
            return null;
        }
        m2Var.f43619a = Math.max(m2Var.f43619a, System.currentTimeMillis());
        d();
        return m2Var;
    }

    public final void c() {
        if (!this.f43635b && !this.f43636c) {
            this.f43636c = true;
            if (this.f43634a == null) {
                this.f43634a = new HashMap();
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
