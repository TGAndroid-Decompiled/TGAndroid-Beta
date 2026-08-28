package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f6;
public final class v1 extends Drawable {
    public final Context f46751a;
    public final Drawable f46752b;
    public Drawable f46753c;
    public int d;
    public int f46754e;
    public Drawable f46755f;
    public boolean f46756g;

    public v1(Context context, int i9) {
        Drawable mutate = context.getResources().getDrawable(i9).mutate();
        this.d = f6.f23001d6;
        this.f46756g = true;
        this.f46751a = context;
        this.f46752b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f46756g == z10) {
            return;
        }
        this.f46756g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f46752b;
        drawable.setBounds(ll.x(2, centerX, drawable), ll.e(2, centerY, drawable), ll.B(2, centerX, drawable), ll.z(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f46756g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = f6.w0(null, this.d, false);
            Drawable drawable2 = this.f46753c;
            Context context = this.f46751a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f46753c = mutate;
                this.f46754e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f46754e) {
                Drawable drawable3 = this.f46753c;
                this.f46754e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f46755f == null) {
                this.f46755f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f46753c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f46753c.draw(canvas);
            this.f46755f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f46755f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f46752b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f46752b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f46752b.getOpacity();
    }

    @Override
    public final void setAlpha(int i9) {
        this.f46752b.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46752b.setColorFilter(colorFilter);
    }
}
