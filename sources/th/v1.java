package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
public final class v1 extends Drawable {
    public final Context f48811a;
    public final Drawable f48812b;
    public Drawable f48813c;
    public int d;
    public int f48814e;
    public Drawable f48815f;
    public boolean f48816g;

    public v1(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = g6.f23062d6;
        this.f48816g = true;
        this.f48811a = context;
        this.f48812b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f48816g == z10) {
            return;
        }
        this.f48816g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f48812b;
        drawable.setBounds(org.telegram.ui.b.v(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f48816g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = g6.w0(null, this.d, false);
            Drawable drawable2 = this.f48813c;
            Context context = this.f48811a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f48813c = mutate;
                this.f48814e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f48814e) {
                Drawable drawable3 = this.f48813c;
                this.f48814e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f48815f == null) {
                this.f48815f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f48813c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f48813c.draw(canvas);
            this.f48815f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f48815f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f48812b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f48812b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f48812b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f48812b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f48812b.setColorFilter(colorFilter);
    }
}
