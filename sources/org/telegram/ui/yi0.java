package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class yi0 extends x91 {
    public final zi0 v;

    public yi0(zi0 zi0Var, Context context, int i10, wf.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, fVar, g6Var);
        this.v = zi0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        bj0 bj0Var = this.v.d;
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
                    f();
                    String str = this.f42971r.f43864g + "_" + selectedDate;
                    xf.b bVar = (xf.b) bj0Var.v.get(str);
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
                    bj0Var.f35554w = obj;
                    bj0Var.f35550f.getClass();
                    obj.f38939a = RecyclerView.R(this);
                    gVar.f49606q0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.p2) bj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ba(this, str, (Object) obj, 25), null, null, 0, bj0Var.f35544a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.p2) bj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.p2) bj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        zi0 zi0Var = this.v;
        bj0 bj0Var = zi0Var.d;
        ma1 ma1Var = bj0Var.f35554w;
        if (ma1Var != null) {
            ma1Var.f38940b = true;
        }
        int childCount = bj0Var.f35550f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zi0Var.d.f35550f.getChildAt(i10);
            if (childAt instanceof x91) {
                ((x91) childAt).f42966b.f49606q0.d(false, true);
            }
        }
    }

    @Override
    public final void b(z91 z91Var) {
    }
}
