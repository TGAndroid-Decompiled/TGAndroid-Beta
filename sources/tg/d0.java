package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class d0 extends ci.d {
    public final RectF f43426h0;
    public boolean f43427i0;
    public float f43428j0;
    public final org.telegram.ui.Components.voip.h f43429k0;

    public d0(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f43426h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f43429k0 = hVar;
        hVar.f29337n = 1.2f;
        hVar.f29334k = false;
        hVar.f29336m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43427i0) {
            float f7 = this.f43428j0 + 0.016f;
            this.f43428j0 = f7;
            if (f7 > 3.0f) {
                this.f43427i0 = false;
            }
        } else {
            float f10 = this.f43428j0 - 0.016f;
            this.f43428j0 = f10;
            if (f10 < 1.0f) {
                this.f43427i0 = true;
            }
        }
        RectF rectF = this.f43426h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        rg.a1.d().f((-getMeasuredWidth()) * 0.1f * this.f43428j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rg.a1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f43429k0;
        hVar.f29330f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
