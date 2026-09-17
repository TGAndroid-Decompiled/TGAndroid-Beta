package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class yr implements Drawable.Callback {
    public final int f43193a;
    public final Drawable f43194b;

    public yr(int i10, Drawable drawable) {
        this.f43193a = i10;
        this.f43194b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f43193a) {
            case 0:
                ((zr) this.f43194b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((m11) this.f43194b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f43193a) {
            case 0:
                ((zr) this.f43194b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f43193a) {
            case 0:
                ((zr) this.f43194b).unscheduleSelf(runnable);
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
