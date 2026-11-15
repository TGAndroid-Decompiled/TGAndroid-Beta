package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.e6;
public final class b0 extends hi.d {
    public final RectF f59134l0;
    public boolean m0;
    public float f59135n0;
    public final org.telegram.ui.Components.voip.n f59136o0;

    public b0(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.f59134l0 = new RectF();
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f59136o0 = nVar;
        nVar.f40802n = 1.2f;
        nVar.f40799k = false;
        nVar.f40801m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.m0) {
            float f10 = this.f59135n0 + 0.016f;
            this.f59135n0 = f10;
            if (f10 > 3.0f) {
                this.m0 = false;
            }
        } else {
            float f11 = this.f59135n0 - 0.016f;
            this.f59135n0 = f11;
            if (f11 < 1.0f) {
                this.m0 = true;
            }
        }
        RectF rectF = this.f59134l0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        ia.f.d().f((-getMeasuredWidth()) * 0.1f * this.f59135n0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ia.f.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.n nVar = this.f59136o0;
        nVar.f40795f = measuredWidth;
        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
