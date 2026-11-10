package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class vs0 extends ug.k1 {
    public final ws0 N;

    public vs0(ws0 ws0Var, Context context) {
        super(context);
        this.N = ws0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f56698r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ws0 ws0Var = this.N;
            ws0Var.d.f51812n.f41621n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f56697n.h, ws0Var.d.f51812n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ws0Var.d.f51812n.f41621n0.f56877f);
        }
        super.dispatchDraw(canvas);
    }
}
