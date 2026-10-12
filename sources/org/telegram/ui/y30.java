package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y30 extends TextView {
    public final RectF f42017a;
    public final n60 f42018b;

    public y30(n60 n60Var, Context context) {
        super(context);
        this.f42018b = n60Var;
        this.f42017a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f42017a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f42018b.f38468g1);
        super.onDraw(canvas);
    }
}
