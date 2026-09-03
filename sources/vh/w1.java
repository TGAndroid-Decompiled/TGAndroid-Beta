package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
public final class w1 extends Drawable {
    public final Context f46323a;
    public final Drawable f46324b;
    public Drawable f46325c;
    public int d;
    public int e;
    public Drawable f46326f;
    public boolean f46327g;

    public w1(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = j6.f19881d6;
        this.f46327g = true;
        this.f46323a = context;
        this.f46324b = mutate;
    }

    public final void a(boolean z4) {
        if (this.f46327g == z4) {
            return;
        }
        this.f46327g = z4;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f46324b;
        drawable.setBounds(org.telegram.ui.b.u(2, centerX, drawable), org.telegram.ui.b.f(2, centerY, drawable), org.telegram.ui.b.A(2, centerX, drawable), org.telegram.ui.b.y(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f46327g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = j6.w0(null, this.d, false);
            Drawable drawable2 = this.f46325c;
            Context context = this.f46323a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f46325c = mutate;
                this.e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.e) {
                Drawable drawable3 = this.f46325c;
                this.e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f46326f == null) {
                this.f46326f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f46325c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f46325c.draw(canvas);
            this.f46326f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f46326f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f46324b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f46324b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f46324b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f46324b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46324b.setColorFilter(colorFilter);
    }
}
