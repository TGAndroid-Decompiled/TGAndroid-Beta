package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42129a;
    public boolean f42130b;
    public boolean f42131c;
    public String d;
    public float f42132e;
    public boolean f42133f;
    public boolean f42134g;
    public TLRPC.WebPage h;
    public boolean f42135i;
    public TLRPC.TL_webPage f42136j;
    public int f42137k;
    public b f42138l;
    public final ArrayList f42139m = new ArrayList();

    public h2(int i10) {
        this.f42129a = i10;
    }

    public final void a() {
        b bVar;
        if (!this.f42131c) {
            this.f42131c = true;
            if (!this.f42134g) {
                ConnectionsManager.getInstance(this.f42129a).cancelRequest(this.f42137k, true);
            }
            if (!this.f42135i && (bVar = this.f42138l) != null) {
                bVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42136j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42139m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f42131c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42136j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42136j = null;
        }
        this.f42135i = false;
        this.d = z0Var.getUrl();
        this.f42132e = z0Var.getProgress();
        this.f42133f = z0Var.f42355b;
        b bVar = this.f42138l;
        if (bVar != null) {
            bVar.run();
        }
        this.f42138l = j2.e(z0Var, new g2(this, 1));
    }
}
