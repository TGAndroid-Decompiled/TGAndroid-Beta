package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f38797a;
    public boolean f38798b;
    public boolean f38799c;
    public String d;
    public float e;
    public boolean f38800f;
    public boolean f38801g;
    public TLRPC.WebPage h;
    public boolean f38802i;
    public TLRPC.TL_webPage f38803j;
    public int f38804k;
    public u0 f38805l;
    public final ArrayList f38806m = new ArrayList();

    public g2(int i10) {
        this.f38797a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f38799c) {
            this.f38799c = true;
            if (!this.f38801g) {
                ConnectionsManager.getInstance(this.f38797a).cancelRequest(this.f38804k, true);
            }
            if (!this.f38802i && (u0Var = this.f38805l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f38803j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f38806m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f38799c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f38803j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f38803j = null;
        }
        this.f38802i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f38800f = z0Var.f39015b;
        u0 u0Var = this.f38805l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f38805l = i2.e(z0Var, new f2(this, 1));
    }
}
