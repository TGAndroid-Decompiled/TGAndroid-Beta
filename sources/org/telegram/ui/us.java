package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class us implements r0.o, org.telegram.ui.Components.ek0 {
    public final ht f43329a;

    public us(ht htVar) {
        this.f43329a = htVar;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        this.f43329a.f39037q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        if (q0Var != null) {
            ht htVar = this.f43329a;
            kg.d0 reactionsWindow = htVar.P.getReactionsWindow();
            if (htVar.f39035o.contains(q0Var.f13825f)) {
                if (htVar.f39035o.size() > 1) {
                    htVar.f39035o.remove(q0Var.f13825f);
                } else {
                    return;
                }
            } else {
                htVar.f39035o.add(q0Var.f13825f);
                if (htVar.f39035o.size() > 7) {
                    htVar.f39035o.remove(0);
                }
            }
            htVar.P.setSelectedEmojis(htVar.f39035o);
            if (reactionsWindow != null) {
                kg.z zVar = reactionsWindow.f13691m;
                htVar.P.p(null, null, false);
                if (zVar != null) {
                    zVar.setSelectedReactions(htVar.f39035o);
                    zVar.setRecentReactions(htVar.P.R);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean w() {
        return false;
    }

    @Override
    public void H() {
    }

    @Override
    public void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
