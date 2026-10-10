package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends TextView {
    public final Paint f44553a;
    public final org.telegram.ui.ActionBar.e6 f44554b;

    public z8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f44554b = e6Var;
        this.f44553a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.8f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, this.f44554b));
        Paint paint = this.f44553a;
        paint.setColor(m12);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i10 = 0;
        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
            i10 = Math.max(i10, (int) layout.getLineWidth(i11));
        }
        float f7 = i10 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f7) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f7 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
