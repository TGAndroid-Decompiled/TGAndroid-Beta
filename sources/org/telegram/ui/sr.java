package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class sr implements Drawable.Callback {
    public final int f38428a;
    public final Drawable f38429b;

    public sr(int i10, Drawable drawable) {
        this.f38428a = i10;
        this.f38429b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f38428a) {
            case 0:
                ((tr) this.f38429b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((s01) this.f38429b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f38428a) {
            case 0:
                ((tr) this.f38429b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f38428a) {
            case 0:
                ((tr) this.f38429b).unscheduleSelf(runnable);
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
