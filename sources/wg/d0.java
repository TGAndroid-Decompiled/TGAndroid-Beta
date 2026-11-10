package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.h6;
public final class d0 extends fi.d {
    public final RectF f57712k0;
    public boolean f57713l0;
    public float m0;
    public final org.telegram.ui.Components.voip.n f57714n0;

    public d0(Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.f57712k0 = new RectF();
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f57714n0 = nVar;
        nVar.f39390n = 1.2f;
        nVar.f39387k = false;
        nVar.f39389m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f57713l0) {
            float f10 = this.m0 + 0.016f;
            this.m0 = f10;
            if (f10 > 3.0f) {
                this.f57713l0 = false;
            }
        } else {
            float f11 = this.m0 - 0.016f;
            this.m0 = f11;
            if (f11 < 1.0f) {
                this.f57713l0 = true;
            }
        }
        RectF rectF = this.f57712k0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.m0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ia.e.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.n nVar = this.f57714n0;
        nVar.f39383f = measuredWidth;
        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
