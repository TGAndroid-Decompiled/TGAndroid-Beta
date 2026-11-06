package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class z0 extends View {
    public final Paint f55897a;
    public float f55898b;

    public z0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f55897a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f55897a;
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-6.7f, -7.0f, this.f55898b)), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(0.71f, 0.0f, this.f55898b)), (getWidth() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.45f, 7.0f, this.f55898b)), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(4.79f, 0.0f, this.f55898b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.45f, 0.0f, this.f55898b)), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(4.79f, 7.0f, this.f55898b)), (getWidth() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(6.59f, 0.0f, this.f55898b)), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-4.27f, -7.0f, this.f55898b)), paint);
    }

    public void setProgress(float f10) {
        this.f55898b = f10;
        invalidate();
    }
}
