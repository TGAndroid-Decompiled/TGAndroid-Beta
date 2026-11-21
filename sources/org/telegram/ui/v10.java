package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class v10 extends TextView {
    public final RectF f52695a;
    public final f40 f52696b;

    public v10(f40 f40Var, Context context) {
        super(context);
        this.f52696b = f40Var;
        this.f52695a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f52695a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f52696b.f47472b3);
        super.onDraw(canvas);
    }
}
