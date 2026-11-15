package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class a2 {
    public static a2 f52572e;
    public HashMap f52573a;
    public boolean f52574b;
    public boolean f52575c;
    public boolean d;

    public static a2 b() {
        if (f52572e == null) {
            f52572e = new Object();
        }
        return f52572e;
    }

    public final z1 a(String str) {
        c();
        z1 z1Var = (z1) this.f52573a.get(str);
        if (z1Var == null) {
            return null;
        }
        z1Var.f52888a = Math.max(z1Var.f52888a, System.currentTimeMillis());
        d();
        return z1Var;
    }

    public final void c() {
        if (!this.f52574b && !this.f52575c) {
            this.f52575c = true;
            if (this.f52573a == null) {
                this.f52573a = new HashMap();
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
        boolean z10 = r2.f26198a;
        org.telegram.messenger.g0.i3(w1Var, 1000L);
    }
}
