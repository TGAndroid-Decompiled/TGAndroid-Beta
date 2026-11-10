package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class wq implements Drawable.Callback {
    public final int f51416a;
    public final Drawable f51417b;

    public wq(int i7, Drawable drawable) {
        this.f51416a = i7;
        this.f51417b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f51416a) {
            case 0:
                ((xq) this.f51417b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.t0 t0Var = ((zw0) this.f51417b).h;
                if (t0Var != null) {
                    t0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f51416a) {
            case 0:
                ((xq) this.f51417b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f51416a) {
            case 0:
                ((xq) this.f51417b).unscheduleSelf(runnable);
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
