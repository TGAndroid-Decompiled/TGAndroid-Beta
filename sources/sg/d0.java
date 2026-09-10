package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class d0 extends bi.d {
    public final RectF f41902h0;
    public boolean f41903i0;
    public float f41904j0;
    public final org.telegram.ui.Components.voip.h f41905k0;

    public d0(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f41902h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f41905k0 = hVar;
        hVar.f28154n = 1.2f;
        hVar.f28151k = false;
        hVar.f28153m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41903i0) {
            float f7 = this.f41904j0 + 0.016f;
            this.f41904j0 = f7;
            if (f7 > 3.0f) {
                this.f41903i0 = false;
            }
        } else {
            float f10 = this.f41904j0 - 0.016f;
            this.f41904j0 = f10;
            if (f10 < 1.0f) {
                this.f41903i0 = true;
            }
        }
        RectF rectF = this.f41902h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        qg.d1.d().f((-getMeasuredWidth()) * 0.1f * this.f41904j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), qg.d1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f41905k0;
        hVar.f28147f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
