package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v2;
public final class d2 {
    public static d2 e;
    public HashMap f43017a;
    public boolean f43018b;
    public boolean f43019c;
    public boolean d;

    public static d2 b() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public final c2 a(String str) {
        c();
        c2 c2Var = (c2) this.f43017a.get(str);
        if (c2Var == null) {
            return null;
        }
        c2Var.f43007a = Math.max(c2Var.f43007a, System.currentTimeMillis());
        d();
        return c2Var;
    }

    public final void c() {
        if (!this.f43018b && !this.f43019c) {
            this.f43019c = true;
            if (this.f43017a == null) {
                this.f43017a = new HashMap();
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
        boolean z10 = v2.f18448a;
        org.telegram.messenger.i0.h3(z1Var, 1000L);
    }
}
