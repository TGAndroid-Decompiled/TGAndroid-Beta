package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class b2 {
    public static b2 f51106e;
    public HashMap f51107a;
    public boolean f51108b;
    public boolean f51109c;
    public boolean d;

    public static b2 b() {
        if (f51106e == null) {
            f51106e = new Object();
        }
        return f51106e;
    }

    public final a2 a(String str) {
        c();
        a2 a2Var = (a2) this.f51107a.get(str);
        if (a2Var == null) {
            return null;
        }
        a2Var.f51091a = Math.max(a2Var.f51091a, System.currentTimeMillis());
        d();
        return a2Var;
    }

    public final void c() {
        if (!this.f51108b && !this.f51109c) {
            this.f51109c = true;
            if (this.f51107a == null) {
                this.f51107a = new HashMap();
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
