package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i2 {
    public final int f37962a;
    public boolean f37963b;
    public boolean f37964c;
    public String d;
    public float e;
    public boolean f37965f;
    public boolean f37966g;
    public TLRPC.WebPage h;
    public boolean f37967i;
    public TLRPC.TL_webPage f37968j;
    public int f37969k;
    public org.telegram.ui.Components.voip.x f37970l;
    public final ArrayList f37971m = new ArrayList();

    public i2(int i10) {
        this.f37962a = i10;
    }

    public final void a() {
        org.telegram.ui.Components.voip.x xVar;
        if (!this.f37964c) {
            this.f37964c = true;
            if (!this.f37966g) {
                ConnectionsManager.getInstance(this.f37962a).cancelRequest(this.f37969k, true);
            }
            if (!this.f37967i && (xVar = this.f37970l) != null) {
                xVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f37968j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f37971m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f37964c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f37968j;
        if (tL_webPage != null) {
            k2.o(tL_webPage);
            this.f37968j = null;
        }
        this.f37967i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f37965f = y0Var.f38153b;
        org.telegram.ui.Components.voip.x xVar = this.f37970l;
        if (xVar != null) {
            xVar.run();
        }
        this.f37970l = k2.e(y0Var, new h2(this, 1));
    }
}
