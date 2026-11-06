package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class t10 extends TextView {
    public final RectF f49862a;
    public final c40 f49863b;

    public t10(c40 c40Var, Context context) {
        super(context);
        this.f49863b = c40Var;
        this.f49862a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f49862a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f49863b.X2);
        super.onDraw(canvas);
    }
}
