package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m1 extends View {
    public final Paint f41407a;
    public float f41408b;

    public m1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f41407a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f41407a;
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-6.7f, -7.0f, this.f41408b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(0.71f, 0.0f, this.f41408b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-2.45f, 7.0f, this.f41408b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(4.79f, 0.0f, this.f41408b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-2.45f, 0.0f, this.f41408b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(4.79f, 7.0f, this.f41408b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(6.59f, 0.0f, this.f41408b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-4.27f, -7.0f, this.f41408b)), paint);
    }

    public void setProgress(float f7) {
        this.f41408b = f7;
        invalidate();
    }
}
