package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42130a;
    public boolean f42131b;
    public boolean f42132c;
    public String d;
    public float f42133e;
    public boolean f42134f;
    public boolean f42135g;
    public TLRPC.WebPage h;
    public boolean f42136i;
    public TLRPC.TL_webPage f42137j;
    public int f42138k;
    public b f42139l;
    public final ArrayList f42140m = new ArrayList();

    public h2(int i10) {
        this.f42130a = i10;
    }

    public final void a() {
        b bVar;
        if (!this.f42132c) {
            this.f42132c = true;
            if (!this.f42135g) {
                ConnectionsManager.getInstance(this.f42130a).cancelRequest(this.f42138k, true);
            }
            if (!this.f42136i && (bVar = this.f42139l) != null) {
                bVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42137j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42140m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f42132c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42137j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42137j = null;
        }
        this.f42136i = false;
        this.d = z0Var.getUrl();
        this.f42133e = z0Var.getProgress();
        this.f42134f = z0Var.f42356b;
        b bVar = this.f42139l;
        if (bVar != null) {
            bVar.run();
        }
        this.f42139l = j2.e(z0Var, new g2(this, 1));
    }
}
