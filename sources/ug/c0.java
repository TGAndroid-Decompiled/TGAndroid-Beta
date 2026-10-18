package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class c0 extends ei.d {
    public final RectF f47700h0;
    public boolean f47701i0;
    public float f47702j0;
    public final org.telegram.ui.Components.voip.h f47703k0;

    public c0(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f47700h0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f47703k0 = hVar;
        hVar.f31481n = 1.2f;
        hVar.f31478k = false;
        hVar.f31480m = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47701i0) {
            float f7 = this.f47702j0 + 0.016f;
            this.f47702j0 = f7;
            if (f7 > 3.0f) {
                this.f47701i0 = false;
            }
        } else {
            float f10 = this.f47702j0 - 0.016f;
            this.f47702j0 = f10;
            if (f10 < 1.0f) {
                this.f47701i0 = true;
            }
        }
        RectF rectF = this.f47700h0;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        sg.a1.d().f((-getMeasuredWidth()) * 0.1f * this.f47702j0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), sg.a1.d().e());
        int measuredWidth = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.f47703k0;
        hVar.f31474f = measuredWidth;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
