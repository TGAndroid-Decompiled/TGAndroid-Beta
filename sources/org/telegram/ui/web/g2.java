package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f43500a;
    public boolean f43501b;
    public boolean f43502c;
    public String d;
    public float f43503e;
    public boolean f43504f;
    public boolean f43505g;
    public TLRPC.WebPage h;
    public boolean f43506i;
    public TLRPC.TL_webPage f43507j;
    public int f43508k;
    public t0 f43509l;
    public final ArrayList f43510m = new ArrayList();

    public g2(int i10) {
        this.f43500a = i10;
    }

    public final void a() {
        t0 t0Var;
        if (!this.f43502c) {
            this.f43502c = true;
            if (!this.f43505g) {
                ConnectionsManager.getInstance(this.f43500a).cancelRequest(this.f43508k, true);
            }
            if (!this.f43506i && (t0Var = this.f43509l) != null) {
                t0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43507j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43510m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43502c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43507j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f43507j = null;
        }
        this.f43506i = false;
        this.d = y0Var.getUrl();
        this.f43503e = y0Var.getProgress();
        this.f43504f = y0Var.f43730b;
        t0 t0Var = this.f43509l;
        if (t0Var != null) {
            t0Var.run();
        }
        this.f43509l = i2.e(y0Var, new e2(this, 1));
    }
}
