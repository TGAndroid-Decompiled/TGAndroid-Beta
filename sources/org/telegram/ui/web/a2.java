package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s2;
public final class a2 {
    public static a2 f53102e;
    public HashMap f53103a;
    public boolean f53104b;
    public boolean f53105c;
    public boolean d;

    public static a2 b() {
        if (f53102e == null) {
            f53102e = new Object();
        }
        return f53102e;
    }

    public final z1 a(String str) {
        c();
        z1 z1Var = (z1) this.f53103a.get(str);
        if (z1Var == null) {
            return null;
        }
        z1Var.f53419a = Math.max(z1Var.f53419a, System.currentTimeMillis());
        d();
        return z1Var;
    }

    public final void c() {
        if (!this.f53104b && !this.f53105c) {
            this.f53105c = true;
            if (this.f53103a == null) {
                this.f53103a = new HashMap();
            }
            Utilities.f22810e.c(new w1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new w1(this, 0));
        if (this.d) {
            return;
        }
        w1 w1Var = new w1(this, 0);
        boolean z10 = s2.f26730a;
        org.telegram.messenger.g0.h3(w1Var, 1000L);
    }
}
