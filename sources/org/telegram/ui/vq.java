package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class vq implements Drawable.Callback {
    public final int f52268a;
    public final Drawable f52269b;

    public vq(int i7, Drawable drawable) {
        this.f52268a = i7;
        this.f52269b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f52268a) {
            case 0:
                ((wq) this.f52269b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.t0 t0Var = ((tw0) this.f52269b).h;
                if (t0Var != null) {
                    t0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f52268a) {
            case 0:
                ((wq) this.f52269b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f52268a) {
            case 0:
                ((wq) this.f52269b).unscheduleSelf(runnable);
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
