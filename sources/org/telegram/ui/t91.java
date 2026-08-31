package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class t91 {
    public boolean f41542a;
    public String f41543b;
    public long f41544c;
    public xf.b d;
    public xf.b f41545e;
    public String f41546f;
    public String f41547g;
    public boolean h;
    public final int f41548i;
    public final String f41549j;
    public boolean f41550k;
    public boolean f41551l;
    public boolean f41552m;
    public boolean f41553n;
    public boolean f41554o;

    public t91(String str, int i10) {
        this.f41549j = str;
        this.f41548i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f41550k) {
            this.f41550k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f41546f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new tb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
