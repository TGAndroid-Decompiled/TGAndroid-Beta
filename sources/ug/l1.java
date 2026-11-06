package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import bi.ud;
import org.telegram.messenger.rc;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.ch0;
public final class l1 extends m8 {
    public final ud W;
    public final int f56576a0;
    public final sg.t0 f56577b0;

    public l1(int i7, Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        this.W = new ud(1, 15);
        this.f56577b0 = new sg.t0(this, 20);
        if (i7 == 1) {
            i10 = k6.Tk;
        } else {
            i10 = k6.Ak;
        }
        this.f56576a0 = i10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = rc.e(131072);
        sg.t0 t0Var = this.f56577b0;
        if (e10) {
            ud udVar = this.W;
            udVar.d();
            udVar.a(canvas, k6.x0(null, this.f56576a0, false));
            bg.k.d().a(15, t0Var);
        } else {
            bg.k.d().f(t0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.f56577b0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ch0 ch0Var = this.f29566e;
        float width = (ch0Var.getWidth() / 2.0f) + ch0Var.getX();
        float y10 = ch0Var.getY();
        float height = ((ch0Var.getHeight() / 2.0f) + (y10 + ch0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.W.g(rectF);
    }
}
