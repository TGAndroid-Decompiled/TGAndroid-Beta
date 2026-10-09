package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s30 extends TextView {
    public final RectF f41566a;
    public final g60 f41567b;

    public s30(g60 g60Var, Context context) {
        super(context);
        this.f41567b = g60Var;
        this.f41566a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f41566a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f41567b.f37814g1);
        super.onDraw(canvas);
    }
}
