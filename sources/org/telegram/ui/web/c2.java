package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;
public final class c2 {
    public static c2 f51110e;
    public HashMap f51111a;
    public boolean f51112b;
    public boolean f51113c;
    public boolean d;

    public static c2 b() {
        if (f51110e == null) {
            f51110e = new Object();
        }
        return f51110e;
    }

    public final b2 a(String str) {
        c();
        b2 b2Var = (b2) this.f51111a.get(str);
        if (b2Var == null) {
            return null;
        }
        b2Var.f51101a = Math.max(b2Var.f51101a, System.currentTimeMillis());
        d();
        return b2Var;
    }

    public final void c() {
        if (!this.f51112b && !this.f51113c) {
            this.f51113c = true;
            if (this.f51111a == null) {
                this.f51111a = new HashMap();
            }
            Utilities.f21333e.c(new y1(this, 1));
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(new y1(this, 0));
        if (this.d) {
            return;
        }
        y1 y1Var = new y1(this, 0);
        boolean z9 = r2.f25191a;
        org.telegram.messenger.g0.i3(y1Var, 1000L);
    }
}
