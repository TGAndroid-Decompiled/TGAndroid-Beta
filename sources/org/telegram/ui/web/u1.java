package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o5;
public final class u1 {
    public final int f51305a;
    public boolean f51306b;
    public boolean f51307c;
    public String d;
    public float f51308e;
    public boolean f51309f;
    public boolean f51310g;
    public TLRPC.WebPage h;
    public boolean f51311i;
    public TLRPC.TL_webPage f51312j;
    public int f51313k;
    public o5 f51314l;
    public final ArrayList f51315m = new ArrayList();

    public u1(int i7) {
        this.f51305a = i7;
    }

    public final void a() {
        o5 o5Var;
        if (!this.f51307c) {
            this.f51307c = true;
            if (!this.f51310g) {
                ConnectionsManager.getInstance(this.f51305a).cancelRequest(this.f51313k, true);
            }
            if (!this.f51311i && (o5Var = this.f51314l) != null) {
                o5Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!iz.f23446w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f51312j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f51315m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(u0 u0Var) {
        if (this.f51307c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f51312j;
        if (tL_webPage != null) {
            w1.o(tL_webPage);
            this.f51312j = null;
        }
        this.f51311i = false;
        this.d = u0Var.getUrl();
        this.f51308e = u0Var.getProgress();
        this.f51309f = u0Var.f51295b;
        o5 o5Var = this.f51314l;
        if (o5Var != null) {
            o5Var.run();
        }
        this.f51314l = w1.e(u0Var, new t1(this, 1));
    }
}
