package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class r20 extends TextView {
    public final RectF f40959a;
    public final a50 f40960b;

    public r20(a50 a50Var, Context context) {
        super(context);
        this.f40960b = a50Var;
        this.f40959a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f40959a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.f40960b.X2);
        super.onDraw(canvas);
    }
}
