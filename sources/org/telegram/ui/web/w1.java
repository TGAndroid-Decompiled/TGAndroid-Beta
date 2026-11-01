package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.uz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.w5;
public final class w1 {
    public final int f43029a;
    public boolean f43030b;
    public boolean f43031c;
    public String d;
    public float e;
    public boolean f43032f;
    public boolean f43033g;
    public TLRPC.WebPage h;
    public boolean f43034i;
    public TLRPC.TL_webPage f43035j;
    public int f43036k;
    public w5 f43037l;
    public final ArrayList f43038m = new ArrayList();

    public w1(int i10) {
        this.f43029a = i10;
    }

    public final void a() {
        w5 w5Var;
        if (!this.f43031c) {
            this.f43031c = true;
            if (!this.f43033g) {
                ConnectionsManager.getInstance(this.f43029a).cancelRequest(this.f43036k, true);
            }
            if (!this.f43034i && (w5Var = this.f43037l) != null) {
                w5Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!uz.f18561w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43035j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43038m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(v0 v0Var) {
        if (this.f43031c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43035j;
        if (tL_webPage != null) {
            y1.o(tL_webPage);
            this.f43035j = null;
        }
        this.f43034i = false;
        this.d = v0Var.getUrl();
        this.e = v0Var.getProgress();
        this.f43032f = v0Var.f43011b;
        w5 w5Var = this.f43037l;
        if (w5Var != null) {
            w5Var.run();
        }
        this.f43037l = y1.e(v0Var, new u1(this, 1));
    }
}
