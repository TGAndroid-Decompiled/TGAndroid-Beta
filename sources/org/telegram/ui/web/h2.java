package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f38939a;
    public boolean f38940b;
    public boolean f38941c;
    public String d;
    public float e;
    public boolean f38942f;
    public boolean f38943g;
    public TLRPC.WebPage h;
    public boolean f38944i;
    public TLRPC.TL_webPage f38945j;
    public int f38946k;
    public r0 f38947l;
    public final ArrayList f38948m = new ArrayList();

    public h2(int i10) {
        this.f38939a = i10;
    }

    public final void a() {
        r0 r0Var;
        if (!this.f38941c) {
            this.f38941c = true;
            if (!this.f38943g) {
                ConnectionsManager.getInstance(this.f38939a).cancelRequest(this.f38946k, true);
            }
            if (!this.f38944i && (r0Var = this.f38947l) != null) {
                r0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f38945j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f38948m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f38941c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f38945j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f38945j = null;
        }
        this.f38944i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f38942f = z0Var.f39145b;
        r0 r0Var = this.f38947l;
        if (r0Var != null) {
            r0Var.run();
        }
        this.f38947l = j2.e(z0Var, new g2(this, 1));
    }
}
