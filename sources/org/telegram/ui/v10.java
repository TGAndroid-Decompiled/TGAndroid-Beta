package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class v10 extends TextView {
    public final RectF f52671a;
    public final f40 f52672b;

    public v10(f40 f40Var, Context context) {
        super(context);
        this.f52672b = f40Var;
        this.f52671a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f52671a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f52672b.f47448b3);
        super.onDraw(canvas);
    }
}
