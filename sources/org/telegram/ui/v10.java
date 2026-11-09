package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class v10 extends TextView {
    public final RectF f50542a;
    public final e40 f50543b;

    public v10(e40 e40Var, Context context) {
        super(context);
        this.f50543b = e40Var;
        this.f50542a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f50542a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f50543b.X2);
        super.onDraw(canvas);
    }
}
