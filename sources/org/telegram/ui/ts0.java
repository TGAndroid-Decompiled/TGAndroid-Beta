package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class ts0 extends ug.n1 {
    public final us0 O;

    public ts0(us0 us0Var, Context context) {
        super(context);
        this.O = us0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f58847r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            us0 us0Var = this.O;
            us0Var.d.f52890n.f43484o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f58846n.h, us0Var.d.f52890n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), us0Var.d.f52890n.f43484o0.f58647f);
        }
        super.dispatchDraw(canvas);
    }
}
