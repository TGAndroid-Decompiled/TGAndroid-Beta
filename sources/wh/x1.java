package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
public final class x1 extends Drawable {
    public final Context f50148a;
    public final Drawable f50149b;
    public Drawable f50150c;
    public int d;
    public int f50151e;
    public Drawable f50152f;
    public boolean f50153g;

    public x1(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = k6.f21659d6;
        this.f50153g = true;
        this.f50148a = context;
        this.f50149b = mutate;
    }

    public final void a(boolean z4) {
        if (this.f50153g == z4) {
            return;
        }
        this.f50153g = z4;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f50149b;
        drawable.setBounds(org.telegram.ui.b.u(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f50153g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = k6.w0(null, this.d, false);
            Drawable drawable2 = this.f50150c;
            Context context = this.f50148a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f50150c = mutate;
                this.f50151e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f50151e) {
                Drawable drawable3 = this.f50150c;
                this.f50151e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f50152f == null) {
                this.f50152f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f50150c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f50150c.draw(canvas);
            this.f50152f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f50152f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f50149b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f50149b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f50149b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f50149b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50149b.setColorFilter(colorFilter);
    }
}
