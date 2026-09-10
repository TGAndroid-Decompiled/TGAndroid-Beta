package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j1 extends View {
    public final Paint f40066a;
    public float f40067b;

    public j1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40066a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f40066a;
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-6.7f, -7.0f, this.f40067b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(0.71f, 0.0f, this.f40067b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-2.45f, 7.0f, this.f40067b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(4.79f, 0.0f, this.f40067b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-2.45f, 0.0f, this.f40067b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(4.79f, 7.0f, this.f40067b)), (getWidth() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(6.59f, 0.0f, this.f40067b)), (getHeight() / 2.0f) + AndroidUtilities.dp(AndroidUtilities.lerp(-4.27f, -7.0f, this.f40067b)), paint);
    }

    public void setProgress(float f7) {
        this.f40067b = f7;
        invalidate();
    }
}
