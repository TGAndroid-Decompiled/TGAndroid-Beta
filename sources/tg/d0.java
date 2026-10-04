package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class d0 extends ci.d {
    public final RectF f46992h0;
    public boolean f46993i0;
    public float f46994j0;
    public final org.telegram.ui.Components.voip.h f46995k0;

    public d0(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f46992h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f46995k0 = hVar;
        hVar.f31882n = 1.2f;
        hVar.f31879k = false;
        hVar.f31881m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46993i0) {
            float f7 = this.f46994j0 + 0.016f;
            this.f46994j0 = f7;
            if (f7 > 3.0f) {
                this.f46993i0 = false;
            }
        } else {
            float f10 = this.f46994j0 - 0.016f;
            this.f46994j0 = f10;
            if (f10 < 1.0f) {
                this.f46993i0 = true;
            }
        }
        RectF rectF = this.f46992h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.f46994j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.b1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f46995k0;
        hVar.f31875f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
