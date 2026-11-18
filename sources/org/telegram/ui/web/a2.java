package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s2;
public final class a2 {
    public static a2 f53055e;
    public HashMap f53056a;
    public boolean f53057b;
    public boolean f53058c;
    public boolean d;

    public static a2 b() {
        if (f53055e == null) {
            f53055e = new Object();
        }
        return f53055e;
    }

    public final z1 a(String str) {
        c();
        z1 z1Var = (z1) this.f53056a.get(str);
        if (z1Var == null) {
            return null;
        }
        z1Var.f53372a = Math.max(z1Var.f53372a, System.currentTimeMillis());
        d();
        return z1Var;
    }

    public final void c() {
        if (!this.f53057b && !this.f53058c) {
            this.f53058c = true;
            if (this.f53056a == null) {
                this.f53056a = new HashMap();
            }
            Utilities.f22779e.c(new w1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new w1(this, 0));
        if (this.d) {
            return;
        }
        w1 w1Var = new w1(this, 0);
        boolean z10 = s2.f26721a;
        org.telegram.messenger.g0.h3(w1Var, 1000L);
    }
}
