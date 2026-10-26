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
        if (this.f39576r.f40188c <= 0) {
            performClick();
            kg.h hVar = this.f39572b;
            if (hVar.f16618t0.G) {
                long selectedDate = hVar.getSelectedDate();
                if (this.f39577s == 4) {
                    i91 i91Var = this.f39576r;
                    i91Var.e = new lg.e(i91Var.d, selectedDate);
                    g(false);
                } else if (this.f39576r.f40190g == null) {
                } else {
                    f();
                    String str = this.f39576r.f40190g + "_" + selectedDate;
                    lg.b bVar = (lg.b) vi0Var.v.get(str);
                    if (bVar != null) {
                        this.f39576r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39576r.f40190g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22260x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    vi0Var.f44832w = obj;
                    vi0Var.f44828f.getClass();
                    obj.f44749a = RecyclerView.R(this);
                    hVar.f16618t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.r2) vi0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, (Object) obj, 25), null, null, 0, vi0Var.f44820a.stats_dc, 1, true);
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
        v91 v91Var = vi0Var.f44832w;
        if (v91Var != null) {
            v91Var.f44750b = true;
        }
        int childCount = vi0Var.f44828f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ti0Var.d.f44828f.getChildAt(i10);
            if (childAt instanceof g91) {
                ((g91) childAt).f39572b.f16618t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(i91 i91Var) {
    }
}
