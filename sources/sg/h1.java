package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h1 extends View {
    public final Paint f48225a;
    public float f48226b;

    public h1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f48225a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f48225a;
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.f48226b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 0.0f, this.f48226b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.f48226b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -7.0f, this.f48226b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 3.0f, this.f48226b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(5.33f, 7.0f, this.f48226b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, -4.0f, this.f48226b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-5.33f, 0.0f, this.f48226b)), paint);
    }

    public void setProgress(float f7) {
        this.f48226b = f7;
        invalidate();
    }
}
