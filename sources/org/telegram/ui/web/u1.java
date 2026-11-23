package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u1 {
    public final int f53559a;
    public boolean f53560b;
    public boolean f53561c;
    public String d;
    public float f53562e;
    public boolean f53563f;
    public boolean f53564g;
    public TLRPC.WebPage h;
    public boolean f53565i;
    public TLRPC.TL_webPage f53566j;
    public int f53567k;
    public ai.i f53568l;
    public final ArrayList f53569m = new ArrayList();

    public u1(int i7) {
        this.f53559a = i7;
    }

    public final void a() {
        ai.i iVar;
        if (!this.f53561c) {
            this.f53561c = true;
            if (!this.f53564g) {
                ConnectionsManager.getInstance(this.f53559a).cancelRequest(this.f53567k, true);
            }
            if (!this.f53565i && (iVar = this.f53568l) != null) {
                iVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!bz.f23331w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f53566j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f53569m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(s0 s0Var) {
        if (this.f53561c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f53566j;
        if (tL_webPage != null) {
            w1.o(tL_webPage);
            this.f53566j = null;
        }
        this.f53565i = false;
        this.d = s0Var.getUrl();
        this.f53562e = s0Var.getProgress();
        this.f53563f = s0Var.f53532b;
        ai.i iVar = this.f53568l;
        if (iVar != null) {
            iVar.run();
        }
        this.f53568l = w1.e(s0Var, new s1(this, 1));
    }
}
