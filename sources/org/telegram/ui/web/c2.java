package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class c2 {

    public final int f43794a;

    public boolean f43795b;

    public boolean f43796c;
    public String d;

    public float f43797e;

    public boolean f43798f;

    public boolean f43799g;
    public TLRPC.WebPage h;

    public boolean f43800i;

    public TLRPC.TL_webPage f43801j;

    public int f43802k;

    public nh.f0 f43803l;

    public final ArrayList f43804m = new ArrayList();

    public c2(int i10) {
        this.f43794a = i10;
    }

    public final void a() {
        nh.f0 f0Var;
        if (this.f43796c) {
            return;
        }
        this.f43796c = true;
        if (!this.f43799g) {
            ConnectionsManager.getInstance(this.f43794a).cancelRequest(this.f43802k, true);
        }
        if (this.f43800i || (f0Var = this.f43803l) == null) {
            return;
        }
        f0Var.run();
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.f43801j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.f43804m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(w0 w0Var) {
        if (this.f43796c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.f43801j;
        if (tL_webPage != null) {
            e2.o(tL_webPage);
            this.f43801j = null;
        }
        this.f43800i = false;
        this.d = w0Var.getUrl();
        this.f43797e = w0Var.getProgress();
        this.f43798f = w0Var.f44024b;
        nh.f0 f0Var = this.f43803l;
        if (f0Var != null) {
            f0Var.run();
        }
        this.f43803l = e2.e(w0Var, new b2(this, 1));
    }
}
