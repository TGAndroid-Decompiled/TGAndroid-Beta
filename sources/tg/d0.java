package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class d0 extends ci.d {
    public final RectF f43377h0;
    public boolean f43378i0;
    public float f43379j0;
    public final org.telegram.ui.Components.voip.h f43380k0;

    public d0(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f43377h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f43380k0 = hVar;
        hVar.f29365n = 1.2f;
        hVar.f29362k = false;
        hVar.f29364m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43378i0) {
            float f7 = this.f43379j0 + 0.016f;
            this.f43379j0 = f7;
            if (f7 > 3.0f) {
                this.f43378i0 = false;
            }
        } else {
            float f10 = this.f43379j0 - 0.016f;
            this.f43379j0 = f10;
            if (f10 < 1.0f) {
                this.f43378i0 = true;
            }
        }
        RectF rectF = this.f43377h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.a1.d().f((-getMeasuredWidth()) * 0.1f * this.f43379j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.a1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f43380k0;
        hVar.f29358f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
