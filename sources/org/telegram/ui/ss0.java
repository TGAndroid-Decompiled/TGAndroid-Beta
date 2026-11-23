package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class ss0 extends ug.n1 {
    public final ts0 O;

    public ss0(ts0 ts0Var, Context context) {
        super(context);
        this.O = ts0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f58927r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ts0 ts0Var = this.O;
            ts0Var.d.f52725n.f43565o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f58926n.h, ts0Var.d.f52725n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ts0Var.d.f52725n.f43565o0.f58727f);
        }
        super.dispatchDraw(canvas);
    }
}
