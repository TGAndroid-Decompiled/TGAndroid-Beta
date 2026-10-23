package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f42642a;
    public boolean f42643b;
    public boolean f42644c;
    public String d;
    public float e;
    public boolean f42645f;
    public boolean f42646g;
    public TLRPC.WebPage h;
    public boolean f42647i;
    public TLRPC.TL_webPage f42648j;
    public int f42649k;
    public z1 f42650l;
    public final ArrayList f42651m = new ArrayList();

    public f2(int i10) {
        this.f42642a = i10;
    }

    public final void a() {
        z1 z1Var;
        if (!this.f42644c) {
            this.f42644c = true;
            if (!this.f42646g) {
                ConnectionsManager.getInstance(this.f42642a).cancelRequest(this.f42649k, true);
            }
            if (!this.f42647i && (z1Var = this.f42650l) != null) {
                z1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42648j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42651m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f42644c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42648j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f42648j = null;
        }
        this.f42647i = false;
        this.d = x0Var.getUrl();
        this.e = x0Var.getProgress();
        this.f42645f = x0Var.f42850b;
        z1 z1Var = this.f42650l;
        if (z1Var != null) {
            z1Var.run();
        }
        this.f42650l = h2.e(x0Var, new e2(this, 1));
    }
}
