package qh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;
public final class u1 extends Drawable {
    public final Paint f46737a;
    public final y5 f46738b;
    public boolean f46739c;
    public int d;

    public u1(int i9) {
        Paint paint = new Paint(1);
        this.f46737a = paint;
        this.f46738b = new y5(new pf.o1(this, 5), 420L, gr.h, 0);
        this.d = 255;
        paint.setColor(i9);
    }

    @Override
    public final void draw(Canvas canvas) {
        float e10 = this.f46738b.e(this.f46739c);
        if (e10 <= 0.0f) {
            return;
        }
        Paint paint = this.f46737a;
        paint.setAlpha((int) (this.d * e10));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e10, 0.0f, AndroidUtilities.dp(3.0f), f6.l1(e10, 805306368));
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(8.0f) * e10;
        float dp2 = AndroidUtilities.dp(0.0f) * e10;
        float dp3 = AndroidUtilities.dp(12.0f) * e10;
        canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (AndroidUtilities.dp(6.0f) * e10) + (bounds.bottom - dp2), dp3, dp3, paint);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.d = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46737a.setColorFilter(colorFilter);
    }
}
