package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ti1 extends View {
    public final Paint f40789a;
    public final org.telegram.ui.Components.k9 f40790b;
    public org.telegram.ui.Components.f01 f40791c;

    public ti1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f40789a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(this, false);
        this.f40790b = k9Var;
        k9Var.f27796p = AndroidUtilities.dp(100.0f);
        k9Var.f27795o = AndroidUtilities.dp(30.0f);
        k9Var.f27803x = false;
        k9Var.f27799s = AndroidUtilities.dp(24.0f);
        k9Var.j(AndroidUtilities.dp(18.0f));
        k9Var.f27800t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40791c == null) {
            return;
        }
        org.telegram.ui.Components.k9 k9Var = this.f40790b;
        float e7 = k9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f40791c.f25874c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e7) / 2.0f, 0.0f, (getWidth() + e7) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f40789a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        k9Var.i(canvas);
        canvas.translate(k9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f40791c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
