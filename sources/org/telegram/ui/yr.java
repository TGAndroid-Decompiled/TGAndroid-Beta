package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class yr implements r0.m, org.telegram.ui.Components.hi0 {
    public final ks f52315a;

    public yr(ks ksVar) {
        this.f52315a = ksVar;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        this.f52315a.f47287q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        if (o0Var != null) {
            ks ksVar = this.f52315a;
            ch.b0 reactionsWindow = ksVar.P.getReactionsWindow();
            if (ksVar.f47285o.contains(o0Var.f6356f)) {
                if (ksVar.f47285o.size() > 1) {
                    ksVar.f47285o.remove(o0Var.f6356f);
                } else {
                    return;
                }
            } else {
                ksVar.f47285o.add(o0Var.f6356f);
                if (ksVar.f47285o.size() > 7) {
                    ksVar.f47285o.remove(0);
                }
            }
            ksVar.P.setSelectedEmojis(ksVar.f47285o);
            if (reactionsWindow != null) {
                ch.w wVar = reactionsWindow.f6193m;
                ksVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(ksVar.f47285o);
                    wVar.setRecentReactions(ksVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public void M() {
    }

    @Override
    public void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
