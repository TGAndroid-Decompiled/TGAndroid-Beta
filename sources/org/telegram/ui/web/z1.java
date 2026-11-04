package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class z1 {
    public static z1 f51133e;
    public HashMap f51134a;
    public boolean f51135b;
    public boolean f51136c;
    public boolean d;

    public static z1 b() {
        if (f51133e == null) {
            f51133e = new Object();
        }
        return f51133e;
    }

    public final y1 a(String str) {
        c();
        y1 y1Var = (y1) this.f51134a.get(str);
        if (y1Var == null) {
            return null;
        }
        y1Var.f51119a = Math.max(y1Var.f51119a, System.currentTimeMillis());
        d();
        return y1Var;
    }

    public final void c() {
        if (!this.f51135b && !this.f51136c) {
            this.f51136c = true;
            if (this.f51134a == null) {
                this.f51134a = new HashMap();
            }
            Utilities.f21387e.c(new v1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new v1(this, 0));
        if (this.d) {
            return;
        }
        v1 v1Var = new v1(this, 0);
        boolean z10 = r2.f25040a;
        org.telegram.messenger.g0.i3(v1Var, 1000L);
    }
}
