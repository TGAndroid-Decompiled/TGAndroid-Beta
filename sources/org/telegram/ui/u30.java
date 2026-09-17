package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u30 extends TextView {
    public final RectF f40912a;
    public final j60 f40913b;

    public u30(j60 j60Var, Context context) {
        super(context);
        this.f40913b = j60Var;
        this.f40912a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f40912a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f40913b.f37541g1);
        super.onDraw(canvas);
    }
}
