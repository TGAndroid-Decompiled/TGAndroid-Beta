package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class b2 {
    public static b2 f51041e;
    public HashMap f51042a;
    public boolean f51043b;
    public boolean f51044c;
    public boolean d;

    public static b2 b() {
        if (f51041e == null) {
            f51041e = new Object();
        }
        return f51041e;
    }

    public final a2 a(String str) {
        c();
        a2 a2Var = (a2) this.f51042a.get(str);
        if (a2Var == null) {
            return null;
        }
        a2Var.f51026a = Math.max(a2Var.f51026a, System.currentTimeMillis());
        d();
        return a2Var;
    }

    public final void c() {
        if (!this.f51043b && !this.f51044c) {
            this.f51044c = true;
            if (this.f51042a == null) {
                this.f51042a = new HashMap();
            }
            Utilities.f21341e.c(new x1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new x1(this, 0));
        if (this.d) {
            return;
        }
        x1 x1Var = new x1(this, 0);
        boolean z9 = r2.f25216a;
        org.telegram.messenger.g0.i3(x1Var, 1000L);
    }
}
