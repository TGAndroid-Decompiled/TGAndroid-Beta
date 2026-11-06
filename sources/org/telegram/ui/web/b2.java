package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class b2 {
    public static b2 f51094e;
    public HashMap f51095a;
    public boolean f51096b;
    public boolean f51097c;
    public boolean d;

    public static b2 b() {
        if (f51094e == null) {
            f51094e = new Object();
        }
        return f51094e;
    }

    public final a2 a(String str) {
        c();
        a2 a2Var = (a2) this.f51095a.get(str);
        if (a2Var == null) {
            return null;
        }
        a2Var.f51079a = Math.max(a2Var.f51079a, System.currentTimeMillis());
        d();
        return a2Var;
    }

    public final void c() {
        if (!this.f51096b && !this.f51097c) {
            this.f51097c = true;
            if (this.f51095a == null) {
                this.f51095a = new HashMap();
            }
            Utilities.f21333e.c(new x1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new x1(this, 0));
        if (this.d) {
            return;
        }
        x1 x1Var = new x1(this, 0);
        boolean z9 = r2.f25191a;
        org.telegram.messenger.g0.i3(x1Var, 1000L);
    }
}
