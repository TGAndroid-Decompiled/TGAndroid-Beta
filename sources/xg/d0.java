package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.e6;
public final class d0 extends gi.d {
    public final RectF f58663l0;
    public boolean m0;
    public float f58664n0;
    public final org.telegram.ui.Components.voip.g f58665o0;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.f58663l0 = new RectF();
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f58665o0 = gVar;
        gVar.f39356n = 1.2f;
        gVar.f39353k = false;
        gVar.f39355m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.m0) {
            float f10 = this.f58664n0 + 0.016f;
            this.f58664n0 = f10;
            if (f10 > 3.0f) {
                this.m0 = false;
            }
        } else {
            float f11 = this.f58664n0 - 0.016f;
            this.f58664n0 = f11;
            if (f11 < 1.0f) {
                this.m0 = true;
            }
        }
        RectF rectF = this.f58663l0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        ha.e.d().f((-getMeasuredWidth()) * 0.1f * this.f58664n0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ha.e.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.g gVar = this.f58665o0;
        gVar.f39349f = measuredWidth;
        gVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
