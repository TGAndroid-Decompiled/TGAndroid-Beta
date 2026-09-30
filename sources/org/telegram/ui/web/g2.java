package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f39156a;
    public boolean f39157b;
    public boolean f39158c;
    public String d;
    public float e;
    public boolean f39159f;
    public boolean f39160g;
    public TLRPC.WebPage h;
    public boolean f39161i;
    public TLRPC.TL_webPage f39162j;
    public int f39163k;
    public q0 f39164l;
    public final ArrayList f39165m = new ArrayList();

    public g2(int i10) {
        this.f39156a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f39158c) {
            this.f39158c = true;
            if (!this.f39160g) {
                ConnectionsManager.getInstance(this.f39156a).cancelRequest(this.f39163k, true);
            }
            if (!this.f39161i && (q0Var = this.f39164l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39162j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39165m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f39158c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39162j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f39162j = null;
        }
        this.f39161i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f39159f = y0Var.f39365b;
        q0 q0Var = this.f39164l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f39164l = i2.e(y0Var, new f2(this, 1));
    }
}
