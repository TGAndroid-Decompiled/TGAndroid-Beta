package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zs implements r0.n, org.telegram.ui.Components.sk0 {
    public final nt f40671a;

    public zs(nt ntVar) {
        this.f40671a = ntVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f40671a.f36128q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var != null) {
            nt ntVar = this.f40671a;
            zg.b0 reactionsWindow = ntVar.P.getReactionsWindow();
            if (ntVar.f36126o.contains(o0Var.f49504f)) {
                if (ntVar.f36126o.size() > 1) {
                    ntVar.f36126o.remove(o0Var.f49504f);
                } else {
                    return;
                }
            } else {
                ntVar.f36126o.add(o0Var.f49504f);
                if (ntVar.f36126o.size() > 7) {
                    ntVar.f36126o.remove(0);
                }
            }
            ntVar.P.setSelectedEmojis(ntVar.f36126o);
            if (reactionsWindow != null) {
                zg.x xVar = reactionsWindow.f49362m;
                ntVar.P.p(null, null, false);
                if (xVar != null) {
                    xVar.setSelectedReactions(ntVar.f36126o);
                    xVar.setRecentReactions(ntVar.P.V);
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
    public boolean k() {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public void n() {
    }

    @Override
    public void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
