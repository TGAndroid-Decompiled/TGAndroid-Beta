package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;
public final class m2 {
    public static m2 f42641e;
    public HashMap f42642a;
    public boolean f42643b;
    public boolean f42644c;
    public boolean d;

    public static m2 b() {
        if (f42641e == null) {
            f42641e = new Object();
        }
        return f42641e;
    }

    public final l2 a(String str) {
        c();
        l2 l2Var = (l2) this.f42642a.get(str);
        if (l2Var == null) {
            return null;
        }
        l2Var.f42625a = Math.max(l2Var.f42625a, System.currentTimeMillis());
        d();
        return l2Var;
    }

    public final void c() {
        if (!this.f42643b && !this.f42644c) {
            this.f42644c = true;
            if (this.f42642a == null) {
                this.f42642a = new HashMap();
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
