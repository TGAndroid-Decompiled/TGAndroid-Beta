package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w30 extends TextView {
    public final RectF f38562a;
    public final k60 f38563b;

    public w30(k60 k60Var, Context context) {
        super(context);
        this.f38563b = k60Var;
        this.f38562a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f38562a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f38563b.f35038g1);
        super.onDraw(canvas);
    }
}
