package rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

public final class w1 extends Drawable implements Drawable.Callback {

    public final Drawable f47531a;

    public final Paint f47532b;

    public final Path f47533c;
    public final RectF d;

    public final Outline f47534e;

    public boolean f47535f;

    public w1(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f47532b = paint;
        this.f47533c = new Path();
        this.d = new RectF();
        this.f47534e = new Outline();
        this.f47535f = true;
        this.f47531a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        if (g6.I.q()) {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), g6.l1(0.3f, -16777216));
        } else {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), g6.l1(0.1f, -16777216));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float radius;
        boolean z10 = this.f47535f;
        Drawable drawable = this.f47531a;
        Path path = this.f47533c;
        if (z10) {
            Outline outline = this.f47534e;
            path.reset();
            Rect bounds = getBounds();
            RectF rectF = this.d;
            rectF.set(bounds);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    drawable.getOutline(outline);
                    radius = outline.getRadius();
                } catch (Throwable unused) {
                    radius = -1.0f;
                }
            } else {
                radius = -1.0f;
            }
            if (radius > 0.0f) {
                path.addRoundRect(rectF, radius, radius, Path.Direction.CW);
            } else {
                path.addRect(rectF, Path.Direction.CW);
            }
            this.f47535f = false;
        }
        canvas.drawPath(path, this.f47532b);
        drawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f47531a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f47531a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f47531a.setBounds(rect);
        this.f47535f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f47531a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f47531a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f47531a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f47531a.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f47531a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
