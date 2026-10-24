package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class n2 {
    public static n2 e;
    public HashMap f43198a;
    public boolean f43199b;
    public boolean f43200c;
    public boolean d;

    public static n2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final m2 a(String str) {
        c();
        m2 m2Var = (m2) this.f43198a.get(str);
        if (m2Var == null) {
            return null;
        }
        m2Var.f43185a = Math.max(m2Var.f43185a, System.currentTimeMillis());
        d();
        return m2Var;
    }

    public final void c() {
        if (!this.f43199b && !this.f43200c) {
            this.f43200c = true;
            if (this.f43198a == null) {
                this.f43198a = new HashMap();
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
