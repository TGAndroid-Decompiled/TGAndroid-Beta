package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s30 extends TextView {
    public final RectF f41568a;
    public final g60 f41569b;

    public s30(g60 g60Var, Context context) {
        super(context);
        this.f41569b = g60Var;
        this.f41568a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f41568a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f41569b.f37816g1);
        super.onDraw(canvas);
    }
}
