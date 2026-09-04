package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h1 extends View {
    public final Paint f45205a;
    public float f45206b;

    public h1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f45205a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f45205a;
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.f45206b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 0.0f, this.f45206b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.f45206b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -7.0f, this.f45206b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.f45206b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 7.0f, this.f45206b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.f45206b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, 0.0f, this.f45206b)), paint);
    }

    public void setProgress(float f7) {
        this.f45206b = f7;
        invalidate();
    }
}
