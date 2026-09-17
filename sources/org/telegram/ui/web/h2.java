package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f42103a;
    public boolean f42104b;
    public boolean f42105c;
    public String d;
    public float f42106e;
    public boolean f42107f;
    public boolean f42108g;
    public TLRPC.WebPage h;
    public boolean f42109i;
    public TLRPC.TL_webPage f42110j;
    public int f42111k;
    public b f42112l;
    public final ArrayList f42113m = new ArrayList();

    public h2(int i10) {
        this.f42103a = i10;
    }

    public final void a() {
        b bVar;
        if (!this.f42105c) {
            this.f42105c = true;
            if (!this.f42108g) {
                ConnectionsManager.getInstance(this.f42103a).cancelRequest(this.f42111k, true);
            }
            if (!this.f42109i && (bVar = this.f42112l) != null) {
                bVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42110j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42113m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f42105c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42110j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f42110j = null;
        }
        this.f42109i = false;
        this.d = z0Var.getUrl();
        this.f42106e = z0Var.getProgress();
        this.f42107f = z0Var.f42329b;
        b bVar = this.f42112l;
        if (bVar != null) {
            bVar.run();
        }
        this.f42112l = j2.e(z0Var, new g2(this, 1));
    }
}
