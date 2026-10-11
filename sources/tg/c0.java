package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class c0 extends ci.d {
    public final RectF f48369h0;
    public boolean f48370i0;
    public float f48371j0;
    public final org.telegram.ui.Components.voip.h f48372k0;

    public c0(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f48369h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f48372k0 = hVar;
        hVar.f32008n = 1.2f;
        hVar.f32005k = false;
        hVar.f32007m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48370i0) {
            float f7 = this.f48371j0 + 0.016f;
            this.f48371j0 = f7;
            if (f7 > 3.0f) {
                this.f48370i0 = false;
            }
        } else {
            float f10 = this.f48371j0 - 0.016f;
            this.f48371j0 = f10;
            if (f10 < 1.0f) {
                this.f48370i0 = true;
            }
        }
        RectF rectF = this.f48369h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.f48371j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.b1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f48372k0;
        hVar.f32001f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
