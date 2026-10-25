package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ts implements r0.n, org.telegram.ui.Components.el0 {
    public final ft f43899a;

    public ts(ft ftVar) {
        this.f43899a = ftVar;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        this.f43899a.f39461q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
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
            ft ftVar = this.f43899a;
            bh.i0 reactionsWindow = ftVar.P.getReactionsWindow();
            if (ftVar.f39459o.contains(x0Var.f4208f)) {
                if (ftVar.f39459o.size() > 1) {
                    ftVar.f39459o.remove(x0Var.f4208f);
                } else {
                    return;
                }
            } else {
                ftVar.f39459o.add(x0Var.f4208f);
                if (ftVar.f39459o.size() > 7) {
                    ftVar.f39459o.remove(0);
                }
            }
            ftVar.P.setSelectedEmojis(ftVar.f39459o);
            if (reactionsWindow != null) {
                bh.d0 d0Var = reactionsWindow.f4056m;
                ftVar.P.p(null, null, false);
                if (d0Var != null) {
                    d0Var.setSelectedReactions(ftVar.f39459o);
                    d0Var.setRecentReactions(ftVar.P.V);
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
