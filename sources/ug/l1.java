package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import bi.ud;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.dh0;
public final class l1 extends m8 {
    public final ud W;
    public final int f56705a0;
    public final sh.b f56706b0;

    public l1(int i7, Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        this.W = new ud(1, 15);
        this.f56706b0 = new sh.b(this, 18);
        if (i7 == 1) {
            i10 = l6.Tk;
        } else {
            i10 = l6.Ak;
        }
        this.f56705a0 = i10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = sc.e(131072);
        sh.b bVar = this.f56706b0;
        if (e10) {
            ud udVar = this.W;
            udVar.d();
            udVar.a(canvas, l6.x0(null, this.f56705a0, false));
            bg.k.d().a(15, bVar);
        } else {
            bg.k.d().f(bVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.f56706b0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        dh0 dh0Var = this.f29574e;
        float width = (dh0Var.getWidth() / 2.0f) + dh0Var.getX();
        float y10 = dh0Var.getY();
        float height = ((dh0Var.getHeight() / 2.0f) + (y10 + dh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.W.g(rectF);
    }
}
