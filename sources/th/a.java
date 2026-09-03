package th;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
public final class a extends Drawable {
    public int f48133b;
    public int f48134c = 255;
    public final Drawable f48132a = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.settings_arrow).mutate();

    @Override
    public final void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        int w02 = k6.w0(null, k6.G6, false);
        int w03 = k6.w0(null, k6.f21661d6, false);
        int i10 = this.f48133b;
        Drawable drawable = this.f48132a;
        if (i10 != w03) {
            this.f48133b = w03;
            drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(7.6666665f), k6.l0(i0.a.k(w03, this.f48134c)));
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(6.6666665f), k6.l0(i0.a.k(w02, this.f48134c)));
        lf.r.d(drawable, exactCenterX, exactCenterY, 17);
        canvas.translate(0.0f, AndroidUtilities.dp(0.66f));
        canvas.save();
        canvas.rotate(90.0f, exactCenterX, exactCenterY);
        lf.r.b(canvas, drawable, 0.8f);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f48134c;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f48134c = i10;
        this.f48132a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
