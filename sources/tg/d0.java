package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
public final class d0 extends ci.d {
    public final RectF f43436h0;
    public boolean f43437i0;
    public float f43438j0;
    public final org.telegram.ui.Components.voip.h f43439k0;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.f43436h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f43439k0 = hVar;
        hVar.f29317n = 1.2f;
        hVar.f29314k = false;
        hVar.f29316m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43437i0) {
            float f7 = this.f43438j0 + 0.016f;
            this.f43438j0 = f7;
            if (f7 > 3.0f) {
                this.f43437i0 = false;
            }
        } else {
            float f10 = this.f43438j0 - 0.016f;
            this.f43438j0 = f10;
            if (f10 < 1.0f) {
                this.f43437i0 = true;
            }
        }
        RectF rectF = this.f43436h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.a1.d().f((-getMeasuredWidth()) * 0.1f * this.f43438j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.a1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f43439k0;
        hVar.f29310f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
