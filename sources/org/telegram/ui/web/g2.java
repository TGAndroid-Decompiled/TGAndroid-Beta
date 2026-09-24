package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f39050a;
    public boolean f39051b;
    public boolean f39052c;
    public String d;
    public float e;
    public boolean f39053f;
    public boolean f39054g;
    public TLRPC.WebPage h;
    public boolean f39055i;
    public TLRPC.TL_webPage f39056j;
    public int f39057k;
    public q0 f39058l;
    public final ArrayList f39059m = new ArrayList();

    public g2(int i10) {
        this.f39050a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f39052c) {
            this.f39052c = true;
            if (!this.f39054g) {
                ConnectionsManager.getInstance(this.f39050a).cancelRequest(this.f39057k, true);
            }
            if (!this.f39055i && (q0Var = this.f39058l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39056j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39059m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f39052c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39056j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f39056j = null;
        }
        this.f39055i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f39053f = y0Var.f39261b;
        q0 q0Var = this.f39058l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f39058l = i2.e(y0Var, new f2(this, 1));
    }
}
