package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class s10 extends TextView {
    public final RectF f51070a;
    public final c40 f51071b;

    public s10(c40 c40Var, Context context) {
        super(context);
        this.f51071b = c40Var;
        this.f51070a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f51070a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f51071b.f45901b3);
        super.onDraw(canvas);
    }
}
