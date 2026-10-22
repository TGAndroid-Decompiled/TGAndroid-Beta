package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ss implements r0.n, org.telegram.ui.Components.cl0 {
    public final et f41528a;

    public ss(et etVar) {
        this.f41528a = etVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        this.f41528a.f36795q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var != null) {
            et etVar = this.f41528a;
            ah.t0 reactionsWindow = etVar.P.getReactionsWindow();
            if (etVar.f36793o.contains(i1Var.f783f)) {
                if (etVar.f36793o.size() > 1) {
                    etVar.f36793o.remove(i1Var.f783f);
                } else {
                    return;
                }
            } else {
                etVar.f36793o.add(i1Var.f783f);
                if (etVar.f36793o.size() > 7) {
                    etVar.f36793o.remove(0);
                }
            }
            etVar.P.setSelectedEmojis(etVar.f36793o);
            if (reactionsWindow != null) {
                ah.n0 n0Var = reactionsWindow.f877m;
                etVar.P.p(null, null, false);
                if (n0Var != null) {
                    n0Var.setSelectedReactions(etVar.f36793o);
                    n0Var.setRecentReactions(etVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean w() {
        return false;
    }

    @Override
    public void v() {
    }

    @Override
    public void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
