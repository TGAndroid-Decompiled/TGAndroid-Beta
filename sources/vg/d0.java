package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
public final class d0 extends fi.d {
    public final RectF f50193k0;
    public boolean f50194l0;
    public float m0;
    public final org.telegram.ui.Components.voip.h f50195n0;

    public d0(Context context, u6 u6Var) {
        super(context, u6Var, true);
        this.f50193k0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f50195n0 = hVar;
        hVar.f33932n = 1.2f;
        hVar.f33929k = false;
        hVar.f33931m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50194l0) {
            float f7 = this.m0 + 0.016f;
            this.m0 = f7;
            if (f7 > 3.0f) {
                this.f50194l0 = false;
            }
        } else {
            float f10 = this.m0 - 0.016f;
            this.m0 = f10;
            if (f10 < 1.0f) {
                this.f50194l0 = true;
            }
        }
        RectF rectF = this.f50193k0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        tg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.m0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), tg.b1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f50195n0;
        hVar.f33925f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
