package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u30 extends TextView {
    public final RectF f41034a;
    public final h60 f41035b;

    public u30(h60 h60Var, Context context) {
        super(context);
        this.f41035b = h60Var;
        this.f41034a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f41034a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f41035b.f36900g1);
        super.onDraw(canvas);
    }
}
