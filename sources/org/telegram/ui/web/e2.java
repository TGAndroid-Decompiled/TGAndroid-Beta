package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e2 {
    public final int f39481a;
    public boolean f39482b;
    public boolean f39483c;
    public String d;
    public float e;
    public boolean f39484f;
    public boolean f39485g;
    public TLRPC.WebPage h;
    public boolean f39486i;
    public TLRPC.TL_webPage f39487j;
    public int f39488k;
    public o0 f39489l;
    public final ArrayList f39490m = new ArrayList();

    public e2(int i10) {
        this.f39481a = i10;
    }

    public final void a() {
        o0 o0Var;
        if (!this.f39483c) {
            this.f39483c = true;
            if (!this.f39485g) {
                ConnectionsManager.getInstance(this.f39481a).cancelRequest(this.f39488k, true);
            }
            if (!this.f39486i && (o0Var = this.f39489l) != null) {
                o0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39487j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39490m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(w0 w0Var) {
        if (this.f39483c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39487j;
        if (tL_webPage != null) {
            g2.o(tL_webPage);
            this.f39487j = null;
        }
        this.f39486i = false;
        this.d = w0Var.getUrl();
        this.e = w0Var.getProgress();
        this.f39484f = w0Var.f39683b;
        o0 o0Var = this.f39489l;
        if (o0Var != null) {
            o0Var.run();
        }
        this.f39489l = g2.e(w0Var, new d2(this, 1));
    }
}
