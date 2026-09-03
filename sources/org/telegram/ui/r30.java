package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r30 extends TextView {
    public final RectF f37693a;
    public final e60 f37694b;

    public r30(e60 e60Var, Context context) {
        super(context);
        this.f37694b = e60Var;
        this.f37693a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f37693a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f37694b.f33630d1);
        super.onDraw(canvas);
    }
}
