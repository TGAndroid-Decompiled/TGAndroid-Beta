package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y8 extends TextView {
    public final Paint f44770a;
    public final org.telegram.ui.ActionBar.b6 f44771b;

    public y8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f44771b = b6Var;
        this.f44770a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.8f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, this.f44771b));
        Paint paint = this.f44770a;
        paint.setColor(l1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i9 = 0;
        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
            i9 = Math.max(i9, (int) layout.getLineWidth(i10));
        }
        float f10 = i9 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f10 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
