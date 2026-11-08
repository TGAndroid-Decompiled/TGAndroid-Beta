package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
public final class u1 {
    public final int f51326a;
    public boolean f51327b;
    public boolean f51328c;
    public String d;
    public float f51329e;
    public boolean f51330f;
    public boolean f51331g;
    public TLRPC.WebPage h;
    public boolean f51332i;
    public TLRPC.TL_webPage f51333j;
    public int f51334k;
    public m5 f51335l;
    public final ArrayList f51336m = new ArrayList();

    public u1(int i7) {
        this.f51326a = i7;
    }

    public final void a() {
        m5 m5Var;
        if (!this.f51328c) {
            this.f51328c = true;
            if (!this.f51331g) {
                ConnectionsManager.getInstance(this.f51326a).cancelRequest(this.f51334k, true);
            }
            if (!this.f51332i && (m5Var = this.f51335l) != null) {
                m5Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!iz.f23446w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f51333j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f51336m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(u0 u0Var) {
        if (this.f51328c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f51333j;
        if (tL_webPage != null) {
            w1.o(tL_webPage);
            this.f51333j = null;
        }
        this.f51332i = false;
        this.d = u0Var.getUrl();
        this.f51329e = u0Var.getProgress();
        this.f51330f = u0Var.f51316b;
        m5 m5Var = this.f51335l;
        if (m5Var != null) {
            m5Var.run();
        }
        this.f51335l = w1.e(u0Var, new t1(this, 1));
    }
}
