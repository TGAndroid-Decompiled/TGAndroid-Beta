package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f42638a;
    public boolean f42639b;
    public boolean f42640c;
    public String d;
    public float e;
    public boolean f42641f;
    public boolean f42642g;
    public TLRPC.WebPage h;
    public boolean f42643i;
    public TLRPC.TL_webPage f42644j;
    public int f42645k;
    public z1 f42646l;
    public final ArrayList f42647m = new ArrayList();

    public f2(int i10) {
        this.f42638a = i10;
    }

    public final void a() {
        z1 z1Var;
        if (!this.f42640c) {
            this.f42640c = true;
            if (!this.f42642g) {
                ConnectionsManager.getInstance(this.f42638a).cancelRequest(this.f42645k, true);
            }
            if (!this.f42643i && (z1Var = this.f42646l) != null) {
                z1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42644j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42647m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f42640c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42644j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f42644j = null;
        }
        this.f42643i = false;
        this.d = x0Var.getUrl();
        this.e = x0Var.getProgress();
        this.f42641f = x0Var.f42846b;
        z1 z1Var = this.f42646l;
        if (z1Var != null) {
            z1Var.run();
        }
        this.f42646l = h2.e(x0Var, new e2(this, 1));
    }
}
