package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class n2 {
    public static n2 e;
    public HashMap f41132a;
    public boolean f41133b;
    public boolean f41134c;
    public boolean d;

    public static n2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final m2 a(String str) {
        c();
        m2 m2Var = (m2) this.f41132a.get(str);
        if (m2Var == null) {
            return null;
        }
        m2Var.f41121a = Math.max(m2Var.f41121a, System.currentTimeMillis());
        d();
        return m2Var;
    }

    public final void c() {
        if (!this.f41133b && !this.f41134c) {
            this.f41134c = true;
            if (this.f41132a == null) {
                this.f41132a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new j2(this, 1));
        }
    }

    public final void d() {
        long j10;
        AndroidUtilities.cancelRunOnUIThread(new j2(this, 0));
        if (this.d) {
            return;
        }
        j2 j2Var = new j2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j10 = 1;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(j2Var, j10);
    }
}
