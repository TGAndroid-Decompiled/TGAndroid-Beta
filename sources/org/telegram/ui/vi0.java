package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class vi0 extends e91 {
    public final wi0 v;

    public vi0(wi0 wi0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, fVar, g6Var);
        this.v = wi0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        yi0 yi0Var = this.v.d;
        if (this.f36883r.f37533c <= 0) {
            performClick();
            jg.g gVar = this.f36879b;
            if (gVar.f14525t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f36884s == 4) {
                    g91 g91Var = this.f36883r;
                    g91Var.e = new kg.e(g91Var.d, selectedDate);
                    g(false);
                } else if (this.f36883r.f37535g == null) {
                } else {
                    f();
                    String str = this.f36883r.f37535g + "_" + selectedDate;
                    kg.b bVar = (kg.b) yi0Var.v.get(str);
                    if (bVar != null) {
                        this.f36883r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36883r.f37535g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20571x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    yi0Var.f43885w = obj;
                    yi0Var.f43881f.getClass();
                    obj.f41930a = RecyclerView.R(this);
                    gVar.f14525t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.o2) yi0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, (Object) obj, 25), null, null, 0, yi0Var.f43873a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.o2) yi0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.o2) yi0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        wi0 wi0Var = this.v;
        yi0 yi0Var = wi0Var.d;
        t91 t91Var = yi0Var.f43885w;
        if (t91Var != null) {
            t91Var.f41931b = true;
        }
        int childCount = yi0Var.f43881f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wi0Var.d.f43881f.getChildAt(i10);
            if (childAt instanceof e91) {
                ((e91) childAt).f36879b.f14525t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(g91 g91Var) {
    }
}
