package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ti0 extends b91 {
    public final ui0 v;

    public ti0(ui0 ui0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = ui0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        wi0 wi0Var = this.v.d;
        if (this.f35609r.f36107c <= 0) {
            performClick();
            jg.g gVar = this.f35605b;
            if (gVar.f14475t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35610s == 4) {
                    d91 d91Var = this.f35609r;
                    d91Var.e = new kg.e(d91Var.d, selectedDate);
                    g(false);
                } else if (this.f35609r.f36109g == null) {
                } else {
                    f();
                    String str = this.f35609r.f36109g + "_" + selectedDate;
                    kg.b bVar = (kg.b) wi0Var.v.get(str);
                    if (bVar != null) {
                        this.f35609r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35609r.f36109g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20500x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    wi0Var.f42875w = obj;
                    wi0Var.f42871f.getClass();
                    obj.f40342a = RecyclerView.R(this);
                    gVar.f14475t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) wi0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, (Object) obj, 25), null, null, 0, wi0Var.f42863a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) wi0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) wi0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        ui0 ui0Var = this.v;
        wi0 wi0Var = ui0Var.d;
        q91 q91Var = wi0Var.f42875w;
        if (q91Var != null) {
            q91Var.f40343b = true;
        }
        int childCount = wi0Var.f42871f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ui0Var.d.f42871f.getChildAt(i10);
            if (childAt instanceof b91) {
                ((b91) childAt).f35605b.f14475t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(d91 d91Var) {
    }
}
