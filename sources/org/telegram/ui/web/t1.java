package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t1 {
    public final int f53313a;
    public boolean f53314b;
    public boolean f53315c;
    public String d;
    public float f53316e;
    public boolean f53317f;
    public boolean f53318g;
    public TLRPC.WebPage h;
    public boolean f53319i;
    public TLRPC.TL_webPage f53320j;
    public int f53321k;
    public ai.s f53322l;
    public final ArrayList f53323m = new ArrayList();

    public t1(int i7) {
        this.f53313a = i7;
    }

    public final void a() {
        ai.s sVar;
        if (!this.f53315c) {
            this.f53315c = true;
            if (!this.f53318g) {
                ConnectionsManager.getInstance(this.f53313a).cancelRequest(this.f53321k, true);
            }
            if (!this.f53319i && (sVar = this.f53322l) != null) {
                sVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!bz.f23234w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f53320j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f53323m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(s0 s0Var) {
        if (this.f53315c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f53320j;
        if (tL_webPage != null) {
            v1.o(tL_webPage);
            this.f53320j = null;
        }
        this.f53319i = false;
        this.d = s0Var.getUrl();
        this.f53316e = s0Var.getProgress();
        this.f53317f = s0Var.f53293b;
        ai.s sVar = this.f53322l;
        if (sVar != null) {
            sVar.run();
        }
        this.f53322l = v1.e(s0Var, new s1(this, 1));
    }
}
