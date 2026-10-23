package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f43121a;
    public boolean f43122b;
    public boolean f43123c;
    public String d;
    public float e;
    public boolean f43124f;
    public boolean f43125g;
    public TLRPC.WebPage h;
    public boolean f43126i;
    public TLRPC.TL_webPage f43127j;
    public int f43128k;
    public a2 f43129l;
    public final ArrayList f43130m = new ArrayList();

    public g2(int i10) {
        this.f43121a = i10;
    }

    public final void a() {
        a2 a2Var;
        if (!this.f43123c) {
            this.f43123c = true;
            if (!this.f43125g) {
                ConnectionsManager.getInstance(this.f43121a).cancelRequest(this.f43128k, true);
            }
            if (!this.f43126i && (a2Var = this.f43129l) != null) {
                a2Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43127j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43130m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43123c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43127j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f43127j = null;
        }
        this.f43126i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f43124f = y0Var.f43329b;
        a2 a2Var = this.f43129l;
        if (a2Var != null) {
            a2Var.run();
        }
        this.f43129l = i2.e(y0Var, new f2(this, 1));
    }
}
