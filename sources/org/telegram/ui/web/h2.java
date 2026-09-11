package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42102a;
    public boolean f42103b;
    public boolean f42104c;
    public String d;
    public float f42105e;
    public boolean f42106f;
    public boolean f42107g;
    public TLRPC.WebPage h;
    public boolean f42108i;
    public TLRPC.TL_webPage f42109j;
    public int f42110k;
    public b f42111l;
    public final ArrayList f42112m = new ArrayList();

    public h2(int i10) {
        this.f42102a = i10;
    }

    public final void a() {
        b bVar;
        if (!this.f42104c) {
            this.f42104c = true;
            if (!this.f42107g) {
                ConnectionsManager.getInstance(this.f42102a).cancelRequest(this.f42110k, true);
            }
            if (!this.f42108i && (bVar = this.f42111l) != null) {
                bVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42109j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42112m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f42104c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42109j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42109j = null;
        }
        this.f42108i = false;
        this.d = z0Var.getUrl();
        this.f42105e = z0Var.getProgress();
        this.f42106f = z0Var.f42328b;
        b bVar = this.f42111l;
        if (bVar != null) {
            bVar.run();
        }
        this.f42111l = j2.e(z0Var, new g2(this, 1));
    }
}
