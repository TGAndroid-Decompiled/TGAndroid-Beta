package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s2;
public final class b2 {
    public static b2 f53342e;
    public HashMap f53343a;
    public boolean f53344b;
    public boolean f53345c;
    public boolean d;

    public static b2 b() {
        if (f53342e == null) {
            f53342e = new Object();
        }
        return f53342e;
    }

    public final a2 a(String str) {
        c();
        a2 a2Var = (a2) this.f53343a.get(str);
        if (a2Var == null) {
            return null;
        }
        a2Var.f53330a = Math.max(a2Var.f53330a, System.currentTimeMillis());
        d();
        return a2Var;
    }

    public final void c() {
        if (!this.f53344b && !this.f53345c) {
            this.f53345c = true;
            if (this.f53343a == null) {
                this.f53343a = new HashMap();
            }
            Utilities.f22877e.c(new x1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new x1(this, 0));
        if (this.d) {
            return;
        }
        x1 x1Var = new x1(this, 0);
        boolean z10 = s2.f26829a;
        org.telegram.messenger.g0.h3(x1Var, 1000L);
    }
}
