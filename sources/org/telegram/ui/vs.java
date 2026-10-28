package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vs implements r0.n, org.telegram.ui.Components.fl0 {
    public final ht f44414a;

    public vs(ht htVar) {
        this.f44414a = htVar;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        this.f44414a.f39979q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        if (x0Var != null) {
            ht htVar = this.f44414a;
            bh.i0 reactionsWindow = htVar.P.getReactionsWindow();
            if (htVar.f39977o.contains(x0Var.f4208f)) {
                if (htVar.f39977o.size() > 1) {
                    htVar.f39977o.remove(x0Var.f4208f);
                } else {
                    return;
                }
            } else {
                htVar.f39977o.add(x0Var.f4208f);
                if (htVar.f39977o.size() > 7) {
                    htVar.f39977o.remove(0);
                }
            }
            htVar.P.setSelectedEmojis(htVar.f39977o);
            if (reactionsWindow != null) {
                bh.d0 d0Var = reactionsWindow.f4056m;
                htVar.P.p(null, null, false);
                if (d0Var != null) {
                    d0Var.setSelectedReactions(htVar.f39977o);
                    d0Var.setRecentReactions(htVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public void m() {
    }

    @Override
    public void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
