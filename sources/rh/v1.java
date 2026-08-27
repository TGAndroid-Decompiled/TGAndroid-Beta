package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.g6;

public final class v1 extends Drawable {

    public final Context f47513a;

    public final Drawable f47514b;

    public Drawable f47515c;
    public int d;

    public int f47516e;

    public Drawable f47517f;

    public boolean f47518g;

    public v1(Context context, int i10) {
        Drawable drawableMutate = context.getResources().getDrawable(i10).mutate();
        this.d = g6.f23053d6;
        this.f47518g = true;
        this.f47513a = context;
        this.f47514b = drawableMutate;
    }

    public final void a(boolean z10) {
        if (this.f47518g == z10) {
            return;
        }
        this.f47518g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iCenterX = bounds.centerX();
        int iCenterY = bounds.centerY();
        Drawable drawable = this.f47514b;
        drawable.setBounds(rl.v(2, iCenterX, drawable), rl.e(2, iCenterY, drawable), rl.A(2, iCenterX, drawable), rl.y(2, iCenterY, drawable));
        drawable.draw(canvas);
        if (this.f47518g) {
            int iDp = AndroidUtilities.dp(9.0f) + iCenterX;
            int iDp2 = AndroidUtilities.dp(9.0f) + iCenterY;
            int iW0 = g6.w0(null, this.d, false);
            Drawable drawable2 = this.f47515c;
            Context context = this.f47513a;
            if (drawable2 == null) {
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f47515c = drawableMutate;
                this.f47516e = iW0;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.SRC_IN));
            }
            if (iW0 != this.f47516e) {
                Drawable drawable3 = this.f47515c;
                this.f47516e = iW0;
                drawable3.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.SRC_IN));
            }
            if (this.f47517f == null) {
                this.f47517f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f47515c.setBounds(iDp - AndroidUtilities.dp(9.0f), iDp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + iDp, AndroidUtilities.dp(9.0f) + iDp2);
            this.f47515c.draw(canvas);
            this.f47517f.setBounds(iDp - AndroidUtilities.dp(9.0f), iDp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + iDp, AndroidUtilities.dp(9.0f) + iDp2);
            this.f47517f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f47514b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f47514b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f47514b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f47514b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f47514b.setColorFilter(colorFilter);
    }
}
