package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class ss0 extends ug.k1 {
    public final ts0 N;

    public ss0(ts0 ts0Var, Context context) {
        super(context);
        this.N = ts0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f56687r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ts0 ts0Var = this.N;
            ts0Var.d.f50415n.f41623n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f56686n.h, ts0Var.d.f50415n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ts0Var.d.f50415n.f41623n0.f56869f);
        }
        super.dispatchDraw(canvas);
    }
}
