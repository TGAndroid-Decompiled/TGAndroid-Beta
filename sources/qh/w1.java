package qh;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class w1 extends Drawable implements Drawable.Callback {
    public final Drawable f46768a;
    public final Paint f46769b;
    public final Path f46770c;
    public final RectF d;
    public final Outline f46771e;
    public boolean f46772f;

    public w1(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f46769b = paint;
        this.f46770c = new Path();
        this.d = new RectF();
        this.f46771e = new Outline();
        this.f46772f = true;
        this.f46768a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        if (f6.I.q()) {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), f6.l1(0.3f, -16777216));
        } else {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), f6.l1(0.1f, -16777216));
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: qh.w1.draw(android.graphics.Canvas):void");
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
        return this.f46768a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f46768a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f46768a.setBounds(rect);
        this.f46772f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f46768a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i9) {
        this.f46768a.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46768a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f46768a.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i9, int i10, int i11, int i12) {
        this.f46768a.setHotspotBounds(i9, i10, i11, i12);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
