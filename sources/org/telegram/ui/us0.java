package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class us0 extends ug.n1 {
    public final vs0 O;

    public us0(vs0 vs0Var, Context context) {
        super(context);
        this.O = vs0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f58812r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            vs0 vs0Var = this.O;
            vs0Var.d.f53450n.f43449o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f58811n.h, vs0Var.d.f53450n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), vs0Var.d.f53450n.f43449o0.f58612f);
        }
        super.dispatchDraw(canvas);
    }
}
