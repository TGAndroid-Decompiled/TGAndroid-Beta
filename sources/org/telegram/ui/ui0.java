package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ui0 extends i91 {
    public final vi0 v;

    public ui0(vi0 vi0Var, Context context, int i10, kg.g gVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, gVar, u6Var);
        this.v = vi0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        xi0 xi0Var = this.v.d;
        if (this.f40076r.f40706c <= 0) {
            performClick();
            kg.h hVar = this.f40072b;
            if (hVar.f16617t0.G) {
                long selectedDate = hVar.getSelectedDate();
                if (this.f40077s == 4) {
                    k91 k91Var = this.f40076r;
                    k91Var.e = new lg.e(k91Var.d, selectedDate);
                    g(false);
                } else if (this.f40076r.f40708g == null) {
                } else {
                    f();
                    String str = this.f40076r.f40708g + "_" + selectedDate;
                    lg.b bVar = (lg.b) xi0Var.v.get(str);
                    if (bVar != null) {
                        this.f40076r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f40076r.f40708g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22261x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    xi0Var.f45707w = obj;
                    xi0Var.f45703f.getClass();
                    obj.f45633a = RecyclerView.R(this);
                    hVar.f16617t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.r2) xi0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, (Object) obj, 25), null, null, 0, xi0Var.f45695a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.r2) xi0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.r2) xi0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        vi0 vi0Var = this.v;
        xi0 xi0Var = vi0Var.d;
        x91 x91Var = xi0Var.f45707w;
        if (x91Var != null) {
            x91Var.f45634b = true;
        }
        int childCount = xi0Var.f45703f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = vi0Var.d.f45703f.getChildAt(i10);
            if (childAt instanceof i91) {
                ((i91) childAt).f40072b.f16617t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(k91 k91Var) {
    }
}
