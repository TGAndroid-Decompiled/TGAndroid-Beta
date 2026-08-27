package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class z8 extends TextView {

    public final Paint f45069a;

    public final org.telegram.ui.ActionBar.c6 f45070b;

    public z8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f45070b = c6Var;
        this.f45069a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, this.f45070b));
        Paint paint = this.f45069a;
        paint.setColor(iL1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int iMax = 0;
        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
            iMax = Math.max(iMax, (int) layout.getLineWidth(i10));
        }
        float f10 = iMax / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f10 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
