package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class ys implements r0.m, org.telegram.ui.Components.lj0 {
    public final lt f43886a;

    public ys(lt ltVar) {
        this.f43886a = ltVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        this.f43886a.f39401q = org.telegram.messenger.i0.I0(j1Var, false);
        return j1Var;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var != null) {
            lt ltVar = this.f43886a;
            sg.b0 reactionsWindow = ltVar.P.getReactionsWindow();
            if (ltVar.f39399o.contains(o0Var.f48434f)) {
                if (ltVar.f39399o.size() > 1) {
                    ltVar.f39399o.remove(o0Var.f48434f);
                } else {
                    return;
                }
            } else {
                ltVar.f39399o.add(o0Var.f48434f);
                if (ltVar.f39399o.size() > 7) {
                    ltVar.f39399o.remove(0);
                }
            }
            ltVar.P.setSelectedEmojis(ltVar.f39399o);
            if (reactionsWindow != null) {
                sg.w wVar = reactionsWindow.f48284m;
                ltVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(ltVar.f39399o);
                    wVar.setRecentReactions(ltVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public void t() {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
