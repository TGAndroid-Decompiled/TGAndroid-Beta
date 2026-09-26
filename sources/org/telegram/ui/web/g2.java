package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f39066a;
    public boolean f39067b;
    public boolean f39068c;
    public String d;
    public float e;
    public boolean f39069f;
    public boolean f39070g;
    public TLRPC.WebPage h;
    public boolean f39071i;
    public TLRPC.TL_webPage f39072j;
    public int f39073k;
    public q0 f39074l;
    public final ArrayList f39075m = new ArrayList();

    public g2(int i10) {
        this.f39066a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f39068c) {
            this.f39068c = true;
            if (!this.f39070g) {
                ConnectionsManager.getInstance(this.f39066a).cancelRequest(this.f39073k, true);
            }
            if (!this.f39071i && (q0Var = this.f39074l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39072j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39075m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f39068c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39072j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f39072j = null;
        }
        this.f39071i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f39069f = y0Var.f39275b;
        q0 q0Var = this.f39074l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f39074l = i2.e(y0Var, new f2(this, 1));
    }
}
