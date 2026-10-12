package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wi1 extends View {
    public final Paint f43544a;
    public final org.telegram.ui.Components.l9 f43545b;
    public org.telegram.ui.Components.r11 f43546c;

    public wi1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f43544a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(this, false);
        this.f43545b = l9Var;
        l9Var.f28107p = AndroidUtilities.dp(100.0f);
        l9Var.f28106o = AndroidUtilities.dp(30.0f);
        l9Var.f28114x = false;
        l9Var.f28110s = AndroidUtilities.dp(24.0f);
        l9Var.j(AndroidUtilities.dp(18.0f));
        l9Var.f28111t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43546c == null) {
            return;
        }
        org.telegram.ui.Components.l9 l9Var = this.f43545b;
        float e7 = l9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f43546c.f29989c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e7) / 2.0f, 0.0f, (getWidth() + e7) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f43544a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        l9Var.i(canvas);
        canvas.translate(l9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f43546c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
