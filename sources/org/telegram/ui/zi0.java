package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class zi0 extends y91 {
    public final aj0 v;

    public zi0(aj0 aj0Var, Context context, int i10, vf.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = aj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        cj0 cj0Var = this.v.d;
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
                    f();
                    String str = this.f40194r.f32530g + "_" + selectedDate;
                    wf.b bVar = (wf.b) cj0Var.v.get(str);
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
                    cj0Var.f33176w = obj;
                    cj0Var.f33172f.getClass();
                    obj.f36467a = RecyclerView.R(this);
                    gVar.f45809q0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.p2) cj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new da(this, str, (Object) obj, 25), null, null, 0, cj0Var.f33167a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.p2) cj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.p2) cj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        aj0 aj0Var = this.v;
        cj0 cj0Var = aj0Var.d;
        na1 na1Var = cj0Var.f33176w;
        if (na1Var != null) {
            na1Var.f36468b = true;
        }
        int childCount = cj0Var.f33172f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = aj0Var.d.f33172f.getChildAt(i10);
            if (childAt instanceof y91) {
                ((y91) childAt).f40190b.f45809q0.d(false, true);
            }
        }
    }

    @Override
    public final void b(aa1 aa1Var) {
    }
}
