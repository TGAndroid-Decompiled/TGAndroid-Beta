package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f42641a;
    public boolean f42642b;
    public boolean f42643c;
    public String d;
    public float e;
    public boolean f42644f;
    public boolean f42645g;
    public TLRPC.WebPage h;
    public boolean f42646i;
    public TLRPC.TL_webPage f42647j;
    public int f42648k;
    public z1 f42649l;
    public final ArrayList f42650m = new ArrayList();

    public f2(int i10) {
        this.f42641a = i10;
    }

    public final void a() {
        z1 z1Var;
        if (!this.f42643c) {
            this.f42643c = true;
            if (!this.f42645g) {
                ConnectionsManager.getInstance(this.f42641a).cancelRequest(this.f42648k, true);
            }
            if (!this.f42646i && (z1Var = this.f42649l) != null) {
                z1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42647j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42650m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f42643c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42647j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f42647j = null;
        }
        this.f42646i = false;
        this.d = x0Var.getUrl();
        this.e = x0Var.getProgress();
        this.f42644f = x0Var.f42849b;
        z1 z1Var = this.f42649l;
        if (z1Var != null) {
            z1Var.run();
        }
        this.f42649l = h2.e(x0Var, new e2(this, 1));
    }
}
