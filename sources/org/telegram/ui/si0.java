package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

public final class si0 extends a91 {
    public final ti0 v;

    public si0(ti0 ti0Var, Context context, int i10, rf.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = ti0Var;
    }

    @Override
    public final void c() {
        vi0 vi0Var = this.v.d;
        if (this.f36469r.f37023c > 0) {
            return;
        }
        performClick();
        rf.g gVar = this.f36464b;
        if (gVar.f46978p0.C) {
            long selectedDate = gVar.getSelectedDate();
            if (this.f36470s == 4) {
                c91 c91Var = this.f36469r;
                c91Var.f37024e = new sf.e(c91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.f36469r.f37026g == null) {
                return;
            }
            f();
            String str = this.f36469r.f37026g + "_" + selectedDate;
            sf.b bVar = (sf.b) vi0Var.v.get(str);
            if (bVar != null) {
                this.f36469r.f37024e = bVar;
                g(false);
                return;
            }
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f36469r.f37026g;
            if (selectedDate != 0) {
                tL_loadAsyncGraph.f22611x = selectedDate;
                tL_loadAsyncGraph.flags |= 1;
            }
            p91 p91Var = new p91();
            vi0Var.f43476w = p91Var;
            vi0Var.f43472f.getClass();
            p91Var.f41304a = RecyclerView.R(this);
            gVar.f46978p0.d(true, false);
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) vi0Var).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) vi0Var).currentAccount).sendRequest(tL_loadAsyncGraph, new z9(this, str, p91Var, 25), null, null, 0, vi0Var.f43467a.stats_dc, 1, true), ((org.telegram.ui.ActionBar.n2) vi0Var).classGuid);
        }
    }

    @Override
    public final void f() {
        ti0 ti0Var = this.v;
        vi0 vi0Var = ti0Var.d;
        p91 p91Var = vi0Var.f43476w;
        if (p91Var != null) {
            p91Var.f41305b = true;
        }
        int childCount = vi0Var.f43472f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ti0Var.d.f43472f.getChildAt(i10);
            if (childAt instanceof a91) {
                ((a91) childAt).f36464b.f46978p0.d(false, true);
            }
        }
    }

    @Override
    public final void b(c91 c91Var) {
    }
}
