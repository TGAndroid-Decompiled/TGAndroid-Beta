package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f39065a;
    public boolean f39066b;
    public boolean f39067c;
    public String d;
    public float e;
    public boolean f39068f;
    public boolean f39069g;
    public TLRPC.WebPage h;
    public boolean f39070i;
    public TLRPC.TL_webPage f39071j;
    public int f39072k;
    public q0 f39073l;
    public final ArrayList f39074m = new ArrayList();

    public g2(int i10) {
        this.f39065a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f39067c) {
            this.f39067c = true;
            if (!this.f39069g) {
                ConnectionsManager.getInstance(this.f39065a).cancelRequest(this.f39072k, true);
            }
            if (!this.f39070i && (q0Var = this.f39073l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39071j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39074m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f39067c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39071j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f39071j = null;
        }
        this.f39070i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f39068f = y0Var.f39276b;
        q0 q0Var = this.f39073l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f39073l = i2.e(y0Var, new f2(this, 1));
    }
}
