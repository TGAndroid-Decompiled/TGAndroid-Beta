package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class a2 {
    public static a2 f52575e;
    public HashMap f52576a;
    public boolean f52577b;
    public boolean f52578c;
    public boolean d;

    public static a2 b() {
        if (f52575e == null) {
            f52575e = new Object();
        }
        return f52575e;
    }

    public final z1 a(String str) {
        c();
        z1 z1Var = (z1) this.f52576a.get(str);
        if (z1Var == null) {
            return null;
        }
        z1Var.f52891a = Math.max(z1Var.f52891a, System.currentTimeMillis());
        d();
        return z1Var;
    }

    public final void c() {
        if (!this.f52577b && !this.f52578c) {
            this.f52578c = true;
            if (this.f52576a == null) {
                this.f52576a = new HashMap();
            }
            Utilities.f22416e.c(new w1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new w1(this, 0));
        if (this.d) {
            return;
        }
        w1 w1Var = new w1(this, 0);
        boolean z10 = r2.f26206a;
        org.telegram.messenger.g0.i3(w1Var, 1000L);
    }
}
