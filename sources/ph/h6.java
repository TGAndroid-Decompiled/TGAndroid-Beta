package ph;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class h6 implements ng.g {
    public final l6 f41748a;

    public h6(l6 l6Var) {
        this.f41748a = l6Var;
    }

    @Override
    public final void D(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        l6 l6Var = this.f41748a;
        canvas.drawColor(l6Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            l6Var.f41954i0.b(canvas, -3);
        }
    }

    @Override
    public final void D1(g.x xVar) {
        xVar.a(this.f41748a.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }
}
