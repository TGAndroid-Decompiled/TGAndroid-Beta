package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w30 extends TextView {
    public final RectF f42451a;
    public final Paint f42452b;

    public w30(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42451a = new RectF();
        Paint paint = new Paint(1);
        this.f42452b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16711936);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f42451a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f42452b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f42452b;
        paint.setColor(-16711936);
        RectF rectF = this.f42451a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }
}
