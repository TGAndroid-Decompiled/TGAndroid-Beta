package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y30 extends TextView {
    public final RectF f44725a;
    public final Paint f44726b;

    public y30(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f44725a = new RectF();
        Paint paint = new Paint(1);
        this.f44726b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16711936);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f44725a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f44726b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f44726b;
        paint.setColor(-16711936);
        RectF rectF = this.f44725a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }
}
