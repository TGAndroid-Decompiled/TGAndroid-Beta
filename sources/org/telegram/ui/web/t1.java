package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t1 {
    public final int f53319a;
    public boolean f53320b;
    public boolean f53321c;
    public String d;
    public float f53322e;
    public boolean f53323f;
    public boolean f53324g;
    public TLRPC.WebPage h;
    public boolean f53325i;
    public TLRPC.TL_webPage f53326j;
    public int f53327k;
    public ai.j f53328l;
    public final ArrayList f53329m = new ArrayList();

    public t1(int i7) {
        this.f53319a = i7;
    }

    public final void a() {
        ai.j jVar;
        if (!this.f53321c) {
            this.f53321c = true;
            if (!this.f53324g) {
                ConnectionsManager.getInstance(this.f53319a).cancelRequest(this.f53327k, true);
            }
            if (!this.f53325i && (jVar = this.f53328l) != null) {
                jVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!bz.f23209w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f53326j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f53329m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(s0 s0Var) {
        if (this.f53321c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f53326j;
        if (tL_webPage != null) {
            v1.o(tL_webPage);
            this.f53326j = null;
        }
        this.f53325i = false;
        this.d = s0Var.getUrl();
        this.f53322e = s0Var.getProgress();
        this.f53323f = s0Var.f53299b;
        ai.j jVar = this.f53328l;
        if (jVar != null) {
            jVar.run();
        }
        this.f53328l = v1.e(s0Var, new s1(this, 1));
    }
}
