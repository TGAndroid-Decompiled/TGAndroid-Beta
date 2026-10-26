package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f45236a;
    public boolean f45237b;
    public boolean f45238c;
    public String d;
    public float e;
    public boolean f45239f;
    public boolean f45240g;
    public TLRPC.WebPage h;
    public boolean f45241i;
    public TLRPC.TL_webPage f45242j;
    public int f45243k;
    public h1 f45244l;
    public final ArrayList f45245m = new ArrayList();

    public f2(int i10) {
        this.f45236a = i10;
    }

    public final void a() {
        h1 h1Var;
        if (!this.f45238c) {
            this.f45238c = true;
            if (!this.f45240g) {
                ConnectionsManager.getInstance(this.f45236a).cancelRequest(this.f45243k, true);
            }
            if (!this.f45241i && (h1Var = this.f45244l) != null) {
                h1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f45242j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f45245m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f45238c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f45242j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f45242j = null;
        }
        this.f45241i = false;
        this.d = x0Var.getUrl();
        this.e = x0Var.getProgress();
        this.f45239f = x0Var.f45443b;
        h1 h1Var = this.f45244l;
        if (h1Var != null) {
            h1Var.run();
        }
        this.f45244l = h2.e(x0Var, new e2(this, 1));
    }
}
