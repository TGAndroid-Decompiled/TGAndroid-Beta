package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class us implements r0.n, org.telegram.ui.Components.bl0 {
    public final gt f42018a;

    public us(gt gtVar) {
        this.f42018a = gtVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        this.f42018a.f37308q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var != null) {
            gt gtVar = this.f42018a;
            ah.t0 reactionsWindow = gtVar.P.getReactionsWindow();
            if (gtVar.f37306o.contains(i1Var.f785f)) {
                if (gtVar.f37306o.size() > 1) {
                    gtVar.f37306o.remove(i1Var.f785f);
                } else {
                    return;
                }
            } else {
                gtVar.f37306o.add(i1Var.f785f);
                if (gtVar.f37306o.size() > 7) {
                    gtVar.f37306o.remove(0);
                }
            }
            gtVar.P.setSelectedEmojis(gtVar.f37306o);
            if (reactionsWindow != null) {
                ah.n0 n0Var = reactionsWindow.f879m;
                gtVar.P.p(null, null, false);
                if (n0Var != null) {
                    n0Var.setSelectedReactions(gtVar.f37306o);
                    n0Var.setRecentReactions(gtVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public void q() {
    }

    @Override
    public void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
