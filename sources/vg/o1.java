package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import ci.lc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.fh0;
public final class o1 extends l8 {
    public final lc f56770a0;
    public final int f56771b0;
    public final r4.u f56772c0;

    public o1(int i3, Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        this.f56770a0 = new lc(1, 15);
        this.f56772c0 = new r4.u(this, 22);
        if (i3 == 1) {
            i10 = k6.Tk;
        } else {
            i10 = k6.Ak;
        }
        this.f56771b0 = i10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = org.telegram.messenger.lc.e(131072);
        r4.u uVar = this.f56772c0;
        if (e10) {
            lc lcVar = this.f56770a0;
            lcVar.d();
            lcVar.a(canvas, k6.x0(null, this.f56771b0, false));
            cg.j.d().a(15, uVar);
        } else {
            cg.j.d().f(uVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cg.j.d().f(this.f56772c0);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        fh0 fh0Var = this.f29595e;
        float width = (fh0Var.getWidth() / 2.0f) + fh0Var.getX();
        float y9 = fh0Var.getY();
        float height = ((fh0Var.getHeight() / 2.0f) + (y9 + fh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.f56770a0.g(rectF);
    }
}
