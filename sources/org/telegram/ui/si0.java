package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class si0 extends g91 {
    public final ti0 v;

    public si0(ti0 ti0Var, Context context, int i10, kg.g gVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, gVar, u6Var);
        this.v = ti0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        vi0 vi0Var = this.v.d;
        if (this.f39573r.f40185c <= 0) {
            performClick();
            kg.h hVar = this.f39569b;
            if (hVar.f16618t0.G) {
                long selectedDate = hVar.getSelectedDate();
                if (this.f39574s == 4) {
                    i91 i91Var = this.f39573r;
                    i91Var.e = new lg.e(i91Var.d, selectedDate);
                    g(false);
                } else if (this.f39573r.f40187g == null) {
                } else {
                    f();
                    String str = this.f39573r.f40187g + "_" + selectedDate;
                    lg.b bVar = (lg.b) vi0Var.v.get(str);
                    if (bVar != null) {
                        this.f39573r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39573r.f40187g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22258x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    vi0Var.f44829w = obj;
                    vi0Var.f44825f.getClass();
                    obj.f44746a = RecyclerView.R(this);
                    hVar.f16618t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.r2) vi0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, (Object) obj, 25), null, null, 0, vi0Var.f44817a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.r2) vi0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.r2) vi0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        ti0 ti0Var = this.v;
        vi0 vi0Var = ti0Var.d;
        v91 v91Var = vi0Var.f44829w;
        if (v91Var != null) {
            v91Var.f44747b = true;
        }
        int childCount = vi0Var.f44825f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ti0Var.d.f44825f.getChildAt(i10);
            if (childAt instanceof g91) {
                ((g91) childAt).f39569b.f16618t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(i91 i91Var) {
    }
}
