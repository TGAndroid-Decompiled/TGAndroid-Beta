package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class z91 extends y91 {
    public final int v;
    public final oa1 f40430w;

    public z91(oa1 oa1Var, Context context, int i10, int i11, vf.f fVar) {
        super(context, i11, fVar, null);
        this.f40430w = oa1Var;
        this.v = i10;
    }

    @Override
    public final void b(aa1 aa1Var) {
        int i10;
        oa1 oa1Var = this.f40430w;
        i10 = ((org.telegram.ui.ActionBar.p2) oa1Var).classGuid;
        aa1Var.a(this.v, i10, oa1Var.f36711a.stats_dc, new org.telegram.ui.Components.s51(1, oa1Var, this.f40194r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f40194r.f32528c <= 0) {
            performClick();
            vf.g gVar = this.f40190b;
            if (gVar.f45809q0.D) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f40195s == 4) {
                    aa1 aa1Var = this.f40194r;
                    aa1Var.e = new wf.e(aa1Var.d, selectedDate);
                    g(false);
                } else if (this.f40194r.f32530g == null) {
                } else {
                    oa1 oa1Var = this.f40430w;
                    oa1.Z(oa1Var);
                    String str = this.f40194r.f32530g + "_" + selectedDate;
                    wf.b bVar = (wf.b) oa1Var.S.get(str);
                    if (bVar != null) {
                        this.f40194r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f40194r.f32530g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f19388x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    oa1Var.W = obj;
                    oa1Var.P.getClass();
                    obj.f36467a = RecyclerView.R(this);
                    gVar.f45809q0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new yr0(this, str, obj, 10), null, null, 0, oa1Var.f36711a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.p2) oa1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        oa1.Z(this.f40430w);
    }
}
