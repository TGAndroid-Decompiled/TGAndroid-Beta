package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f43255a;
    public boolean f43256b;
    public boolean f43257c;
    public String d;
    public float f43258e;
    public boolean f43259f;
    public boolean f43260g;
    public TLRPC.WebPage h;
    public boolean f43261i;
    public TLRPC.TL_webPage f43262j;
    public int f43263k;
    public t0 f43264l;
    public final ArrayList f43265m = new ArrayList();

    public g2(int i10) {
        this.f43255a = i10;
    }

    public final void a() {
        t0 t0Var;
        if (!this.f43257c) {
            this.f43257c = true;
            if (!this.f43260g) {
                ConnectionsManager.getInstance(this.f43255a).cancelRequest(this.f43263k, true);
            }
            if (!this.f43261i && (t0Var = this.f43264l) != null) {
                t0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43262j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43265m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43257c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43262j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f43262j = null;
        }
        this.f43261i = false;
        this.d = y0Var.getUrl();
        this.f43258e = y0Var.getProgress();
        this.f43259f = y0Var.f43485b;
        t0 t0Var = this.f43264l;
        if (t0Var != null) {
            t0Var.run();
        }
        this.f43264l = i2.e(y0Var, new e2(this, 1));
    }
}
