package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class xr implements Drawable.Callback {
    public final int f39666a;
    public final Drawable f39667b;

    public xr(int i10, Drawable drawable) {
        this.f39666a = i10;
        this.f39667b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39666a) {
            case 0:
                ((yr) this.f39667b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((k11) this.f39667b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f39666a) {
            case 0:
                ((yr) this.f39667b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39666a) {
            case 0:
                ((yr) this.f39667b).unscheduleSelf(runnable);
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
