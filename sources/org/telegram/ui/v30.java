package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v30 extends TextView {
    public final RectF f37404a;
    public final j60 f37405b;

    public v30(j60 j60Var, Context context) {
        super(context);
        this.f37405b = j60Var;
        this.f37404a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f37404a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f37405b.f33962g1);
        super.onDraw(canvas);
    }
}
