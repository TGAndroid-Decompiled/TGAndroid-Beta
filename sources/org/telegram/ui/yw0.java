package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yw0 extends rg.p1 {
    public final zw0 N;

    public yw0(zw0 zw0Var, Context context) {
        super(context);
        this.N = zw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f42706r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            zw0 zw0Var = this.N;
            zw0Var.d.f32240n.f31444n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f42705n.h, zw0Var.d.f32240n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), zw0Var.d.f32240n.f31444n0.f42826f);
        }
        super.dispatchDraw(canvas);
    }
}
