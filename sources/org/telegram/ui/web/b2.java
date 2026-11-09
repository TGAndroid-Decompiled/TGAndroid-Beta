package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class b2 {
    public static b2 f51087e;
    public HashMap f51088a;
    public boolean f51089b;
    public boolean f51090c;
    public boolean d;

    public static b2 b() {
        if (f51087e == null) {
            f51087e = new Object();
        }
        return f51087e;
    }

    public final a2 a(String str) {
        c();
        a2 a2Var = (a2) this.f51088a.get(str);
        if (a2Var == null) {
            return null;
        }
        a2Var.f51072a = Math.max(a2Var.f51072a, System.currentTimeMillis());
        d();
        return a2Var;
    }

    public final void c() {
        if (!this.f51089b && !this.f51090c) {
            this.f51090c = true;
            if (this.f51088a == null) {
                this.f51088a = new HashMap();
            }
            Utilities.f21336e.c(new x1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new x1(this, 0));
        if (this.d) {
            return;
        }
        x1 x1Var = new x1(this, 0);
        boolean z9 = r2.f25212a;
        org.telegram.messenger.g0.i3(x1Var, 1000L);
    }
}
