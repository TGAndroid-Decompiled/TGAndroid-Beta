package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r30 extends TextView {
    public final RectF f36677a;
    public final f60 f36678b;

    public r30(f60 f60Var, Context context) {
        super(context);
        this.f36678b = f60Var;
        this.f36677a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f36677a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f36678b.f33125g1);
        super.onDraw(canvas);
    }
}
