package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f1 extends View {
    public final Paint f45354a;
    public float f45355b;

    public f1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f45354a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f45354a;
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.f45355b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 0.0f, this.f45355b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.f45355b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -7.0f, this.f45355b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.f45355b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 7.0f, this.f45355b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.f45355b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, 0.0f, this.f45355b)), paint);
    }

    public void setProgress(float f7) {
        this.f45355b = f7;
        invalidate();
    }
}
