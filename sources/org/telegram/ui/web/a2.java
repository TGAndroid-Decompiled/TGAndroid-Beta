package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s2;
public final class a2 {
    public static a2 f53067e;
    public HashMap f53068a;
    public boolean f53069b;
    public boolean f53070c;
    public boolean d;

    public static a2 b() {
        if (f53067e == null) {
            f53067e = new Object();
        }
        return f53067e;
    }

    public final z1 a(String str) {
        c();
        z1 z1Var = (z1) this.f53068a.get(str);
        if (z1Var == null) {
            return null;
        }
        z1Var.f53382a = Math.max(z1Var.f53382a, System.currentTimeMillis());
        d();
        return z1Var;
    }

    public final void c() {
        if (!this.f53069b && !this.f53070c) {
            this.f53070c = true;
            if (this.f53068a == null) {
                this.f53068a = new HashMap();
            }
            Utilities.f22774e.c(new w1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new w1(this, 0));
        if (this.d) {
            return;
        }
        w1 w1Var = new w1(this, 0);
        boolean z10 = s2.f26694a;
        org.telegram.messenger.g0.h3(w1Var, 1000L);
    }
}
