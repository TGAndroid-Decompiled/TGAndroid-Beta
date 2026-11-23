package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class u10 extends TextView {
    public final RectF f52518a;
    public final e40 f52519b;

    public u10(e40 e40Var, Context context) {
        super(context);
        this.f52519b = e40Var;
        this.f52518a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f52518a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f52519b.f47326b3);
        super.onDraw(canvas);
    }
}
