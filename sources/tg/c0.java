package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class c0 extends ci.d {
    public final RectF f48403h0;
    public boolean f48404i0;
    public float f48405j0;
    public final org.telegram.ui.Components.voip.h f48406k0;

    public c0(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f48403h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f48406k0 = hVar;
        hVar.f32072n = 1.2f;
        hVar.f32069k = false;
        hVar.f32071m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48404i0) {
            float f7 = this.f48405j0 + 0.016f;
            this.f48405j0 = f7;
            if (f7 > 3.0f) {
                this.f48404i0 = false;
            }
        } else {
            float f10 = this.f48405j0 - 0.016f;
            this.f48405j0 = f10;
            if (f10 < 1.0f) {
                this.f48404i0 = true;
            }
        }
        RectF rectF = this.f48403h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.f48405j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.b1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f48406k0;
        hVar.f32065f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
