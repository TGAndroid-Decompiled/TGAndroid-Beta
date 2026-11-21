package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s2;
public final class a2 {
    public static a2 f53098e;
    public HashMap f53099a;
    public boolean f53100b;
    public boolean f53101c;
    public boolean d;

    public static a2 b() {
        if (f53098e == null) {
            f53098e = new Object();
        }
        return f53098e;
    }

    public final z1 a(String str) {
        c();
        z1 z1Var = (z1) this.f53099a.get(str);
        if (z1Var == null) {
            return null;
        }
        z1Var.f53415a = Math.max(z1Var.f53415a, System.currentTimeMillis());
        d();
        return z1Var;
    }

    public final void c() {
        if (!this.f53100b && !this.f53101c) {
            this.f53101c = true;
            if (this.f53099a == null) {
                this.f53099a = new HashMap();
            }
            Utilities.f22807e.c(new w1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new w1(this, 0));
        if (this.d) {
            return;
        }
        w1 w1Var = new w1(this, 0);
        boolean z10 = s2.f26749a;
        org.telegram.messenger.g0.h3(w1Var, 1000L);
    }
}
