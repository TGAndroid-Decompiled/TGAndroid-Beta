package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class y91 extends x91 {
    public final int v;
    public final na1 f43582w;

    public y91(na1 na1Var, Context context, int i10, int i11, wf.f fVar) {
        super(context, i11, fVar, null);
        this.f43582w = na1Var;
        this.v = i10;
    }

    @Override
    public final void b(z91 z91Var) {
        int i10;
        na1 na1Var = this.f43582w;
        i10 = ((org.telegram.ui.ActionBar.p2) na1Var).classGuid;
        z91Var.a(this.v, i10, na1Var.f39248a.stats_dc, new org.telegram.ui.Components.s51(1, na1Var, this.f42971r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f42971r.f43861c <= 0) {
            performClick();
            wf.g gVar = this.f42966b;
            if (gVar.f49606q0.D) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f42972s == 4) {
                    z91 z91Var = this.f42971r;
                    z91Var.f43862e = new xf.e(z91Var.d, selectedDate);
                    g(false);
                } else if (this.f42971r.f43864g == null) {
                } else {
                    na1 na1Var = this.f43582w;
                    na1.Z(na1Var);
                    String str = this.f42971r.f43864g + "_" + selectedDate;
                    xf.b bVar = (xf.b) na1Var.S.get(str);
                    if (bVar != null) {
                        this.f42971r.f43862e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f42971r.f43864g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f21076x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    na1Var.W = obj;
                    na1Var.P.getClass();
                    obj.f38939a = RecyclerView.R(this);
                    gVar.f49606q0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new yr0(this, str, obj, 10), null, null, 0, na1Var.f39248a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.p2) na1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        na1.Z(this.f43582w);
    }
}
