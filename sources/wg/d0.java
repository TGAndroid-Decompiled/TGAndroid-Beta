package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.h6;
public final class d0 extends hi.d {
    public final RectF m0;
    public boolean f59744n0;
    public float f59745o0;
    public final org.telegram.ui.Components.voip.n f59746p0;

    public d0(Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.m0 = new RectF();
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f59746p0 = nVar;
        nVar.f41155n = 1.2f;
        nVar.f41152k = false;
        nVar.f41154m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f59744n0) {
            float f10 = this.f59745o0 + 0.016f;
            this.f59745o0 = f10;
            if (f10 > 3.0f) {
                this.f59744n0 = false;
            }
        } else {
            float f11 = this.f59745o0 - 0.016f;
            this.f59745o0 = f11;
            if (f11 < 1.0f) {
                this.f59744n0 = true;
            }
        }
        RectF rectF = this.m0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.f59745o0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ia.e.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.n nVar = this.f59746p0;
        nVar.f41148f = measuredWidth;
        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
