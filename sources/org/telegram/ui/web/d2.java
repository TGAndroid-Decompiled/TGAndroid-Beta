package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d2 {
    public final int f44005a;
    public boolean f44006b;
    public boolean f44007c;
    public String d;
    public float f44008e;
    public boolean f44009f;
    public boolean f44010g;
    public TLRPC.WebPage h;
    public boolean f44011i;
    public TLRPC.TL_webPage f44012j;
    public int f44013k;
    public t1 f44014l;
    public final ArrayList f44015m = new ArrayList();

    public d2(int i10) {
        this.f44005a = i10;
    }

    public final void a() {
        t1 t1Var;
        if (!this.f44007c) {
            this.f44007c = true;
            if (!this.f44010g) {
                ConnectionsManager.getInstance(this.f44005a).cancelRequest(this.f44013k, true);
            }
            if (!this.f44011i && (t1Var = this.f44014l) != null) {
                t1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f44012j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f44015m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(w0 w0Var) {
        if (this.f44007c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f44012j;
        if (tL_webPage != null) {
            f2.o(tL_webPage);
            this.f44012j = null;
        }
        this.f44011i = false;
        this.d = w0Var.getUrl();
        this.f44008e = w0Var.getProgress();
        this.f44009f = w0Var.f44226b;
        t1 t1Var = this.f44014l;
        if (t1Var != null) {
            t1Var.run();
        }
        this.f44014l = f2.e(w0Var, new c2(this, 1));
    }
}
