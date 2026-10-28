package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vw0 extends tg.r1 {
    public final ww0 N;

    public vw0(ww0 ww0Var, Context context) {
        super(context);
        this.N = ww0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f49063r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ww0 ww0Var = this.N;
            ww0Var.d.f45792n.f35906n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f49062n.h, ww0Var.d.f45792n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ww0Var.d.f45792n.f35906n0.f48832f);
        }
        super.dispatchDraw(canvas);
    }
}
