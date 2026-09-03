package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f2 {
    public final int f39438a;
    public boolean f39439b;
    public boolean f39440c;
    public String d;
    public float e;
    public boolean f39441f;
    public boolean f39442g;
    public TLRPC.WebPage h;
    public boolean f39443i;
    public TLRPC.TL_webPage f39444j;
    public int f39445k;
    public q0 f39446l;
    public final ArrayList f39447m = new ArrayList();

    public f2(int i10) {
        this.f39438a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f39440c) {
            this.f39440c = true;
            if (!this.f39442g) {
                ConnectionsManager.getInstance(this.f39438a).cancelRequest(this.f39445k, true);
            }
            if (!this.f39443i && (q0Var = this.f39446l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f39444j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f39447m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f39440c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f39444j;
        if (tL_webPage != null) {
            h2.o(tL_webPage);
            this.f39444j = null;
        }
        this.f39443i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f39441f = y0Var.f39652b;
        q0 q0Var = this.f39446l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f39446l = h2.e(y0Var, new e2(this, 1));
    }
}
