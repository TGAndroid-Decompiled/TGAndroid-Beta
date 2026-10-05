package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42224a;
    public boolean f42225b;
    public boolean f42226c;
    public String d;
    public float f42227e;
    public boolean f42228f;
    public boolean f42229g;
    public TLRPC.WebPage h;
    public boolean f42230i;
    public TLRPC.TL_webPage f42231j;
    public int f42232k;
    public u0 f42233l;
    public final ArrayList f42234m = new ArrayList();

    public h2(int i10) {
        this.f42224a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f42226c) {
            this.f42226c = true;
            if (!this.f42229g) {
                ConnectionsManager.getInstance(this.f42224a).cancelRequest(this.f42232k, true);
            }
            if (!this.f42230i && (u0Var = this.f42233l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42231j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42234m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f42226c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42231j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42231j = null;
        }
        this.f42230i = false;
        this.d = z0Var.getUrl();
        this.f42227e = z0Var.getProgress();
        this.f42228f = z0Var.f42444b;
        u0 u0Var = this.f42233l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f42233l = j2.e(z0Var, new g2(this, 1));
    }
}
