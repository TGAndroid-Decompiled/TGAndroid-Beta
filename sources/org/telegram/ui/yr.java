package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class yr implements Drawable.Callback {
    public final int f43219a;
    public final Drawable f43220b;

    public yr(int i10, Drawable drawable) {
        this.f43219a = i10;
        this.f43220b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f43219a) {
            case 0:
                ((zr) this.f43220b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((m11) this.f43220b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f43219a) {
            case 0:
                ((zr) this.f43220b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f43219a) {
            case 0:
                ((zr) this.f43220b).unscheduleSelf(runnable);
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
