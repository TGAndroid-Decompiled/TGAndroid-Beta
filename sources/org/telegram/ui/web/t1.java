package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t1 {
    public final int f53270a;
    public boolean f53271b;
    public boolean f53272c;
    public String d;
    public float f53273e;
    public boolean f53274f;
    public boolean f53275g;
    public TLRPC.WebPage h;
    public boolean f53276i;
    public TLRPC.TL_webPage f53277j;
    public int f53278k;
    public ai.j f53279l;
    public final ArrayList f53280m = new ArrayList();

    public t1(int i7) {
        this.f53270a = i7;
    }

    public final void a() {
        ai.j jVar;
        if (!this.f53272c) {
            this.f53272c = true;
            if (!this.f53275g) {
                ConnectionsManager.getInstance(this.f53270a).cancelRequest(this.f53278k, true);
            }
            if (!this.f53276i && (jVar = this.f53279l) != null) {
                jVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!bz.f23206w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f53277j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f53280m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(s0 s0Var) {
        if (this.f53272c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f53277j;
        if (tL_webPage != null) {
            v1.o(tL_webPage);
            this.f53277j = null;
        }
        this.f53276i = false;
        this.d = s0Var.getUrl();
        this.f53273e = s0Var.getProgress();
        this.f53274f = s0Var.f53250b;
        ai.j jVar = this.f53279l;
        if (jVar != null) {
            jVar.run();
        }
        this.f53279l = v1.e(s0Var, new s1(this, 1));
    }
}
