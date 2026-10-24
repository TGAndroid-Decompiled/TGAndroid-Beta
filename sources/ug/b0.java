package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class b0 extends ei.d {
    public final RectF f48097k0;
    public boolean f48098l0;
    public float m0;
    public final org.telegram.ui.Components.voip.h f48099n0;

    public b0(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.f48097k0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f48099n0 = hVar;
        hVar.f31590n = 1.2f;
        hVar.f31587k = false;
        hVar.f31589m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48098l0) {
            float f7 = this.m0 + 0.016f;
            this.m0 = f7;
            if (f7 > 3.0f) {
                this.f48098l0 = false;
            }
        } else {
            float f10 = this.m0 - 0.016f;
            this.m0 = f10;
            if (f10 < 1.0f) {
                this.f48098l0 = true;
            }
        }
        RectF rectF = this.f48097k0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        sg.b1.d().f((-getMeasuredWidth()) * 0.1f * this.m0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), sg.b1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f48099n0;
        hVar.f31583f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
