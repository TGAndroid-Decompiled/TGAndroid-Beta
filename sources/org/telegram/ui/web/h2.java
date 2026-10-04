package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42204a;
    public boolean f42205b;
    public boolean f42206c;
    public String d;
    public float f42207e;
    public boolean f42208f;
    public boolean f42209g;
    public TLRPC.WebPage h;
    public boolean f42210i;
    public TLRPC.TL_webPage f42211j;
    public int f42212k;
    public u0 f42213l;
    public final ArrayList f42214m = new ArrayList();

    public h2(int i10) {
        this.f42204a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f42206c) {
            this.f42206c = true;
            if (!this.f42209g) {
                ConnectionsManager.getInstance(this.f42204a).cancelRequest(this.f42212k, true);
            }
            if (!this.f42210i && (u0Var = this.f42213l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42211j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42214m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f42206c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42211j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42211j = null;
        }
        this.f42210i = false;
        this.d = z0Var.getUrl();
        this.f42207e = z0Var.getProgress();
        this.f42208f = z0Var.f42424b;
        u0 u0Var = this.f42213l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f42213l = j2.e(z0Var, new g2(this, 1));
    }
}
