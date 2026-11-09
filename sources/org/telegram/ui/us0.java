package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class us0 extends ug.k1 {
    public final vs0 N;

    public us0(vs0 vs0Var, Context context) {
        super(context);
        this.N = vs0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f56699r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            vs0 vs0Var = this.N;
            vs0Var.d.f51471n.f41630n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f56698n.h, vs0Var.d.f51471n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), vs0Var.d.f51471n.f41630n0.f56881f);
        }
        super.dispatchDraw(canvas);
    }
}
