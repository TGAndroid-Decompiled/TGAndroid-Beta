package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f39035a;
    public boolean f39036b;
    public boolean f39037c;
    public String d;
    public float e;
    public boolean f39038f;
    public boolean f39039g;
    public TLRPC.WebPage h;
    public boolean f39040i;
    public TLRPC.TL_webPage f39041j;
    public int f39042k;
    public u0 f39043l;
    public final ArrayList f39044m = new ArrayList();

    public h2(int i10) {
        this.f39035a = i10;
    }

    public final void a() {
        u0 u0Var;
        if (!this.f39037c) {
            this.f39037c = true;
            if (!this.f39039g) {
                ConnectionsManager.getInstance(this.f39035a).cancelRequest(this.f39042k, true);
            }
            if (!this.f39040i && (u0Var = this.f39043l) != null) {
                u0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39041j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39044m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f39037c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39041j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f39041j = null;
        }
        this.f39040i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f39038f = z0Var.f39242b;
        u0 u0Var = this.f39043l;
        if (u0Var != null) {
            u0Var.run();
        }
        this.f39043l = j2.e(z0Var, new f2(this, 1));
    }
}
