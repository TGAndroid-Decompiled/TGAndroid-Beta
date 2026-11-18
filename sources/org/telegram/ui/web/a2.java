package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s2;
public final class a2 {
    public static a2 f53104e;
    public HashMap f53105a;
    public boolean f53106b;
    public boolean f53107c;
    public boolean d;

    public static a2 b() {
        if (f53104e == null) {
            f53104e = new Object();
        }
        return f53104e;
    }

    public final z1 a(String str) {
        c();
        z1 z1Var = (z1) this.f53105a.get(str);
        if (z1Var == null) {
            return null;
        }
        z1Var.f53421a = Math.max(z1Var.f53421a, System.currentTimeMillis());
        d();
        return z1Var;
    }

    public final void c() {
        if (!this.f53106b && !this.f53107c) {
            this.f53107c = true;
            if (this.f53105a == null) {
                this.f53105a = new HashMap();
            }
            Utilities.f22782e.c(new w1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new w1(this, 0));
        if (this.d) {
            return;
        }
        w1 w1Var = new w1(this, 0);
        boolean z10 = s2.f26723a;
        org.telegram.messenger.g0.h3(w1Var, 1000L);
    }
}
