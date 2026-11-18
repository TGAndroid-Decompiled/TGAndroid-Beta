package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class v0 extends View {
    public final Paint f58152a;
    public float f58153b;

    public v0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f58152a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f58152a;
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-5.33f, -4.0f, this.f58153b)), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(5.33f, 0.0f, this.f58153b)), (getWidth() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(5.33f, 3.0f, this.f58153b)), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-5.33f, -7.0f, this.f58153b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(5.33f, 3.0f, this.f58153b)), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(5.33f, 7.0f, this.f58153b)), (getWidth() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-5.33f, -4.0f, this.f58153b)), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-5.33f, 0.0f, this.f58153b)), paint);
    }

    public void setProgress(float f10) {
        this.f58153b = f10;
        invalidate();
    }
}
