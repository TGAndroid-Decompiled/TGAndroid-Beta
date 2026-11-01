package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v2;
public final class d2 {
    public static d2 e;
    public HashMap f42819a;
    public boolean f42820b;
    public boolean f42821c;
    public boolean d;

    public static d2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final c2 a(String str) {
        c();
        c2 c2Var = (c2) this.f42819a.get(str);
        if (c2Var == null) {
            return null;
        }
        c2Var.f42809a = Math.max(c2Var.f42809a, System.currentTimeMillis());
        d();
        return c2Var;
    }

    public final void c() {
        if (!this.f42820b && !this.f42821c) {
            this.f42821c = true;
            if (this.f42819a == null) {
                this.f42819a = new HashMap();
            }
            Utilities.e.c(new z1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.i0.r(new z1(this, 0));
        if (this.d) {
            return;
        }
        z1 z1Var = new z1(this, 0);
        boolean z10 = v2.f18578a;
        org.telegram.messenger.i0.h3(z1Var, 1000L);
    }
}
