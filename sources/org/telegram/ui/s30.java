package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s30 extends TextView {
    public final RectF f37288a;
    public final g60 f37289b;

    public s30(g60 g60Var, Context context) {
        super(context);
        this.f37289b = g60Var;
        this.f37288a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f37288a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f37289b.f33752g1);
        super.onDraw(canvas);
    }
}
