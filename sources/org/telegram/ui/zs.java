package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zs implements r0.n, org.telegram.ui.Components.pk0 {
    public final nt f40558a;

    public zs(nt ntVar) {
        this.f40558a = ntVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f40558a.f35966q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var != null) {
            nt ntVar = this.f40558a;
            zg.b0 reactionsWindow = ntVar.P.getReactionsWindow();
            if (ntVar.f35964o.contains(o0Var.f49385f)) {
                if (ntVar.f35964o.size() > 1) {
                    ntVar.f35964o.remove(o0Var.f49385f);
                } else {
                    return;
                }
            } else {
                ntVar.f35964o.add(o0Var.f49385f);
                if (ntVar.f35964o.size() > 7) {
                    ntVar.f35964o.remove(0);
                }
            }
            ntVar.P.setSelectedEmojis(ntVar.f35964o);
            if (reactionsWindow != null) {
                zg.x xVar = reactionsWindow.f49243m;
                ntVar.P.p(null, null, false);
                if (xVar != null) {
                    xVar.setSelectedReactions(ntVar.f35964o);
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
