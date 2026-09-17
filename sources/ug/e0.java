package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class e0 extends di.d {
    public final RectF f47110h0;
    public boolean f47111i0;
    public float f47112j0;
    public final org.telegram.ui.Components.voip.h f47113k0;

    public e0(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f47110h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f47113k0 = hVar;
        hVar.f31511n = 1.2f;
        hVar.f31508k = false;
        hVar.f31510m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47111i0) {
            float f7 = this.f47112j0 + 0.016f;
            this.f47112j0 = f7;
            if (f7 > 3.0f) {
                this.f47111i0 = false;
            }
        } else {
            float f10 = this.f47112j0 - 0.016f;
            this.f47112j0 = f10;
            if (f10 < 1.0f) {
                this.f47111i0 = true;
            }
        }
        RectF rectF = this.f47110h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        sg.d1.d().f((-getMeasuredWidth()) * 0.1f * this.f47112j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), sg.d1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f47113k0;
        hVar.f31504f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
