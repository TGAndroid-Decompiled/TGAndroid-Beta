package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
public final class d0 extends ci.d {
    public final RectF f48305h0;
    public boolean f48306i0;
    public float f48307j0;
    public final org.telegram.ui.Components.voip.h f48308k0;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.f48305h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f48308k0 = hVar;
        hVar.f31962n = 1.2f;
        hVar.f31959k = false;
        hVar.f31961m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48306i0) {
            float f7 = this.f48307j0 + 0.016f;
            this.f48307j0 = f7;
            if (f7 > 3.0f) {
                this.f48306i0 = false;
            }
        } else {
            float f10 = this.f48307j0 - 0.016f;
            this.f48307j0 = f10;
            if (f10 < 1.0f) {
                this.f48306i0 = true;
            }
        }
        RectF rectF = this.f48305h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.f48307j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.b1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f48308k0;
        hVar.f31955f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
