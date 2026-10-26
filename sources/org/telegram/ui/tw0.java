package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class tw0 extends tg.r1 {
    public final uw0 N;

    public tw0(uw0 uw0Var, Context context) {
        super(context);
        this.N = uw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f49028r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            uw0 uw0Var = this.N;
            uw0Var.d.f44917n.f35882n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f49027n.h, uw0Var.d.f44917n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), uw0Var.d.f44917n.f35882n0.f48797f);
        }
        super.dispatchDraw(canvas);
    }
}
