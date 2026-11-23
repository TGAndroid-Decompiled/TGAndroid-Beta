package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.i6;
public final class c0 extends hi.e {
    public final RectF m0;
    public boolean f59836n0;
    public float f59837o0;
    public final org.telegram.ui.Components.voip.n f59838p0;

    public c0(Context context, i6 i6Var) {
        super(context, i6Var, true);
        this.m0 = new RectF();
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f59838p0 = nVar;
        nVar.f41081n = 1.2f;
        nVar.f41078k = false;
        nVar.f41080m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f59836n0) {
            float f10 = this.f59837o0 + 0.016f;
            this.f59837o0 = f10;
            if (f10 > 3.0f) {
                this.f59836n0 = false;
            }
        } else {
            float f11 = this.f59837o0 - 0.016f;
            this.f59837o0 = f11;
            if (f11 < 1.0f) {
                this.f59836n0 = true;
            }
        }
        RectF rectF = this.m0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.f59837o0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ia.e.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.n nVar = this.f59838p0;
        nVar.f41074f = measuredWidth;
        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
