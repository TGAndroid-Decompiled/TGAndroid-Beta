package rg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class n0 extends org.telegram.ui.Cells.q {
    public x1 f46226e;
    public Paint f46227f;
    public float h;

    @Override
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        x1 x1Var = this.f46226e;
        x1Var.f46367c.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), getMeasuredWidth() - AndroidUtilities.dp(5.0f), getMeasuredHeight() - AndroidUtilities.dp(5.0f));
        float f7 = -dp;
        x1Var.f46365a.set(f7, f7, getWidth() + dp, getHeight() + dp);
        canvas.save();
        float f10 = 1.0f - this.h;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        x1Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f46227f);
        super.draw(canvas);
    }
}
