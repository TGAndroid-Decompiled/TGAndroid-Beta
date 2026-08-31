package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class s91 extends r91 {
    public final int v;
    public final ha1 f41173w;

    public s91(ha1 ha1Var, Context context, int i10, int i11, wf.f fVar) {
        super(context, i11, fVar, null);
        this.f41173w = ha1Var;
        this.v = i10;
    }

    @Override
    public final void b(t91 t91Var) {
        int i10;
        ha1 ha1Var = this.f41173w;
        i10 = ((org.telegram.ui.ActionBar.p2) ha1Var).classGuid;
        t91Var.a(this.v, i10, ha1Var.f37416a.stats_dc, new org.telegram.ui.Components.t51(1, ha1Var, this.f40873r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f40873r.f41544c <= 0) {
            performClick();
            wf.g gVar = this.f40868b;
            if (gVar.f49569q0.D) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f40874s == 4) {
                    t91 t91Var = this.f40873r;
                    t91Var.f41545e = new xf.e(t91Var.d, selectedDate);
                    g(false);
                } else if (this.f40873r.f41547g == null) {
                } else {
                    ha1 ha1Var = this.f41173w;
                    ha1.Z(ha1Var);
                    String str = this.f40873r.f41547g + "_" + selectedDate;
                    xf.b bVar = (xf.b) ha1Var.S.get(str);
                    if (bVar != null) {
                        this.f40873r.f41545e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f40873r.f41547g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f21074x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ha1Var.W = obj;
                    ha1Var.P.getClass();
                    obj.f37144a = RecyclerView.R(this);
                    gVar.f49569q0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new tr0(this, str, obj, 10), null, null, 0, ha1Var.f37416a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.p2) ha1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        ha1.Z(this.f41173w);
    }
}
