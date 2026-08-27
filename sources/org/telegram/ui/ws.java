package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class ws implements r0.o, org.telegram.ui.Components.vj0 {

    public final kt f44184a;

    public ws(kt ktVar) {
        this.f44184a = ktVar;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        this.f44184a.f39873q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        if (q0Var == null) {
            return;
        }
        kt ktVar = this.f44184a;
        ig.d0 reactionsWindow = ktVar.P.getReactionsWindow();
        if (!ktVar.f39871o.contains(q0Var.f11412f)) {
            ktVar.f39871o.add(q0Var.f11412f);
            if (ktVar.f39871o.size() > 7) {
                ktVar.f39871o.remove(0);
            }
        } else if (ktVar.f39871o.size() <= 1) {
            return;
        } else {
            ktVar.f39871o.remove(q0Var.f11412f);
        }
        ktVar.P.setSelectedEmojis(ktVar.f39871o);
        if (reactionsWindow != null) {
            ig.z zVar = reactionsWindow.f11278m;
            ktVar.P.p(null, null, false);
            if (zVar != null) {
                zVar.setSelectedReactions(ktVar.f39871o);
                zVar.setRecentReactions(ktVar.P.R);
            }
            reactionsWindow.d();
        }
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public void s() {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
