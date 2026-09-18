package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f38921a;
    public boolean f38922b;
    public boolean f38923c;
    public String d;
    public float e;
    public boolean f38924f;
    public boolean f38925g;
    public TLRPC.WebPage h;
    public boolean f38926i;
    public TLRPC.TL_webPage f38927j;
    public int f38928k;
    public u0 f38929l;
    public final ArrayList f38930m = new ArrayList();

    public h2(int i10) {
        this.f38921a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f38923c) {
            this.f38923c = true;
            if (!this.f38925g) {
                ConnectionsManager.getInstance(this.f38921a).cancelRequest(this.f38928k, true);
            }
            if (!this.f38926i && (u0Var = this.f38929l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f38927j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f38930m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f38923c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f38927j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f38927j = null;
        }
        this.f38926i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f38924f = z0Var.f39124b;
        u0 u0Var = this.f38929l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f38929l = j2.e(z0Var, new g2(this, 1));
    }
}
