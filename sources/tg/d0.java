package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
public final class d0 extends ci.d {
    public final RectF f48351h0;
    public boolean f48352i0;
    public float f48353j0;
    public final org.telegram.ui.Components.voip.h f48354k0;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.f48351h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f48354k0 = hVar;
        hVar.f32027n = 1.2f;
        hVar.f32024k = false;
        hVar.f32026m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48352i0) {
            float f7 = this.f48353j0 + 0.016f;
            this.f48353j0 = f7;
            if (f7 > 3.0f) {
                this.f48352i0 = false;
            }
        } else {
            float f10 = this.f48353j0 - 0.016f;
            this.f48353j0 = f10;
            if (f10 < 1.0f) {
                this.f48352i0 = true;
            }
        }
        RectF rectF = this.f48351h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.f48353j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.b1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f48354k0;
        hVar.f32020f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
