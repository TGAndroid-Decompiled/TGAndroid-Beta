package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class si1 extends View {
    public final Paint f37504a;
    public final org.telegram.ui.Components.h9 f37505b;
    public org.telegram.ui.Components.h01 f37506c;

    public si1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f37504a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(this, false);
        this.f37505b = h9Var;
        h9Var.f24591p = AndroidUtilities.dp(100.0f);
        h9Var.f24590o = AndroidUtilities.dp(30.0f);
        h9Var.f24598x = false;
        h9Var.f24594s = AndroidUtilities.dp(24.0f);
        h9Var.j(AndroidUtilities.dp(18.0f));
        h9Var.f24595t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37506c == null) {
            return;
        }
        org.telegram.ui.Components.h9 h9Var = this.f37505b;
        float e = h9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f37506c.f24439c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e) / 2.0f, 0.0f, (getWidth() + e) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f37504a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        h9Var.i(canvas);
        canvas.translate(h9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f37506c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
