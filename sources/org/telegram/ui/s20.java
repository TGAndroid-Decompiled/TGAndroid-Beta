package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class s20 extends TextView {
    public final RectF f41354a;
    public final b50 f41355b;

    public s20(b50 b50Var, Context context) {
        super(context);
        this.f41355b = b50Var;
        this.f41354a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f41354a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.f41355b.X2);
        super.onDraw(canvas);
    }
}
