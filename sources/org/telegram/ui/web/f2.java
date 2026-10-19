package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f42632a;
    public boolean f42633b;
    public boolean f42634c;
    public String d;
    public float e;
    public boolean f42635f;
    public boolean f42636g;
    public TLRPC.WebPage h;
    public boolean f42637i;
    public TLRPC.TL_webPage f42638j;
    public int f42639k;
    public z1 f42640l;
    public final ArrayList f42641m = new ArrayList();

    public f2(int i10) {
        this.f42632a = i10;
    }

    public final void a() {
        z1 z1Var;
        if (!this.f42634c) {
            this.f42634c = true;
            if (!this.f42636g) {
                ConnectionsManager.getInstance(this.f42632a).cancelRequest(this.f42639k, true);
            }
            if (!this.f42637i && (z1Var = this.f42640l) != null) {
                z1Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f42638j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f42641m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(x0 x0Var) {
        if (this.f42634c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f42638j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f42638j = null;
        }
        this.f42637i = false;
        this.d = x0Var.getUrl();
        this.e = x0Var.getProgress();
        this.f42635f = x0Var.f42840b;
        z1 z1Var = this.f42640l;
        if (z1Var != null) {
            z1Var.run();
        }
        this.f42640l = h2.e(x0Var, new e2(this, 1));
    }
}
