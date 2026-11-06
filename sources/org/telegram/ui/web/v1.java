package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
public final class v1 {
    public final int f51335a;
    public boolean f51336b;
    public boolean f51337c;
    public String d;
    public float f51338e;
    public boolean f51339f;
    public boolean f51340g;
    public TLRPC.WebPage h;
    public boolean f51341i;
    public TLRPC.TL_webPage f51342j;
    public int f51343k;
    public m5 f51344l;
    public final ArrayList f51345m = new ArrayList();

    public v1(int i7) {
        this.f51335a = i7;
    }

    public final void a() {
        m5 m5Var;
        if (!this.f51337c) {
            this.f51337c = true;
            if (!this.f51340g) {
                ConnectionsManager.getInstance(this.f51335a).cancelRequest(this.f51343k, true);
            }
            if (!this.f51341i && (m5Var = this.f51344l) != null) {
                m5Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!iz.f23418w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f51342j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f51345m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(u0 u0Var) {
        if (this.f51337c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f51342j;
        if (tL_webPage != null) {
            x1.o(tL_webPage);
            this.f51342j = null;
        }
        this.f51341i = false;
        this.d = u0Var.getUrl();
        this.f51338e = u0Var.getProgress();
        this.f51339f = u0Var.f51317b;
        m5 m5Var = this.f51344l;
        if (m5Var != null) {
            m5Var.run();
        }
        this.f51344l = x1.e(u0Var, new u1(this, 1));
    }
}
