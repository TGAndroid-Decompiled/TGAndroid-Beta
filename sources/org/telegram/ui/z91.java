package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class z91 {
    public boolean f43859a;
    public String f43860b;
    public long f43861c;
    public xf.b d;
    public xf.b f43862e;
    public String f43863f;
    public String f43864g;
    public boolean h;
    public final int f43865i;
    public final String f43866j;
    public boolean f43867k;
    public boolean f43868l;
    public boolean f43869m;
    public boolean f43870n;
    public boolean f43871o;

    public z91(String str, int i10) {
        this.f43866j = str;
        this.f43865i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f43867k) {
            this.f43867k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f43863f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new tb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
