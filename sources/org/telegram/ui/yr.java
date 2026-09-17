package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class yr implements Drawable.Callback {
    public final int f43220a;
    public final Drawable f43221b;

    public yr(int i10, Drawable drawable) {
        this.f43220a = i10;
        this.f43221b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f43220a) {
            case 0:
                ((zr) this.f43221b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((m11) this.f43221b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f43220a) {
            case 0:
                ((zr) this.f43221b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f43220a) {
            case 0:
                ((zr) this.f43221b).unscheduleSelf(runnable);
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
