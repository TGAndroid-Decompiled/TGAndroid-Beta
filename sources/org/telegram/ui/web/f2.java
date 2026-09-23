package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f38690a;
    public boolean f38691b;
    public boolean f38692c;
    public String d;
    public float e;
    public boolean f38693f;
    public boolean f38694g;
    public TLRPC.WebPage h;
    public boolean f38695i;
    public TLRPC.TL_webPage f38696j;
    public int f38697k;
    public t0 f38698l;
    public final ArrayList f38699m = new ArrayList();

    public f2(int i10) {
        this.f38690a = i10;
    }

    public final void a() {
        t0 t0Var;
        if (!this.f38692c) {
            this.f38692c = true;
            if (!this.f38694g) {
                ConnectionsManager.getInstance(this.f38690a).cancelRequest(this.f38697k, true);
            }
            if (!this.f38695i && (t0Var = this.f38698l) != null) {
                t0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f38696j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f38699m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f38692c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f38696j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f38696j = null;
        }
        this.f38695i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f38693f = y0Var.f38906b;
        t0 t0Var = this.f38698l;
        if (t0Var != null) {
            t0Var.run();
        }
        this.f38698l = h2.e(y0Var, new e2(this, 1));
    }
}
