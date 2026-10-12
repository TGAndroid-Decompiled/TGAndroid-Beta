package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f43243a;
    public boolean f43244b;
    public boolean f43245c;
    public String d;
    public float f43246e;
    public boolean f43247f;
    public boolean f43248g;
    public TLRPC.WebPage h;
    public boolean f43249i;
    public TLRPC.TL_webPage f43250j;
    public int f43251k;
    public t0 f43252l;
    public final ArrayList f43253m = new ArrayList();

    public f2(int i10) {
        this.f43243a = i10;
    }

    public final void a() {
        t0 t0Var;
        if (!this.f43245c) {
            this.f43245c = true;
            if (!this.f43248g) {
                ConnectionsManager.getInstance(this.f43243a).cancelRequest(this.f43251k, true);
            }
            if (!this.f43249i && (t0Var = this.f43252l) != null) {
                t0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43250j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43253m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43245c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43250j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f43250j = null;
        }
        this.f43249i = false;
        this.d = y0Var.getUrl();
        this.f43246e = y0Var.getProgress();
        this.f43247f = y0Var.f43480b;
        t0 t0Var = this.f43252l;
        if (t0Var != null) {
            t0Var.run();
        }
        this.f43252l = h2.e(y0Var, new e2(this, 1));
    }
}
