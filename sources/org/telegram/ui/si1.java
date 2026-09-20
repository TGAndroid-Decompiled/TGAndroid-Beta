package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class si1 extends View {
    public final Paint f37413a;
    public final org.telegram.ui.Components.i9 f37414b;
    public org.telegram.ui.Components.u01 f37415c;

    public si1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f37413a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(this, false);
        this.f37414b = i9Var;
        i9Var.f24958p = AndroidUtilities.dp(100.0f);
        i9Var.f24957o = AndroidUtilities.dp(30.0f);
        i9Var.f24965x = false;
        i9Var.f24961s = AndroidUtilities.dp(24.0f);
        i9Var.j(AndroidUtilities.dp(18.0f));
        i9Var.f24962t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37415c == null) {
            return;
        }
        org.telegram.ui.Components.i9 i9Var = this.f37414b;
        float e = i9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f37415c.f28493c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e) / 2.0f, 0.0f, (getWidth() + e) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f37413a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        i9Var.i(canvas);
        canvas.translate(i9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f37415c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
