package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f41346a;
    public boolean f41347b;
    public boolean f41348c;
    public String d;
    public float e;
    public boolean f41349f;
    public boolean f41350g;
    public TLRPC.WebPage h;
    public boolean f41351i;
    public TLRPC.TL_webPage f41352j;
    public int f41353k;
    public org.telegram.ui.Components.voip.m2 f41354l;
    public final ArrayList f41355m = new ArrayList();

    public f2(int i10) {
        this.f41346a = i10;
    }

    public final void a() {
        org.telegram.ui.Components.voip.m2 m2Var;
        if (!this.f41348c) {
            this.f41348c = true;
            if (!this.f41350g) {
                ConnectionsManager.getInstance(this.f41346a).cancelRequest(this.f41353k, true);
            }
            if (!this.f41351i && (m2Var = this.f41354l) != null) {
                m2Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f41352j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f41355m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f41348c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f41352j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f41352j = null;
        }
        this.f41351i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f41349f = y0Var.f41561b;
        org.telegram.ui.Components.voip.m2 m2Var = this.f41354l;
        if (m2Var != null) {
            m2Var.run();
        }
        this.f41354l = h2.e(y0Var, new e2(this, 1));
    }
}
