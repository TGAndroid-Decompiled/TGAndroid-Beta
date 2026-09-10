package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.t01;
public final class b0 extends Drawable {
    public final float f48291a = 0.75f;
    public final Drawable f48292b;
    public final t01 f48293c;

    public b0(Context context, int i10) {
        this.f48292b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        t01 t01Var = new t01(hc.b.j(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f48293c = t01Var;
        t01Var.f27245a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f48292b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f48293c.c(bounds.centerX() - (this.f48293c.f27247c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f48292b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f48292b.getIntrinsicHeight() * this.f48291a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f48292b.getIntrinsicWidth() * this.f48291a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f48292b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f48292b.setColorFilter(colorFilter);
    }
}
