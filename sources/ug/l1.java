package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import bi.ud;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.ch0;
public final class l1 extends m8 {
    public final ud W;
    public final int f56704a0;
    public final sh.b f56705b0;

    public l1(int i7, Context context, h6 h6Var) {
        super(context, h6Var);
        int i10;
        this.W = new ud(1, 15);
        this.f56705b0 = new sh.b(this, 18);
        if (i7 == 1) {
            i10 = m6.Tk;
        } else {
            i10 = m6.Ak;
        }
        this.f56704a0 = i10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = sc.e(131072);
        sh.b bVar = this.f56705b0;
        if (e10) {
            ud udVar = this.W;
            udVar.d();
            udVar.a(canvas, m6.x0(null, this.f56704a0, false));
            bg.k.d().a(15, bVar);
        } else {
            bg.k.d().f(bVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.f56705b0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ch0 ch0Var = this.f29585e;
        float width = (ch0Var.getWidth() / 2.0f) + ch0Var.getX();
        float y10 = ch0Var.getY();
        float height = ((ch0Var.getHeight() / 2.0f) + (y10 + ch0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.W.g(rectF);
    }
}
