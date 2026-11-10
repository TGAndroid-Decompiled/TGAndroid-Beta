package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p5;
public final class u1 {
    public final int f51259a;
    public boolean f51260b;
    public boolean f51261c;
    public String d;
    public float f51262e;
    public boolean f51263f;
    public boolean f51264g;
    public TLRPC.WebPage h;
    public boolean f51265i;
    public TLRPC.TL_webPage f51266j;
    public int f51267k;
    public p5 f51268l;
    public final ArrayList f51269m = new ArrayList();

    public u1(int i7) {
        this.f51259a = i7;
    }

    public final void a() {
        p5 p5Var;
        if (!this.f51261c) {
            this.f51261c = true;
            if (!this.f51264g) {
                ConnectionsManager.getInstance(this.f51259a).cancelRequest(this.f51267k, true);
            }
            if (!this.f51265i && (p5Var = this.f51268l) != null) {
                p5Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!iz.f23450w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f51266j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f51269m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(u0 u0Var) {
        if (this.f51261c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f51266j;
        if (tL_webPage != null) {
            w1.o(tL_webPage);
            this.f51266j = null;
        }
        this.f51265i = false;
        this.d = u0Var.getUrl();
        this.f51262e = u0Var.getProgress();
        this.f51263f = u0Var.f51249b;
        p5 p5Var = this.f51268l;
        if (p5Var != null) {
            p5Var.run();
        }
        this.f51268l = w1.e(u0Var, new t1(this, 1));
    }
}
