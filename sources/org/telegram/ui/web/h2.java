package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42212a;
    public boolean f42213b;
    public boolean f42214c;
    public String d;
    public float f42215e;
    public boolean f42216f;
    public boolean f42217g;
    public TLRPC.WebPage h;
    public boolean f42218i;
    public TLRPC.TL_webPage f42219j;
    public int f42220k;
    public u0 f42221l;
    public final ArrayList f42222m = new ArrayList();

    public h2(int i10) {
        this.f42212a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f42214c) {
            this.f42214c = true;
            if (!this.f42217g) {
                ConnectionsManager.getInstance(this.f42212a).cancelRequest(this.f42220k, true);
            }
            if (!this.f42218i && (u0Var = this.f42221l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42219j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42222m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f42214c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42219j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42219j = null;
        }
        this.f42218i = false;
        this.d = z0Var.getUrl();
        this.f42215e = z0Var.getProgress();
        this.f42216f = z0Var.f42432b;
        u0 u0Var = this.f42221l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f42221l = j2.e(z0Var, new g2(this, 1));
    }
}
