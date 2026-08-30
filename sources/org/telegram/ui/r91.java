package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class r91 extends q91 {
    public final int v;
    public final ga1 f37954w;

    public r91(ga1 ga1Var, Context context, int i10, int i11, vf.f fVar) {
        super(context, i11, fVar, null);
        this.f37954w = ga1Var;
        this.v = i10;
    }

    @Override
    public final void b(s91 s91Var) {
        int i10;
        ga1 ga1Var = this.f37954w;
        i10 = ((org.telegram.ui.ActionBar.p2) ga1Var).classGuid;
        s91Var.a(this.v, i10, ga1Var.f34527a.stats_dc, new org.telegram.ui.Components.s51(1, ga1Var, this.f37684r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f37684r.f38231c <= 0) {
            performClick();
            vf.g gVar = this.f37680b;
            if (gVar.f45731q0.D) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f37685s == 4) {
                    s91 s91Var = this.f37684r;
                    s91Var.e = new wf.e(s91Var.d, selectedDate);
                    g(false);
                } else if (this.f37684r.f38233g == null) {
                } else {
                    ga1 ga1Var = this.f37954w;
                    ga1.Z(ga1Var);
                    String str = this.f37684r.f38233g + "_" + selectedDate;
                    wf.b bVar = (wf.b) ga1Var.S.get(str);
                    if (bVar != null) {
                        this.f37684r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f37684r.f38233g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f19413x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ga1Var.W = obj;
                    ga1Var.P.getClass();
                    obj.f34204a = RecyclerView.R(this);
                    gVar.f45731q0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new rr0(this, str, obj, 10), null, null, 0, ga1Var.f34527a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.p2) ga1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        ga1.Z(this.f37954w);
    }
}
