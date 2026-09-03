package wh;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class y1 extends Drawable implements Drawable.Callback {
    public final Drawable f50202a;
    public final Paint f50203b;
    public final Path f50204c;
    public final RectF d;
    public final Outline f50205e;
    public boolean f50206f;

    public y1(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f50203b = paint;
        this.f50204c = new Path();
        this.d = new RectF();
        this.f50205e = new Outline();
        this.f50206f = true;
        this.f50202a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        if (k6.I.q()) {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), k6.l1(0.3f, -16777216));
        } else {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), k6.l1(0.1f, -16777216));
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: wh.y1.draw(android.graphics.Canvas):void");
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
        return this.f50202a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f50202a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f50202a.setBounds(rect);
        this.f50206f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f50202a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f50202a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50202a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f50202a.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f50202a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
