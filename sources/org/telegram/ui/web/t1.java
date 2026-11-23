package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t1 {
    public final int f53281a;
    public boolean f53282b;
    public boolean f53283c;
    public String d;
    public float f53284e;
    public boolean f53285f;
    public boolean f53286g;
    public TLRPC.WebPage h;
    public boolean f53287i;
    public TLRPC.TL_webPage f53288j;
    public int f53289k;
    public ai.n f53290l;
    public final ArrayList f53291m = new ArrayList();

    public t1(int i7) {
        this.f53281a = i7;
    }

    public final void a() {
        ai.n nVar;
        if (!this.f53283c) {
            this.f53283c = true;
            if (!this.f53286g) {
                ConnectionsManager.getInstance(this.f53281a).cancelRequest(this.f53289k, true);
            }
            if (!this.f53287i && (nVar = this.f53290l) != null) {
                nVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!cz.f23415w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f53288j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f53291m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(s0 s0Var) {
        if (this.f53283c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f53288j;
        if (tL_webPage != null) {
            v1.o(tL_webPage);
            this.f53288j = null;
        }
        this.f53287i = false;
        this.d = s0Var.getUrl();
        this.f53284e = s0Var.getProgress();
        this.f53285f = s0Var.f53261b;
        ai.n nVar = this.f53290l;
        if (nVar != null) {
            nVar.run();
        }
        this.f53290l = v1.e(s0Var, new s1(this, 1));
    }
}
