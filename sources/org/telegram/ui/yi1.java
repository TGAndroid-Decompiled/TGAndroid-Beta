package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yi1 extends View {
    public final Paint f39012a;
    public final org.telegram.ui.Components.i9 f39013b;
    public org.telegram.ui.Components.t01 f39014c;

    public yi1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f39012a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(this, false);
        this.f39013b = i9Var;
        i9Var.f23947p = AndroidUtilities.dp(100.0f);
        i9Var.f23946o = AndroidUtilities.dp(30.0f);
        i9Var.f23954x = false;
        i9Var.f23950s = AndroidUtilities.dp(24.0f);
        i9Var.j(AndroidUtilities.dp(18.0f));
        i9Var.f23951t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39014c == null) {
            return;
        }
        org.telegram.ui.Components.i9 i9Var = this.f39013b;
        float e = i9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f39014c.f27247c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e) / 2.0f, 0.0f, (getWidth() + e) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f39012a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        i9Var.i(canvas);
        canvas.translate(i9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f39014c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
