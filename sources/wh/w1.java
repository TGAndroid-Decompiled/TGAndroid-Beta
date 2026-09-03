package wh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
public final class w1 extends Drawable {
    public final Paint f50164a;
    public final org.telegram.ui.Components.z5 f50165b;
    public boolean f50166c;
    public int d;

    public w1(int i10) {
        Paint paint = new Paint(1);
        this.f50164a = paint;
        this.f50165b = new org.telegram.ui.Components.z5(new v1(this, 0), 420L, pr.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float e6 = this.f50165b.e(this.f50166c);
        if (e6 <= 0.0f) {
            return;
        }
        Paint paint = this.f50164a;
        paint.setAlpha((int) (this.d * e6));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e6, 0.0f, AndroidUtilities.dp(3.0f), k6.l1(e6, 805306368));
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(8.0f) * e6;
        float dp2 = AndroidUtilities.dp(0.0f) * e6;
        float dp3 = AndroidUtilities.dp(12.0f) * e6;
        canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (AndroidUtilities.dp(6.0f) * e6) + (bounds.bottom - dp2), dp3, dp3, paint);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50164a.setColorFilter(colorFilter);
    }
}
