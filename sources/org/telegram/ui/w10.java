package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class w10 extends TextView {
    public final RectF f50874a;
    public final f40 f50875b;

    public w10(f40 f40Var, Context context) {
        super(context);
        this.f50875b = f40Var;
        this.f50874a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f50874a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f50875b.f45505a3);
        super.onDraw(canvas);
    }
}
