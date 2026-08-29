package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x8 extends TextView {
    public final Paint f44513a;
    public final org.telegram.ui.ActionBar.c6 f44514b;

    public x8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f44514b = c6Var;
        this.f44513a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, this.f44514b));
        Paint paint = this.f44513a;
        paint.setColor(l1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i10 = 0;
        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
            i10 = Math.max(i10, (int) layout.getLineWidth(i11));
        }
        float f9 = i10 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f9) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f9 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
