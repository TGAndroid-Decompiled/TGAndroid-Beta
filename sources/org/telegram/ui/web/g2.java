package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f43312a;
    public boolean f43313b;
    public boolean f43314c;
    public String d;
    public float f43315e;
    public boolean f43316f;
    public boolean f43317g;
    public TLRPC.WebPage h;
    public boolean f43318i;
    public TLRPC.TL_webPage f43319j;
    public int f43320k;
    public q0 f43321l;
    public final ArrayList f43322m = new ArrayList();

    public g2(int i10) {
        this.f43312a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f43314c) {
            this.f43314c = true;
            if (!this.f43317g) {
                ConnectionsManager.getInstance(this.f43312a).cancelRequest(this.f43320k, true);
            }
            if (!this.f43318i && (q0Var = this.f43321l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43319j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43322m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43314c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43319j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f43319j = null;
        }
        this.f43318i = false;
        this.d = y0Var.getUrl();
        this.f43315e = y0Var.getProgress();
        this.f43316f = y0Var.f43540b;
        q0 q0Var = this.f43321l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f43321l = i2.e(y0Var, new f2(this, 1));
    }
}
