package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42603a;
    public boolean f42604b;
    public boolean f42605c;
    public String d;
    public float e;
    public boolean f42606f;
    public boolean f42607g;
    public TLRPC.WebPage h;
    public boolean f42608i;
    public TLRPC.TL_webPage f42609j;
    public int f42610k;
    public a2 f42611l;
    public final ArrayList f42612m = new ArrayList();

    public h2(int i10) {
        this.f42603a = i10;
    }

    public final void a() {
        a2 a2Var;
        if (!this.f42605c) {
            this.f42605c = true;
            if (!this.f42607g) {
                ConnectionsManager.getInstance(this.f42603a).cancelRequest(this.f42610k, true);
            }
            if (!this.f42608i && (a2Var = this.f42611l) != null) {
                a2Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42609j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42612m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f42605c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42609j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42609j = null;
        }
        this.f42608i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f42606f = y0Var.f42807b;
        a2 a2Var = this.f42611l;
        if (a2Var != null) {
            a2Var.run();
        }
        this.f42611l = j2.e(y0Var, new f2(this, 1));
    }
}
