package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class wr implements r0.m, org.telegram.ui.Components.ki0 {
    public final is f51593a;

    public wr(is isVar) {
        this.f51593a = isVar;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        this.f51593a.f46401q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        if (n0Var != null) {
            is isVar = this.f51593a;
            dh.a0 reactionsWindow = isVar.P.getReactionsWindow();
            if (isVar.f46399o.contains(n0Var.f9097f)) {
                if (isVar.f46399o.size() > 1) {
                    isVar.f46399o.remove(n0Var.f9097f);
                } else {
                    return;
                }
            } else {
                isVar.f46399o.add(n0Var.f9097f);
                if (isVar.f46399o.size() > 7) {
                    isVar.f46399o.remove(0);
                }
            }
            isVar.P.setSelectedEmojis(isVar.f46399o);
            if (reactionsWindow != null) {
                dh.v vVar = reactionsWindow.f8941m;
                isVar.P.p(null, null, false);
                if (vVar != null) {
                    vVar.setSelectedReactions(isVar.f46399o);
                    vVar.setRecentReactions(isVar.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public void J() {
    }

    @Override
    public void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
