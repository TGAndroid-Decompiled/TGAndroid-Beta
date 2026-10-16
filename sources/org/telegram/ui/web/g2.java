package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.r2;
public final class g2 {
    public final int f41042a;
    public boolean f41043b;
    public boolean f41044c;
    public String d;
    public float e;
    public boolean f41045f;
    public boolean f41046g;
    public TLRPC.WebPage h;
    public boolean f41047i;
    public TLRPC.TL_webPage f41048j;
    public int f41049k;
    public r2 f41050l;
    public final ArrayList f41051m = new ArrayList();

    public g2(int i10) {
        this.f41042a = i10;
    }

    public final void a() {
        r2 r2Var;
        if (!this.f41044c) {
            this.f41044c = true;
            if (!this.f41046g) {
                ConnectionsManager.getInstance(this.f41042a).cancelRequest(this.f41049k, true);
            }
            if (!this.f41047i && (r2Var = this.f41050l) != null) {
                r2Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f41048j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f41051m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(z0 z0Var) {
        if (this.f41044c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f41048j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f41048j = null;
        }
        this.f41047i = false;
        this.d = z0Var.getUrl();
        this.e = z0Var.getProgress();
        this.f41045f = z0Var.f41262b;
        r2 r2Var = this.f41050l;
        if (r2Var != null) {
            r2Var.run();
        }
        this.f41050l = i2.e(z0Var, new f2(this, 1));
    }
}
