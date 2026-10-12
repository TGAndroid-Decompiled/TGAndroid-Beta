package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ta1 {
    public boolean f40334a;
    public String f40335b;
    public long f40336c;
    public kg.b d;
    public kg.b e;
    public String f40337f;
    public String f40338g;
    public boolean h;
    public final int f40339i;
    public final String f40340j;
    public boolean f40341k;
    public boolean f40342l;
    public boolean f40343m;
    public boolean f40344n;
    public boolean f40345o;

    public ta1(String str, int i10) {
        this.f40340j = str;
        this.f40339i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40341k) {
            this.f40341k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40337f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new fc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
