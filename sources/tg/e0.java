package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class e0 extends ci.d {
    public final RectF f43151h0;
    public boolean f43152i0;
    public float f43153j0;
    public final org.telegram.ui.Components.voip.h f43154k0;

    public e0(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f43151h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f43154k0 = hVar;
        hVar.f28949n = 1.2f;
        hVar.f28946k = false;
        hVar.f28948m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43152i0) {
            float f7 = this.f43153j0 + 0.016f;
            this.f43153j0 = f7;
            if (f7 > 3.0f) {
                this.f43152i0 = false;
            }
        } else {
            float f10 = this.f43153j0 - 0.016f;
            this.f43153j0 = f10;
            if (f10 < 1.0f) {
                this.f43152i0 = true;
            }
        }
        RectF rectF = this.f43151h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.a1.d().f((-getMeasuredWidth()) * 0.1f * this.f43153j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.a1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f43154k0;
        hVar.f28942f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
