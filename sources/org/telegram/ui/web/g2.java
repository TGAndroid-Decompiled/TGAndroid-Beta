package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public final int f43356a;
    public boolean f43357b;
    public boolean f43358c;
    public String d;
    public float f43359e;
    public boolean f43360f;
    public boolean f43361g;
    public TLRPC.WebPage h;
    public boolean f43362i;
    public TLRPC.TL_webPage f43363j;
    public int f43364k;
    public q0 f43365l;
    public final ArrayList f43366m = new ArrayList();

    public g2(int i10) {
        this.f43356a = i10;
    }

    public final void a() {
        q0 q0Var;
        if (!this.f43358c) {
            this.f43358c = true;
            if (!this.f43361g) {
                ConnectionsManager.getInstance(this.f43356a).cancelRequest(this.f43364k, true);
            }
            if (!this.f43362i && (q0Var = this.f43365l) != null) {
                q0Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43363j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43366m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.f43358c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43363j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.f43363j = null;
        }
        this.f43362i = false;
        this.d = y0Var.getUrl();
        this.f43359e = y0Var.getProgress();
        this.f43360f = y0Var.f43584b;
        q0 q0Var = this.f43365l;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f43365l = i2.e(y0Var, new f2(this, 1));
    }
}
