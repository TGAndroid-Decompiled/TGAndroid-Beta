package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t1 {
    public final int f52787a;
    public boolean f52788b;
    public boolean f52789c;
    public String d;
    public float f52790e;
    public boolean f52791f;
    public boolean f52792g;
    public TLRPC.WebPage h;
    public boolean f52793i;
    public TLRPC.TL_webPage f52794j;
    public int f52795k;
    public ai.r f52796l;
    public final ArrayList f52797m = new ArrayList();

    public t1(int i7) {
        this.f52787a = i7;
    }

    public final void a() {
        ai.r rVar;
        if (!this.f52789c) {
            this.f52789c = true;
            if (!this.f52792g) {
                ConnectionsManager.getInstance(this.f52787a).cancelRequest(this.f52795k, true);
            }
            if (!this.f52793i && (rVar = this.f52796l) != null) {
                rVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!gz.f23990w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f52794j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f52797m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(s0 s0Var) {
        if (this.f52789c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f52794j;
        if (tL_webPage != null) {
            v1.o(tL_webPage);
            this.f52794j = null;
        }
        this.f52793i = false;
        this.d = s0Var.getUrl();
        this.f52790e = s0Var.getProgress();
        this.f52791f = s0Var.f52767b;
        ai.r rVar = this.f52796l;
        if (rVar != null) {
            rVar.run();
        }
        this.f52796l = v1.e(s0Var, new s1(this, 1));
    }
}
