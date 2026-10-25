package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f45233a;
    public boolean f45234b;
    public boolean f45235c;
    public String d;
    public float e;
    public boolean f45236f;
    public boolean f45237g;
    public TLRPC.WebPage h;
    public boolean f45238i;
    public TLRPC.TL_webPage f45239j;
    public int f45240k;
    public h1 f45241l;
    public final ArrayList f45242m = new ArrayList();

    public f2(int i10) {
        this.f45233a = i10;
    }

    public final void a() {
        h1 h1Var;
        if (!this.f45235c) {
            this.f45235c = true;
            if (!this.f45237g) {
                ConnectionsManager.getInstance(this.f45233a).cancelRequest(this.f45240k, true);
            }
            if (!this.f45238i && (h1Var = this.f45241l) != null) {
                h1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f45239j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f45242m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f45235c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f45239j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f45239j = null;
        }
        this.f45238i = false;
        this.d = x0Var.getUrl();
        this.e = x0Var.getProgress();
        this.f45236f = x0Var.f45440b;
        h1 h1Var = this.f45241l;
        if (h1Var != null) {
            h1Var.run();
        }
        this.f45241l = h2.e(x0Var, new e2(this, 1));
    }
}
