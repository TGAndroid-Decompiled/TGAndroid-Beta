package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ui0 extends d91 {
    public final vi0 v;

    public ui0(vi0 vi0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, fVar, g6Var);
        this.v = vi0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        xi0 xi0Var = this.v.d;
        if (this.f36544r.f37245c <= 0) {
            performClick();
            jg.g gVar = this.f36540b;
            if (gVar.f14525t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f36545s == 4) {
                    f91 f91Var = this.f36544r;
                    f91Var.e = new kg.e(f91Var.d, selectedDate);
                    g(false);
                } else if (this.f36544r.f37247g == null) {
                } else {
                    f();
                    String str = this.f36544r.f37247g + "_" + selectedDate;
                    kg.b bVar = (kg.b) xi0Var.v.get(str);
                    if (bVar != null) {
                        this.f36544r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36544r.f37247g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20572x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    xi0Var.f43626w = obj;
                    xi0Var.f43622f.getClass();
                    obj.f41324a = RecyclerView.R(this);
                    gVar.f14525t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.o2) xi0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, (Object) obj, 25), null, null, 0, xi0Var.f43614a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.o2) xi0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.o2) xi0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        vi0 vi0Var = this.v;
        xi0 xi0Var = vi0Var.d;
        s91 s91Var = xi0Var.f43626w;
        if (s91Var != null) {
            s91Var.f41325b = true;
        }
        int childCount = xi0Var.f43622f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = vi0Var.d.f43622f.getChildAt(i10);
            if (childAt instanceof d91) {
                ((d91) childAt).f36540b.f14525t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(f91 f91Var) {
    }
}
