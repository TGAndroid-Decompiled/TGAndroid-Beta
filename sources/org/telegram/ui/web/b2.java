package org.telegram.ui.web;

import java.util.ArrayList;
import mh.m2;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b2 {
    public final int f43807a;
    public boolean f43808b;
    public boolean f43809c;
    public String d;
    public float f43810e;
    public boolean f43811f;
    public boolean f43812g;
    public TLRPC.WebPage h;
    public boolean f43813i;
    public TLRPC.TL_webPage f43814j;
    public int f43815k;
    public m2 f43816l;
    public final ArrayList f43817m = new ArrayList();

    public b2(int i9) {
        this.f43807a = i9;
    }

    public final void a() {
        m2 m2Var;
        if (!this.f43809c) {
            this.f43809c = true;
            if (!this.f43812g) {
                ConnectionsManager.getInstance(this.f43807a).cancelRequest(this.f43815k, true);
            }
            if (!this.f43813i && (m2Var = this.f43816l) != null) {
                m2Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43814j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43817m;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
    }

    public final void d(v0 v0Var) {
        if (this.f43809c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43814j;
        if (tL_webPage != null) {
            d2.o(tL_webPage);
            this.f43814j = null;
        }
        this.f43813i = false;
        this.d = v0Var.getUrl();
        this.f43810e = v0Var.getProgress();
        this.f43811f = v0Var.f44037b;
        m2 m2Var = this.f43816l;
        if (m2Var != null) {
            m2Var.run();
        }
        this.f43816l = d2.e(v0Var, new a2(this, 1));
    }
}
