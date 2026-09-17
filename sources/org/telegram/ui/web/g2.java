package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f38792a;
    public boolean f38793b;
    public boolean f38794c;
    public String d;
    public float e;
    public boolean f38795f;
    public boolean f38796g;
    public TLRPC.WebPage h;
    public boolean f38797i;
    public TLRPC.TL_webPage f38798j;
    public int f38799k;
    public u0 f38800l;
    public final ArrayList f38801m = new ArrayList();

    public g2(int i10) {
        this.f38792a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f38794c) {
            this.f38794c = true;
            if (!this.f38796g) {
                ConnectionsManager.getInstance(this.f38792a).cancelRequest(this.f38799k, true);
            }
            if (!this.f38797i && (u0Var = this.f38800l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f38798j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f38801m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f38794c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f38798j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f38798j = null;
        }
        this.f38797i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f38795f = z0Var.f39010b;
        u0 u0Var = this.f38800l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f38800l = i2.e(z0Var, new f2(this, 1));
    }
}
