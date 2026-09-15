package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f38949a;
    public boolean f38950b;
    public boolean f38951c;
    public String d;
    public float e;
    public boolean f38952f;
    public boolean f38953g;
    public TLRPC.WebPage h;
    public boolean f38954i;
    public TLRPC.TL_webPage f38955j;
    public int f38956k;
    public u0 f38957l;
    public final ArrayList f38958m = new ArrayList();

    public g2(int i10) {
        this.f38949a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f38951c) {
            this.f38951c = true;
            if (!this.f38953g) {
                ConnectionsManager.getInstance(this.f38949a).cancelRequest(this.f38956k, true);
            }
            if (!this.f38954i && (u0Var = this.f38957l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f38955j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f38958m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f38951c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f38955j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f38955j = null;
        }
        this.f38954i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f38952f = z0Var.f39167b;
        u0 u0Var = this.f38957l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f38957l = i2.e(z0Var, new f2(this, 1));
    }
}
