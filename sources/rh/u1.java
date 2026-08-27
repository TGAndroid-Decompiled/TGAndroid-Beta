package rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;

public final class u1 extends Drawable {

    public final Paint f47494a;

    public final y5 f47495b;

    public boolean f47496c;
    public int d;

    public u1(int i10) {
        Paint paint = new Paint(1);
        this.f47494a = paint;
        this.f47495b = new y5(new qf.b(this, 12), 420L, er.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float fE = this.f47495b.e(this.f47496c);
        if (fE <= 0.0f) {
            return;
        }
        int i10 = (int) (this.d * fE);
        Paint paint = this.f47494a;
        paint.setAlpha(i10);
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * fE, 0.0f, AndroidUtilities.dp(3.0f), g6.l1(fE, 805306368));
        Rect bounds = getBounds();
        float fDp = AndroidUtilities.dp(8.0f) * fE;
        float fDp2 = AndroidUtilities.dp(0.0f) * fE;
        float fDp3 = AndroidUtilities.dp(12.0f) * fE;
        canvas.drawRoundRect(bounds.left + fDp, bounds.top + fDp2, bounds.right - fDp, (AndroidUtilities.dp(6.0f) * fE) + (bounds.bottom - fDp2), fDp3, fDp3, paint);
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
        this.f47494a.setColorFilter(colorFilter);
    }
}
