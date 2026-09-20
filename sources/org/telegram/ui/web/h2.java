package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h2 {
    public final int f38918a;
    public boolean f38919b;
    public boolean f38920c;
    public String d;
    public float e;
    public boolean f38921f;
    public boolean f38922g;
    public TLRPC.WebPage h;
    public boolean f38923i;
    public TLRPC.TL_webPage f38924j;
    public int f38925k;
    public r0 f38926l;
    public final ArrayList f38927m = new ArrayList();

    public h2(int i10) {
        this.f38918a = i10;
    }

    public final void a() {
        r0 r0Var;
        if (!this.f38920c) {
            this.f38920c = true;
            if (!this.f38922g) {
                ConnectionsManager.getInstance(this.f38918a).cancelRequest(this.f38925k, true);
            }
            if (!this.f38923i && (r0Var = this.f38926l) != null) {
                r0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f38924j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f38927m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f38920c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f38924j;
        if (tL_webPage != null) {
            j2.o(tL_webPage);
            this.f38924j = null;
        }
        this.f38923i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f38921f = z0Var.f39124b;
        r0 r0Var = this.f38926l;
        if (r0Var != null) {
            r0Var.run();
        }
        this.f38926l = j2.e(z0Var, new g2(this, 1));
    }
}
