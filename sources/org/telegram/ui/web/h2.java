package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42205a;
    public boolean f42206b;
    public boolean f42207c;
    public String d;
    public float f42208e;
    public boolean f42209f;
    public boolean f42210g;
    public TLRPC.WebPage h;
    public boolean f42211i;
    public TLRPC.TL_webPage f42212j;
    public int f42213k;
    public u0 f42214l;
    public final ArrayList f42215m = new ArrayList();

    public h2(int i10) {
        this.f42205a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f42207c) {
            this.f42207c = true;
            if (!this.f42210g) {
                ConnectionsManager.getInstance(this.f42205a).cancelRequest(this.f42213k, true);
            }
            if (!this.f42211i && (u0Var = this.f42214l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42212j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42215m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f42207c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42212j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42212j = null;
        }
        this.f42211i = false;
        this.d = z0Var.getUrl();
        this.f42208e = z0Var.getProgress();
        this.f42209f = z0Var.f42425b;
        u0 u0Var = this.f42214l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f42214l = j2.e(z0Var, new g2(this, 1));
    }
}
