package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f42590a;
    public boolean f42591b;
    public boolean f42592c;
    public String d;
    public float e;
    public boolean f42593f;
    public boolean f42594g;
    public TLRPC.WebPage h;
    public boolean f42595i;
    public TLRPC.TL_webPage f42596j;
    public int f42597k;
    public z1 f42598l;
    public final ArrayList f42599m = new ArrayList();

    public f2(int i10) {
        this.f42590a = i10;
    }

    public final void a() {
        z1 z1Var;
        if (!this.f42592c) {
            this.f42592c = true;
            if (!this.f42594g) {
                ConnectionsManager.getInstance(this.f42590a).cancelRequest(this.f42597k, true);
            }
            if (!this.f42595i && (z1Var = this.f42598l) != null) {
                z1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42596j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42599m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f42592c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42596j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f42596j = null;
        }
        this.f42595i = false;
        this.d = x0Var.getUrl();
        this.e = x0Var.getProgress();
        this.f42593f = x0Var.f42798b;
        z1 z1Var = this.f42598l;
        if (z1Var != null) {
            z1Var.run();
        }
        this.f42598l = h2.e(x0Var, new e2(this, 1));
    }
}
