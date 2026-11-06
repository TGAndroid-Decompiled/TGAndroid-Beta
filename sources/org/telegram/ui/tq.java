package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class tq implements Drawable.Callback {
    public final int f50121a;
    public final Drawable f50122b;

    public tq(int i7, Drawable drawable) {
        this.f50121a = i7;
        this.f50122b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f50121a) {
            case 0:
                ((uq) this.f50122b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.t0 t0Var = ((uw0) this.f50122b).h;
                if (t0Var != null) {
                    t0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f50121a) {
            case 0:
                ((uq) this.f50122b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f50121a) {
            case 0:
                ((uq) this.f50122b).unscheduleSelf(runnable);
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
