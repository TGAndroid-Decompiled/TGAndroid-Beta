package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w30 extends TextView {
    public final RectF f38567a;
    public final k60 f38568b;

    public w30(k60 k60Var, Context context) {
        super(context);
        this.f38568b = k60Var;
        this.f38567a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f38567a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f38568b.f35043g1);
        super.onDraw(canvas);
    }
}
