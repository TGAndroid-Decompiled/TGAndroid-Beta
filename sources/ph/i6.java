package ph;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class i6 implements ng.g {
    public final m6 f41754a;

    public i6(m6 m6Var) {
        this.f41754a = m6Var;
    }

    @Override
    public final void Y(g.x xVar) {
        xVar.a(this.f41754a.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void k(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        m6 m6Var = this.f41754a;
        canvas.drawColor(m6Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            m6Var.f41947i0.b(canvas, -3);
        }
    }
}
