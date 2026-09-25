package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f39068a;
    public boolean f39069b;
    public boolean f39070c;
    public String d;
    public float e;
    public boolean f39071f;
    public boolean f39072g;
    public TLRPC.WebPage h;
    public boolean f39073i;
    public TLRPC.TL_webPage f39074j;
    public int f39075k;
    public q0 f39076l;
    public final ArrayList f39077m = new ArrayList();

    public g2(int i10) {
        this.f39068a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f39070c) {
            this.f39070c = true;
            if (!this.f39072g) {
                ConnectionsManager.getInstance(this.f39068a).cancelRequest(this.f39075k, true);
            }
            if (!this.f39073i && (q0Var = this.f39076l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39074j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39077m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f39070c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39074j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f39074j = null;
        }
        this.f39073i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f39071f = y0Var.f39277b;
        q0 q0Var = this.f39076l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f39076l = i2.e(y0Var, new f2(this, 1));
    }
}
