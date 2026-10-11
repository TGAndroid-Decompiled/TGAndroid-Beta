package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f43534a;
    public boolean f43535b;
    public boolean f43536c;
    public String d;
    public float f43537e;
    public boolean f43538f;
    public boolean f43539g;
    public TLRPC.WebPage h;
    public boolean f43540i;
    public TLRPC.TL_webPage f43541j;
    public int f43542k;
    public t0 f43543l;
    public final ArrayList f43544m = new ArrayList();

    public g2(int i10) {
        this.f43534a = i10;
    }

    public final void a() {
        t0 t0Var;
        if (!this.f43536c) {
            this.f43536c = true;
            if (!this.f43539g) {
                ConnectionsManager.getInstance(this.f43534a).cancelRequest(this.f43542k, true);
            }
            if (!this.f43540i && (t0Var = this.f43543l) != null) {
                t0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43541j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43544m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43536c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43541j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f43541j = null;
        }
        this.f43540i = false;
        this.d = y0Var.getUrl();
        this.f43537e = y0Var.getProgress();
        this.f43538f = y0Var.f43764b;
        t0 t0Var = this.f43543l;
        if (t0Var != null) {
            t0Var.run();
        }
        this.f43543l = i2.e(y0Var, new e2(this, 1));
    }
}
