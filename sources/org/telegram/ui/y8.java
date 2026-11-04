package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
public final class y8 extends TextView {
    public final Paint f52223a;
    public final org.telegram.ui.ActionBar.e6 f52224b;

    public y8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52224b = e6Var;
        this.f52223a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, this.f52224b));
        Paint paint = this.f52223a;
        paint.setColor(r12);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i3 = 0;
        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
            i3 = Math.max(i3, (int) layout.getLineWidth(i10));
        }
        float f10 = i3 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - org.telegram.messenger.g0.L(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f10 + org.telegram.messenger.g0.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
