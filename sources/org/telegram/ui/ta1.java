package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ta1 {
    public boolean f40049a;
    public String f40050b;
    public long f40051c;
    public kg.b d;
    public kg.b e;
    public String f40052f;
    public String f40053g;
    public boolean h;
    public final int f40054i;
    public final String f40055j;
    public boolean f40056k;
    public boolean f40057l;
    public boolean f40058m;
    public boolean f40059n;
    public boolean f40060o;

    public ta1(String str, int i10) {
        this.f40055j = str;
        this.f40054i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40056k) {
            this.f40056k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40052f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ec0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
