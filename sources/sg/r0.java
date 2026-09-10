package sg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r0 extends View {
    public Paint f41999a;
    public Drawable f42000b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, this.f41999a);
        qg.d1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), qg.d1.d().e());
        float dp = AndroidUtilities.dp(18.0f) / 2.0f;
        Drawable drawable = this.f42000b;
        drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
        drawable.draw(canvas);
    }
}
