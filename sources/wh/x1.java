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
    public final Context f50184a;
    public final Drawable f50185b;
    public Drawable f50186c;
    public int d;
    public int f50187e;
    public Drawable f50188f;
    public boolean f50189g;

    public x1(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = k6.f21661d6;
        this.f50189g = true;
        this.f50184a = context;
        this.f50185b = mutate;
    }

    public final void a(boolean z4) {
        if (this.f50189g == z4) {
            return;
        }
        this.f50189g = z4;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f50185b;
        drawable.setBounds(org.telegram.ui.b.u(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f50189g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = k6.w0(null, this.d, false);
            Drawable drawable2 = this.f50186c;
            Context context = this.f50184a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f50186c = mutate;
                this.f50187e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f50187e) {
                Drawable drawable3 = this.f50186c;
                this.f50187e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f50188f == null) {
                this.f50188f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f50186c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f50186c.draw(canvas);
            this.f50188f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f50188f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f50185b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f50185b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f50185b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f50185b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50185b.setColorFilter(colorFilter);
    }
}
