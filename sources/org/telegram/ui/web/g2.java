package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f38955a;
    public boolean f38956b;
    public boolean f38957c;
    public String d;
    public float e;
    public boolean f38958f;
    public boolean f38959g;
    public TLRPC.WebPage h;
    public boolean f38960i;
    public TLRPC.TL_webPage f38961j;
    public int f38962k;
    public u0 f38963l;
    public final ArrayList f38964m = new ArrayList();

    public g2(int i10) {
        this.f38955a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f38957c) {
            this.f38957c = true;
            if (!this.f38959g) {
                ConnectionsManager.getInstance(this.f38955a).cancelRequest(this.f38962k, true);
            }
            if (!this.f38960i && (u0Var = this.f38963l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f38961j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f38964m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f38957c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f38961j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f38961j = null;
        }
        this.f38960i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f38958f = z0Var.f39171b;
        u0 u0Var = this.f38963l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f38963l = i2.e(z0Var, new f2(this, 1));
    }
}
