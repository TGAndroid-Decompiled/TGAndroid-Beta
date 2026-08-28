package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vs implements r0.o, org.telegram.ui.Components.tj0 {
    public final ht f43577a;

    public vs(ht htVar) {
        this.f43577a = htVar;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        this.f43577a.f38928q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override
    public void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        if (r0Var != null) {
            ht htVar = this.f43577a;
            hg.e0 reactionsWindow = htVar.P.getReactionsWindow();
            if (htVar.f38926o.contains(r0Var.f10717f)) {
                if (htVar.f38926o.size() > 1) {
                    htVar.f38926o.remove(r0Var.f10717f);
                } else {
                    return;
                }
            } else {
                htVar.f38926o.add(r0Var.f10717f);
                if (htVar.f38926o.size() > 7) {
                    htVar.f38926o.remove(0);
                }
            }
            htVar.P.setSelectedEmojis(htVar.f38926o);
            if (reactionsWindow != null) {
                hg.z zVar = reactionsWindow.f10584m;
                htVar.P.p(null, null, false);
                if (zVar != null) {
                    zVar.setSelectedReactions(htVar.f38926o);
                    zVar.setRecentReactions(htVar.P.R);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public void t() {
    }

    @Override
    public void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
