package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
public final class u1 {
    public final int f51314a;
    public boolean f51315b;
    public boolean f51316c;
    public String d;
    public float f51317e;
    public boolean f51318f;
    public boolean f51319g;
    public TLRPC.WebPage h;
    public boolean f51320i;
    public TLRPC.TL_webPage f51321j;
    public int f51322k;
    public m5 f51323l;
    public final ArrayList f51324m = new ArrayList();

    public u1(int i7) {
        this.f51314a = i7;
    }

    public final void a() {
        m5 m5Var;
        if (!this.f51316c) {
            this.f51316c = true;
            if (!this.f51319g) {
                ConnectionsManager.getInstance(this.f51314a).cancelRequest(this.f51322k, true);
            }
            if (!this.f51320i && (m5Var = this.f51323l) != null) {
                m5Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!iz.f23418w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f51321j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f51324m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(u0 u0Var) {
        if (this.f51316c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f51321j;
        if (tL_webPage != null) {
            w1.o(tL_webPage);
            this.f51321j = null;
        }
        this.f51320i = false;
        this.d = u0Var.getUrl();
        this.f51317e = u0Var.getProgress();
        this.f51318f = u0Var.f51304b;
        m5 m5Var = this.f51323l;
        if (m5Var != null) {
            m5Var.run();
        }
        this.f51323l = w1.e(u0Var, new t1(this, 1));
    }
}
