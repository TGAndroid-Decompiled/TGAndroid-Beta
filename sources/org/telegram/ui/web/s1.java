package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d4;
public final class s1 {
    public final int f51007a;
    public boolean f51008b;
    public boolean f51009c;
    public String d;
    public float f51010e;
    public boolean f51011f;
    public boolean f51012g;
    public TLRPC.WebPage h;
    public boolean f51013i;
    public TLRPC.TL_webPage f51014j;
    public int f51015k;
    public d4 f51016l;
    public final ArrayList f51017m = new ArrayList();

    public s1(int i3) {
        this.f51007a = i3;
    }

    public final void a() {
        d4 d4Var;
        if (!this.f51009c) {
            this.f51009c = true;
            if (!this.f51012g) {
                ConnectionsManager.getInstance(this.f51007a).cancelRequest(this.f51015k, true);
            }
            if (!this.f51013i && (d4Var = this.f51016l) != null) {
                d4Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!az.f21673w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f51014j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f51017m;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
    }

    public final void d(t0 t0Var) {
        if (this.f51009c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f51014j;
        if (tL_webPage != null) {
            u1.o(tL_webPage);
            this.f51014j = null;
        }
        this.f51013i = false;
        this.d = t0Var.getUrl();
        this.f51010e = t0Var.getProgress();
        this.f51011f = t0Var.f51022b;
        d4 d4Var = this.f51016l;
        if (d4Var != null) {
            d4Var.run();
        }
        this.f51016l = u1.e(t0Var, new r1(this, 1));
    }
}
