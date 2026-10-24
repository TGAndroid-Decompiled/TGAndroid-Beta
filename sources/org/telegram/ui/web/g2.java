package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f43110a;
    public boolean f43111b;
    public boolean f43112c;
    public String d;
    public float e;
    public boolean f43113f;
    public boolean f43114g;
    public TLRPC.WebPage h;
    public boolean f43115i;
    public TLRPC.TL_webPage f43116j;
    public int f43117k;
    public a2 f43118l;
    public final ArrayList f43119m = new ArrayList();

    public g2(int i10) {
        this.f43110a = i10;
    }

    public final void a() {
        a2 a2Var;
        if (!this.f43112c) {
            this.f43112c = true;
            if (!this.f43114g) {
                ConnectionsManager.getInstance(this.f43110a).cancelRequest(this.f43117k, true);
            }
            if (!this.f43115i && (a2Var = this.f43118l) != null) {
                a2Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43116j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43119m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43112c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43116j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f43116j = null;
        }
        this.f43115i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f43113f = y0Var.f43318b;
        a2 a2Var = this.f43118l;
        if (a2Var != null) {
            a2Var.run();
        }
        this.f43118l = i2.e(y0Var, new f2(this, 1));
    }
}
