package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class sa1 extends ra1 {
    public final int v;
    public final hb1 f40049w;

    public sa1(hb1 hb1Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.f40049w = hb1Var;
        this.v = i10;
    }

    @Override
    public final void b(ta1 ta1Var) {
        int i10;
        hb1 hb1Var = this.f40049w;
        i10 = ((org.telegram.ui.ActionBar.m2) hb1Var).classGuid;
        ta1Var.a(this.v, i10, hb1Var.f36686a.stats_dc, new bi(2, hb1Var, this.f39723r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f39723r.f40336c <= 0) {
            performClick();
            jg.g gVar = this.f39719b;
            if (gVar.f13064t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f39724s == 4) {
                    ta1 ta1Var = this.f39723r;
                    ta1Var.e = new kg.e(ta1Var.d, selectedDate);
                    g(false);
                } else if (this.f39723r.f40338g == null) {
                } else {
                    hb1 hb1Var = this.f40049w;
                    hb1.Z(hb1Var);
                    String str = this.f39723r.f40338g + "_" + selectedDate;
                    kg.b bVar = (kg.b) hb1Var.V.get(str);
                    if (bVar != null) {
                        this.f39723r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39723r.f40338g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f19445x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    hb1Var.Z = obj;
                    hb1Var.S.getClass();
                    obj.f36370a = RecyclerView.R(this);
                    gVar.f13064t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new us0(this, str, obj, 10), null, null, 0, hb1Var.f36686a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.m2) hb1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        hb1.Z(this.f40049w);
    }
}
