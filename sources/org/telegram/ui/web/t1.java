package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t1 {
    public final int f52790a;
    public boolean f52791b;
    public boolean f52792c;
    public String d;
    public float f52793e;
    public boolean f52794f;
    public boolean f52795g;
    public TLRPC.WebPage h;
    public boolean f52796i;
    public TLRPC.TL_webPage f52797j;
    public int f52798k;
    public ai.s f52799l;
    public final ArrayList f52800m = new ArrayList();

    public t1(int i7) {
        this.f52790a = i7;
    }

    public final void a() {
        ai.s sVar;
        if (!this.f52792c) {
            this.f52792c = true;
            if (!this.f52795g) {
                ConnectionsManager.getInstance(this.f52790a).cancelRequest(this.f52798k, true);
            }
            if (!this.f52796i && (sVar = this.f52799l) != null) {
                sVar.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!gz.f23993w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f52797j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f52800m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(s0 s0Var) {
        if (this.f52792c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f52797j;
        if (tL_webPage != null) {
            v1.o(tL_webPage);
            this.f52797j = null;
        }
        this.f52796i = false;
        this.d = s0Var.getUrl();
        this.f52793e = s0Var.getProgress();
        this.f52794f = s0Var.f52770b;
        ai.s sVar = this.f52799l;
        if (sVar != null) {
            sVar.run();
        }
        this.f52799l = v1.e(s0Var, new s1(this, 1));
    }
}
