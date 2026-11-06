package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
public final class u1 {
    public final int f51319a;
    public boolean f51320b;
    public boolean f51321c;
    public String d;
    public float f51322e;
    public boolean f51323f;
    public boolean f51324g;
    public TLRPC.WebPage h;
    public boolean f51325i;
    public TLRPC.TL_webPage f51326j;
    public int f51327k;
    public m5 f51328l;
    public final ArrayList f51329m = new ArrayList();

    public u1(int i7) {
        this.f51319a = i7;
    }

    public final void a() {
        m5 m5Var;
        if (!this.f51321c) {
            this.f51321c = true;
            if (!this.f51324g) {
                ConnectionsManager.getInstance(this.f51319a).cancelRequest(this.f51327k, true);
            }
            if (!this.f51325i && (m5Var = this.f51328l) != null) {
                m5Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!iz.f23425w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f51326j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f51329m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(u0 u0Var) {
        if (this.f51321c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f51326j;
        if (tL_webPage != null) {
            w1.o(tL_webPage);
            this.f51326j = null;
        }
        this.f51325i = false;
        this.d = u0Var.getUrl();
        this.f51322e = u0Var.getProgress();
        this.f51323f = u0Var.f51309b;
        m5 m5Var = this.f51328l;
        if (m5Var != null) {
            m5Var.run();
        }
        this.f51328l = w1.e(u0Var, new t1(this, 1));
    }
}
