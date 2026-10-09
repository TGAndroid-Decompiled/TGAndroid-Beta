package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f43310a;
    public boolean f43311b;
    public boolean f43312c;
    public String d;
    public float f43313e;
    public boolean f43314f;
    public boolean f43315g;
    public TLRPC.WebPage h;
    public boolean f43316i;
    public TLRPC.TL_webPage f43317j;
    public int f43318k;
    public q0 f43319l;
    public final ArrayList f43320m = new ArrayList();

    public g2(int i10) {
        this.f43310a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f43312c) {
            this.f43312c = true;
            if (!this.f43315g) {
                ConnectionsManager.getInstance(this.f43310a).cancelRequest(this.f43318k, true);
            }
            if (!this.f43316i && (q0Var = this.f43319l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43317j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43320m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43312c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43317j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f43317j = null;
        }
        this.f43316i = false;
        this.d = y0Var.getUrl();
        this.f43313e = y0Var.getProgress();
        this.f43314f = y0Var.f43538b;
        q0 q0Var = this.f43319l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f43319l = i2.e(y0Var, new f2(this, 1));
    }
}
