package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ra1 {
    public boolean f36312a;
    public String f36313b;
    public long f36314c;
    public ig.b d;
    public ig.b e;
    public String f36315f;
    public String f36316g;
    public boolean h;
    public final int f36317i;
    public final String f36318j;
    public boolean f36319k;
    public boolean f36320l;
    public boolean f36321m;
    public boolean f36322n;
    public boolean f36323o;

    public ra1(String str, int i10) {
        this.f36318j = str;
        this.f36317i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f36319k) {
            this.f36319k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f36315f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new rg0(19, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
