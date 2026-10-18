package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class si0 extends b91 {
    public final ti0 v;

    public si0(ti0 ti0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = ti0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        vi0 vi0Var = this.v.d;
        if (this.f35593r.f36100c <= 0) {
            performClick();
            jg.g gVar = this.f35589b;
            if (gVar.f14480t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35594s == 4) {
                    d91 d91Var = this.f35593r;
                    d91Var.e = new kg.e(d91Var.d, selectedDate);
                    g(false);
                } else if (this.f35593r.f36102g == null) {
                } else {
                    f();
                    String str = this.f35593r.f36102g + "_" + selectedDate;
                    kg.b bVar = (kg.b) vi0Var.v.get(str);
                    if (bVar != null) {
                        this.f35593r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35593r.f36102g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20500x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    vi0Var.f42209w = obj;
                    vi0Var.f42205f.getClass();
                    obj.f40306a = RecyclerView.R(this);
                    gVar.f14480t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) vi0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, (Object) obj, 25), null, null, 0, vi0Var.f42197a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) vi0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) vi0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        ti0 ti0Var = this.v;
        vi0 vi0Var = ti0Var.d;
        q91 q91Var = vi0Var.f42209w;
        if (q91Var != null) {
            q91Var.f40307b = true;
        }
        int childCount = vi0Var.f42205f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ti0Var.d.f42205f.getChildAt(i10);
            if (childAt instanceof b91) {
                ((b91) childAt).f35589b.f14480t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(d91 d91Var) {
    }
}
