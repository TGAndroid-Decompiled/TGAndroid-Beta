package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u30 extends TextView {
    public final RectF f37946a;
    public final i60 f37947b;

    public u30(i60 i60Var, Context context) {
        super(context);
        this.f37947b = i60Var;
        this.f37946a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f37946a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f37947b.f34386g1);
        super.onDraw(canvas);
    }
}
