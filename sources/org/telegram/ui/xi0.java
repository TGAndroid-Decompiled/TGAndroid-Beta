package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class xi0 extends q91 {
    public final yi0 v;

    public xi0(yi0 yi0Var, Context context, int i10, vf.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = yi0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        aj0 aj0Var = this.v.d;
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
                    f();
                    String str = this.f37684r.f38233g + "_" + selectedDate;
                    wf.b bVar = (wf.b) aj0Var.v.get(str);
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
                    aj0Var.f32655w = obj;
                    aj0Var.f32651f.getClass();
                    obj.f34204a = RecyclerView.R(this);
                    gVar.f45731q0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.p2) aj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ba(this, str, (Object) obj, 25), null, null, 0, aj0Var.f32646a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.p2) aj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.p2) aj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        yi0 yi0Var = this.v;
        aj0 aj0Var = yi0Var.d;
        fa1 fa1Var = aj0Var.f32655w;
        if (fa1Var != null) {
            fa1Var.f34205b = true;
        }
        int childCount = aj0Var.f32651f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yi0Var.d.f32651f.getChildAt(i10);
            if (childAt instanceof q91) {
                ((q91) childAt).f37680b.f45731q0.d(false, true);
            }
        }
    }

    @Override
    public final void b(s91 s91Var) {
    }
}
