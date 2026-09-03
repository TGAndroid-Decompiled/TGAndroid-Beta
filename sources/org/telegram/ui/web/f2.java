package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f42504a;
    public boolean f42505b;
    public boolean f42506c;
    public String d;
    public float f42507e;
    public boolean f42508f;
    public boolean f42509g;
    public TLRPC.WebPage h;
    public boolean f42510i;
    public TLRPC.TL_webPage f42511j;
    public int f42512k;
    public s0 f42513l;
    public final ArrayList f42514m = new ArrayList();

    public f2(int i10) {
        this.f42504a = i10;
    }

    public final void a() {
        s0 s0Var;
        if (!this.f42506c) {
            this.f42506c = true;
            if (!this.f42509g) {
                ConnectionsManager.getInstance(this.f42504a).cancelRequest(this.f42512k, true);
            }
            if (!this.f42510i && (s0Var = this.f42513l) != null) {
                s0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42511j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42514m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f42506c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42511j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f42511j = null;
        }
        this.f42510i = false;
        this.d = x0Var.getUrl();
        this.f42507e = x0Var.getProgress();
        this.f42508f = x0Var.f42723b;
        s0 s0Var = this.f42513l;
        if (s0Var != null) {
            s0Var.run();
        }
        this.f42513l = h2.e(x0Var, new e2(this, 1));
    }
}
