package qh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class g6 implements og.g {
    public final k6 f45363a;

    public g6(k6 k6Var) {
        this.f45363a = k6Var;
    }

    @Override
    public final void P(g.x xVar) {
        xVar.a(this.f45363a.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void i(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.f21659d6;
        k6 k6Var = this.f45363a;
        canvas.drawColor(k6Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            k6Var.f45575i0.b(canvas, -3);
        }
    }
}
