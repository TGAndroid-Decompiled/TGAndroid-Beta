package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vs implements r0.n, org.telegram.ui.Components.fl0 {
    public final ht f42831a;

    public vs(ht htVar) {
        this.f42831a = htVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        this.f42831a.f37950q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var != null) {
            ht htVar = this.f42831a;
            ah.t0 reactionsWindow = htVar.P.getReactionsWindow();
            if (htVar.f37948o.contains(i1Var.f784f)) {
                if (htVar.f37948o.size() > 1) {
                    htVar.f37948o.remove(i1Var.f784f);
                } else {
                    return;
                }
            } else {
                htVar.f37948o.add(i1Var.f784f);
                if (htVar.f37948o.size() > 7) {
                    htVar.f37948o.remove(0);
                }
            }
            htVar.P.setSelectedEmojis(htVar.f37948o);
            if (reactionsWindow != null) {
                ah.n0 n0Var = reactionsWindow.f878m;
                htVar.P.p(null, null, false);
                if (n0Var != null) {
                    n0Var.setSelectedReactions(htVar.f37948o);
                    n0Var.setRecentReactions(htVar.P.V);
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
    public void u() {
    }

    @Override
    public void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
