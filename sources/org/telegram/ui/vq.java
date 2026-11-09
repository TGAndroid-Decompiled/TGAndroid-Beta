package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class vq implements Drawable.Callback {
    public final int f50746a;
    public final Drawable f50747b;

    public vq(int i7, Drawable drawable) {
        this.f50746a = i7;
        this.f50747b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f50746a) {
            case 0:
                ((wq) this.f50747b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.t0 t0Var = ((xw0) this.f50747b).h;
                if (t0Var != null) {
                    t0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f50746a) {
            case 0:
                ((wq) this.f50747b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f50746a) {
            case 0:
                ((wq) this.f50747b).unscheduleSelf(runnable);
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
