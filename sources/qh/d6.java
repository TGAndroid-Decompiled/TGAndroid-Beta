package qh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class d6 implements og.g {
    public final i6 f45234a;

    public d6(i6 i6Var) {
        this.f45234a = i6Var;
    }

    @Override
    public final void P(g.x xVar) {
        xVar.a(this.f45234a.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void i(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        i6 i6Var = this.f45234a;
        canvas.drawColor(i6Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            i6Var.f45474i0.b(canvas, -2);
        }
    }
}
