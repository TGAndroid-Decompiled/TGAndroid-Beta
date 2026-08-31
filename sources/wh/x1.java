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
    public final Context f50147a;
    public final Drawable f50148b;
    public Drawable f50149c;
    public int d;
    public int f50150e;
    public Drawable f50151f;
    public boolean f50152g;

    public x1(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = k6.f21659d6;
        this.f50152g = true;
        this.f50147a = context;
        this.f50148b = mutate;
    }

    public final void a(boolean z4) {
        if (this.f50152g == z4) {
            return;
        }
        this.f50152g = z4;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f50148b;
        drawable.setBounds(org.telegram.ui.b.u(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f50152g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = k6.w0(null, this.d, false);
            Drawable drawable2 = this.f50149c;
            Context context = this.f50147a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f50149c = mutate;
                this.f50150e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f50150e) {
                Drawable drawable3 = this.f50149c;
                this.f50150e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f50151f == null) {
                this.f50151f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f50149c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f50149c.draw(canvas);
            this.f50151f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f50151f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f50148b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f50148b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f50148b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f50148b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50148b.setColorFilter(colorFilter);
    }
}
