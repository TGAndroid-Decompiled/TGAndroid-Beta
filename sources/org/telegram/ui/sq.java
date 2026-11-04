package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class sq implements Drawable.Callback {
    public final int f49590a;
    public final Drawable f49591b;

    public sq(int i3, Drawable drawable) {
        this.f49590a = i3;
        this.f49591b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f49590a) {
            case 0:
                ((tq) this.f49591b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.t0 t0Var = ((mw0) this.f49591b).h;
                if (t0Var != null) {
                    t0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f49590a) {
            case 0:
                ((tq) this.f49591b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f49590a) {
            case 0:
                ((tq) this.f49591b).unscheduleSelf(runnable);
                return;
            default:
                return;
        }
    }

    private final void b(Drawable drawable, Runnable runnable) {
    }

    private final void a(Drawable drawable, Runnable runnable, long j10) {
    }
}
