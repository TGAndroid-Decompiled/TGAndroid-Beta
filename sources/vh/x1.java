package vh;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class x1 extends Drawable implements Drawable.Callback {
    public final Drawable f46274a;
    public final Paint f46275b;
    public final Path f46276c;
    public final RectF d;
    public final Outline e;
    public boolean f46277f;

    public x1(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f46275b = paint;
        this.f46276c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f46277f = true;
        this.f46274a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        if (j6.I.q()) {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), j6.l1(0.3f, -16777216));
        } else {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), j6.l1(0.1f, -16777216));
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: vh.x1.draw(android.graphics.Canvas):void");
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
        return this.f46274a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f46274a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f46274a.setBounds(rect);
        this.f46277f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f46274a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f46274a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46274a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f46274a.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f46274a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
