package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
public final class d0 extends di.d {
    public final RectF f46294h0;
    public boolean f46295i0;
    public float f46296j0;
    public final org.telegram.ui.Components.voip.h f46297k0;

    public d0(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f46294h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f46297k0 = hVar;
        hVar.f29872n = 1.2f;
        hVar.f29869k = false;
        hVar.f29871m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46295i0) {
            float f7 = this.f46296j0 + 0.016f;
            this.f46296j0 = f7;
            if (f7 > 3.0f) {
                this.f46295i0 = false;
            }
        } else {
            float f10 = this.f46296j0 - 0.016f;
            this.f46296j0 = f10;
            if (f10 < 1.0f) {
                this.f46295i0 = true;
            }
        }
        RectF rectF = this.f46294h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        sg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.f46296j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), sg.b1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f46297k0;
        hVar.f29865f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
