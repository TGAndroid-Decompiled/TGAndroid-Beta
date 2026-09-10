package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zr implements Drawable.Callback {
    public final int f39430a;
    public final Drawable f39431b;

    public zr(int i10, Drawable drawable) {
        this.f39430a = i10;
        this.f39431b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39430a) {
            case 0:
                ((as) this.f39431b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((q11) this.f39431b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f39430a) {
            case 0:
                ((as) this.f39431b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39430a) {
            case 0:
                ((as) this.f39431b).unscheduleSelf(runnable);
                return;
            default:
                return;
        }
    }

    private final void b(Drawable drawable, Runnable runnable) {
    }

    private final void a(Drawable drawable, Runnable runnable, long j3) {
    }
}
