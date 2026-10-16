package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y30 extends TextView {
    public final RectF f41720a;
    public final n60 f41721b;

    public y30(n60 n60Var, Context context) {
        super(context);
        this.f41721b = n60Var;
        this.f41720a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f41720a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f41721b.f38183g1);
        super.onDraw(canvas);
    }
}
