package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.tz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.w5;
public final class w1 {
    public final int f43227a;
    public boolean f43228b;
    public boolean f43229c;
    public String d;
    public float e;
    public boolean f43230f;
    public boolean f43231g;
    public TLRPC.WebPage h;
    public boolean f43232i;
    public TLRPC.TL_webPage f43233j;
    public int f43234k;
    public w5 f43235l;
    public final ArrayList f43236m = new ArrayList();

    public w1(int i10) {
        this.f43227a = i10;
    }

    public final void a() {
        w5 w5Var;
        if (!this.f43229c) {
            this.f43229c = true;
            if (!this.f43231g) {
                ConnectionsManager.getInstance(this.f43227a).cancelRequest(this.f43234k, true);
            }
            if (!this.f43232i && (w5Var = this.f43235l) != null) {
                w5Var.run();
            }
        }
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!tz.f18192w0 && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43233j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43236m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(v0 v0Var) {
        if (this.f43229c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43233j;
        if (tL_webPage != null) {
            y1.o(tL_webPage);
            this.f43233j = null;
        }
        this.f43232i = false;
        this.d = v0Var.getUrl();
        this.e = v0Var.getProgress();
        this.f43230f = v0Var.f43209b;
        w5 w5Var = this.f43235l;
        if (w5Var != null) {
            w5Var.run();
        }
        this.f43235l = y1.e(v0Var, new u1(this, 1));
    }
}
