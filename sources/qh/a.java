package qh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
public final class a extends Drawable {
    public int f46678b;
    public int f46679c = 255;
    public final Drawable f46677a = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.settings_arrow).mutate();

    @Override
    public final void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        int w02 = g6.w0(null, g6.G6, false);
        int w03 = g6.w0(null, g6.f23062d6, false);
        int i10 = this.f46678b;
        Drawable drawable = this.f46677a;
        if (i10 != w03) {
            this.f46678b = w03;
            drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(7.6666665f), g6.l0(i0.a.k(w03, this.f46679c)));
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(6.6666665f), g6.l0(i0.a.k(w02, this.f46679c)));
        jf.r.d(drawable, exactCenterX, exactCenterY, 17);
        canvas.translate(0.0f, AndroidUtilities.dp(0.66f));
        canvas.save();
        canvas.rotate(90.0f, exactCenterX, exactCenterY);
        jf.r.b(canvas, drawable, 0.8f);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f46679c;
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
        this.f46679c = i10;
        this.f46677a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
