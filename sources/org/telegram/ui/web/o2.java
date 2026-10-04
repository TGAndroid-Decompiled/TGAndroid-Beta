package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class o2 {
    public static o2 f42302e;
    public HashMap f42303a;
    public boolean f42304b;
    public boolean f42305c;
    public boolean d;

    public static o2 b() {
        if (f42302e == null) {
            f42302e = new Object();
        }
        return f42302e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.f42303a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.f42281a = Math.max(n2Var.f42281a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (!this.f42304b && !this.f42305c) {
            this.f42305c = true;
            if (this.f42303a == null) {
                this.f42303a = new HashMap();
            }
            Utilities.globalQueue.postRunnable(new k2(this, 1));
        }
    }

    public final void d() {
        long j3;
        AndroidUtilities.cancelRunOnUIThread(new k2(this, 0));
        if (this.d) {
            return;
        }
        k2 k2Var = new k2(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            j3 = 1;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(k2Var, j3);
    }
}
