package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class wq implements Drawable.Callback {
    public final int f53494a;
    public final Drawable f53495b;

    public wq(int i7, Drawable drawable) {
        this.f53494a = i7;
        this.f53495b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f53494a) {
            case 0:
                ((xq) this.f53495b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.u0 u0Var = ((xw0) this.f53495b).h;
                if (u0Var != null) {
                    u0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f53494a) {
            case 0:
                ((xq) this.f53495b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f53494a) {
            case 0:
                ((xq) this.f53495b).unscheduleSelf(runnable);
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
