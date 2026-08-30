package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class s91 {
    public boolean f38229a;
    public String f38230b;
    public long f38231c;
    public wf.b d;
    public wf.b e;
    public String f38232f;
    public String f38233g;
    public boolean h;
    public final int f38234i;
    public final String f38235j;
    public boolean f38236k;
    public boolean f38237l;
    public boolean f38238m;
    public boolean f38239n;
    public boolean f38240o;

    public s91(String str, int i10) {
        this.f38235j = str;
        this.f38234i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f38236k) {
            this.f38236k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f38232f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new sb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
