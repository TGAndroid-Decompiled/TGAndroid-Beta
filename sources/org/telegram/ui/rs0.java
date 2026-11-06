package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class rs0 extends ug.k1 {
    public final ss0 N;

    public rs0(ss0 ss0Var, Context context) {
        super(context);
        this.N = ss0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f56570r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ss0 ss0Var = this.N;
            ss0Var.d.f50109n.f41595n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f56569n.h, ss0Var.d.f50109n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ss0Var.d.f50109n.f41595n0.f56752f);
        }
        super.dispatchDraw(canvas);
    }
}
