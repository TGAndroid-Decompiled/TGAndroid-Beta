package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ri0 extends z81 {
    public final si0 v;

    public ri0(si0 si0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = si0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        ui0 ui0Var = this.v.d;
        if (this.f43675r.f35543c <= 0) {
            performClick();
            jg.g gVar = this.f43671b;
            if (gVar.f14480t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f43676s == 4) {
                    b91 b91Var = this.f43675r;
                    b91Var.e = new kg.e(b91Var.d, selectedDate);
                    g(false);
                } else if (this.f43675r.f35545g == null) {
                } else {
                    f();
                    String str = this.f43675r.f35545g + "_" + selectedDate;
                    kg.b bVar = (kg.b) ui0Var.v.get(str);
                    if (bVar != null) {
                        this.f43675r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f43675r.f35545g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20504x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ui0Var.f41997w = obj;
                    ui0Var.f41993f.getClass();
                    obj.f39803a = RecyclerView.R(this);
                    gVar.f14480t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) ui0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, (Object) obj, 25), null, null, 0, ui0Var.f41985a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) ui0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) ui0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        si0 si0Var = this.v;
        ui0 ui0Var = si0Var.d;
        o91 o91Var = ui0Var.f41997w;
        if (o91Var != null) {
            o91Var.f39804b = true;
        }
        int childCount = ui0Var.f41993f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = si0Var.d.f41993f.getChildAt(i10);
            if (childAt instanceof z81) {
                ((z81) childAt).f43671b.f14480t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(b91 b91Var) {
    }
}
