package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f39067a;
    public boolean f39068b;
    public boolean f39069c;
    public String d;
    public float e;
    public boolean f39070f;
    public boolean f39071g;
    public TLRPC.WebPage h;
    public boolean f39072i;
    public TLRPC.TL_webPage f39073j;
    public int f39074k;
    public q0 f39075l;
    public final ArrayList f39076m = new ArrayList();

    public g2(int i10) {
        this.f39067a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f39069c) {
            this.f39069c = true;
            if (!this.f39071g) {
                ConnectionsManager.getInstance(this.f39067a).cancelRequest(this.f39074k, true);
            }
            if (!this.f39072i && (q0Var = this.f39075l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39073j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39076m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f39069c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39073j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f39073j = null;
        }
        this.f39072i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f39070f = y0Var.f39276b;
        q0 q0Var = this.f39075l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f39075l = i2.e(y0Var, new f2(this, 1));
    }
}
