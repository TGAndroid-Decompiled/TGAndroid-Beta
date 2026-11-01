package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class xs implements r0.m, org.telegram.ui.Components.mj0 {
    public final kt f43452a;

    public xs(kt ktVar) {
        this.f43452a = ktVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        this.f43452a.f38991q = org.telegram.messenger.i0.I0(j1Var, false);
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
            kt ktVar = this.f43452a;
            sg.b0 reactionsWindow = ktVar.P.getReactionsWindow();
            if (ktVar.f38989o.contains(o0Var.f48445f)) {
                if (ktVar.f38989o.size() > 1) {
                    ktVar.f38989o.remove(o0Var.f48445f);
                } else {
                    return;
                }
            } else {
                ktVar.f38989o.add(o0Var.f48445f);
                if (ktVar.f38989o.size() > 7) {
                    ktVar.f38989o.remove(0);
                }
            }
            ktVar.P.setSelectedEmojis(ktVar.f38989o);
            if (reactionsWindow != null) {
                sg.w wVar = reactionsWindow.f48295m;
                ktVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(ktVar.f38989o);
                    wVar.setRecentReactions(ktVar.P.V);
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
