package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class tw0 extends fg.j2 {
    public final uw0 K;

    public tw0(uw0 uw0Var, Context context) {
        super(context);
        this.K = uw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f6361r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            uw0 uw0Var = this.K;
            uw0Var.d.f42226n.f34495k0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f6360n.h, uw0Var.d.f42226n.L);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), uw0Var.d.f42226n.f34495k0.f6490f);
        }
        super.dispatchDraw(canvas);
    }
}
