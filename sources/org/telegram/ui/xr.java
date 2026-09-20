package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class xr implements Drawable.Callback {
    public final int f39718a;
    public final Drawable f39719b;

    public xr(int i10, Drawable drawable) {
        this.f39718a = i10;
        this.f39719b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39718a) {
            case 0:
                ((yr) this.f39719b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((k11) this.f39719b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f39718a) {
            case 0:
                ((yr) this.f39719b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39718a) {
            case 0:
                ((yr) this.f39719b).unscheduleSelf(runnable);
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
