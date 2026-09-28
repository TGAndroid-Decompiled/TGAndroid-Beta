package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class n2 {
    public static n2 e;
    public HashMap f39158a;
    public boolean f39159b;
    public boolean f39160c;
    public boolean d;

    public static n2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final m2 a(String str) {
        c();
        m2 m2Var = (m2) this.f39158a.get(str);
        if (m2Var == null) {
            return null;
        }
        m2Var.f39145a = Math.max(m2Var.f39145a, System.currentTimeMillis());
        d();
        return m2Var;
    }

    public final void c() {
        if (!this.f39159b && !this.f39160c) {
            this.f39160c = true;
            if (this.f39158a == null) {
                this.f39158a = new HashMap();
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
