package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ur implements Drawable.Callback {
    public final int f42328a;
    public final Drawable f42329b;

    public ur(int i10, Drawable drawable) {
        this.f42328a = i10;
        this.f42329b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f42328a) {
            case 0:
                ((vr) this.f42329b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.s0 s0Var = ((hy0) this.f42329b).h;
                if (s0Var != null) {
                    s0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f42328a) {
            case 0:
                ((vr) this.f42329b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f42328a) {
            case 0:
                ((vr) this.f42329b).unscheduleSelf(runnable);
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
