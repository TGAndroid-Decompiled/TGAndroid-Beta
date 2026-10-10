package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vi1 extends View {
    public final Paint f42920a;
    public final org.telegram.ui.Components.l9 f42921b;
    public org.telegram.ui.Components.m11 f42922c;

    public vi1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f42920a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(this, false);
        this.f42921b = l9Var;
        l9Var.f28262p = AndroidUtilities.dp(100.0f);
        l9Var.f28261o = AndroidUtilities.dp(30.0f);
        l9Var.f28269x = false;
        l9Var.f28265s = AndroidUtilities.dp(24.0f);
        l9Var.j(AndroidUtilities.dp(18.0f));
        l9Var.f28266t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42922c == null) {
            return;
        }
        org.telegram.ui.Components.l9 l9Var = this.f42921b;
        float e7 = l9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f42922c.f28602c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e7) / 2.0f, 0.0f, (getWidth() + e7) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f42920a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        l9Var.i(canvas);
        canvas.translate(l9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f42922c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
