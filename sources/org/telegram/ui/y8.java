package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y8 extends TextView {
    public final Paint f44313a;
    public final org.telegram.ui.ActionBar.d6 f44314b;

    public y8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f44314b = d6Var;
        this.f44313a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.8f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21225z6, this.f44314b));
        Paint paint = this.f44313a;
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
