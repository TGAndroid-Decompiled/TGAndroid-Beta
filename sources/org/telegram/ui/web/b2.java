package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class b2 {
    public static b2 f51099e;
    public HashMap f51100a;
    public boolean f51101b;
    public boolean f51102c;
    public boolean d;

    public static b2 b() {
        if (f51099e == null) {
            f51099e = new Object();
        }
        return f51099e;
    }

    public final a2 a(String str) {
        c();
        a2 a2Var = (a2) this.f51100a.get(str);
        if (a2Var == null) {
            return null;
        }
        a2Var.f51084a = Math.max(a2Var.f51084a, System.currentTimeMillis());
        d();
        return a2Var;
    }

    public final void c() {
        if (!this.f51101b && !this.f51102c) {
            this.f51102c = true;
            if (this.f51100a == null) {
                this.f51100a = new HashMap();
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
        boolean z9 = r2.f25199a;
        org.telegram.messenger.g0.i3(x1Var, 1000L);
    }
}
