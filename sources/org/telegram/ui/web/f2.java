package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f42541a;
    public boolean f42542b;
    public boolean f42543c;
    public String d;
    public float f42544e;
    public boolean f42545f;
    public boolean f42546g;
    public TLRPC.WebPage h;
    public boolean f42547i;
    public TLRPC.TL_webPage f42548j;
    public int f42549k;
    public s0 f42550l;
    public final ArrayList f42551m = new ArrayList();

    public f2(int i10) {
        this.f42541a = i10;
    }

    public final void a() {
        s0 s0Var;
        if (!this.f42543c) {
            this.f42543c = true;
            if (!this.f42546g) {
                ConnectionsManager.getInstance(this.f42541a).cancelRequest(this.f42549k, true);
            }
            if (!this.f42547i && (s0Var = this.f42550l) != null) {
                s0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42548j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42551m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f42543c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42548j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f42548j = null;
        }
        this.f42547i = false;
        this.d = x0Var.getUrl();
        this.f42544e = x0Var.getProgress();
        this.f42545f = x0Var.f42758b;
        s0 s0Var = this.f42550l;
        if (s0Var != null) {
            s0Var.run();
        }
        this.f42550l = h2.e(x0Var, new e2(this, 1));
    }
}
