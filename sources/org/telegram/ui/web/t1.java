package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t1 {
    public final int f53317a;
    public boolean f53318b;
    public boolean f53319c;
    public String d;
    public float f53320e;
    public boolean f53321f;
    public boolean f53322g;
    public TLRPC.WebPage h;
    public boolean f53323i;
    public TLRPC.TL_webPage f53324j;
    public int f53325k;
    public ai.s f53326l;
    public final ArrayList f53327m = new ArrayList();

    public t1(int i7) {
        this.f53317a = i7;
    }

    public final void a() {
        ai.s sVar;
        if (!this.f53319c) {
            this.f53319c = true;
            if (!this.f53322g) {
                ConnectionsManager.getInstance(this.f53317a).cancelRequest(this.f53325k, true);
            }
            if (!this.f53323i && (sVar = this.f53326l) != null) {
                sVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!cz.f23451w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f53324j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f53327m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(s0 s0Var) {
        if (this.f53319c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f53324j;
        if (tL_webPage != null) {
            v1.o(tL_webPage);
            this.f53324j = null;
        }
        this.f53323i = false;
        this.d = s0Var.getUrl();
        this.f53320e = s0Var.getProgress();
        this.f53321f = s0Var.f53297b;
        ai.s sVar = this.f53326l;
        if (sVar != null) {
            sVar.run();
        }
        this.f53326l = v1.e(s0Var, new s1(this, 1));
    }
}
