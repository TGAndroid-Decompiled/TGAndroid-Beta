package th;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class w1 extends Drawable implements Drawable.Callback {
    public final Drawable f48829a;
    public final Paint f48830b;
    public final Path f48831c;
    public final RectF d;
    public final Outline f48832e;
    public boolean f48833f;

    public w1(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f48830b = paint;
        this.f48831c = new Path();
        this.d = new RectF();
        this.f48832e = new Outline();
        this.f48833f = true;
        this.f48829a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        if (g6.I.q()) {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), g6.l1(0.3f, -16777216));
        } else {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), g6.l1(0.1f, -16777216));
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: th.w1.draw(android.graphics.Canvas):void");
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
        return this.f48829a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f48829a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f48829a.setBounds(rect);
        this.f48833f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f48829a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f48829a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f48829a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f9, float f10) {
        this.f48829a.setHotspot(f9, f10);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f48829a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
