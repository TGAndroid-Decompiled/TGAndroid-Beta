package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

public final class j2 {

    public static j2 f43880e;

    public HashMap f43881a;

    public boolean f43882b;

    public boolean f43883c;
    public boolean d;

    public static j2 b() {
        if (f43880e == null) {
            f43880e = new j2();
        }
        return f43880e;
    }

    public final i2 a(String str) {
        c();
        i2 i2Var = (i2) this.f43881a.get(str);
        if (i2Var == null) {
            return null;
        }
        i2Var.f43866a = Math.max(i2Var.f43866a, System.currentTimeMillis());
        d();
        return i2Var;
    }

    public final void c() {
        if (this.f43882b || this.f43883c) {
            return;
        }
        this.f43883c = true;
        if (this.f43881a == null) {
            this.f43881a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new f2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new f2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new f2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
