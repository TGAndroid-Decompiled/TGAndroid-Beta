package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f44747a;
    public boolean f44748b;
    public boolean f44749c;
    public String d;
    public float e;
    public boolean f44750f;
    public boolean f44751g;
    public TLRPC.WebPage h;
    public boolean f44752i;
    public TLRPC.TL_webPage f44753j;
    public int f44754k;
    public h1 f44755l;
    public final ArrayList f44756m = new ArrayList();

    public f2(int i10) {
        this.f44747a = i10;
    }

    public final void a() {
        h1 h1Var;
        if (!this.f44749c) {
            this.f44749c = true;
            if (!this.f44751g) {
                ConnectionsManager.getInstance(this.f44747a).cancelRequest(this.f44754k, true);
            }
            if (!this.f44752i && (h1Var = this.f44755l) != null) {
                h1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f44753j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f44756m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f44749c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f44753j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f44753j = null;
        }
        this.f44752i = false;
        this.d = x0Var.getUrl();
        this.e = x0Var.getProgress();
        this.f44750f = x0Var.f44954b;
        h1 h1Var = this.f44755l;
        if (h1Var != null) {
            h1Var.run();
        }
        this.f44755l = h2.e(x0Var, new e2(this, 1));
    }
}
