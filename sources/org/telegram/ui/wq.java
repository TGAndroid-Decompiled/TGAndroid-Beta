package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class wq implements Drawable.Callback {
    public final int f53434a;
    public final Drawable f53435b;

    public wq(int i7, Drawable drawable) {
        this.f53434a = i7;
        this.f53435b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f53434a) {
            case 0:
                ((xq) this.f53435b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((xw0) this.f53435b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f53434a) {
            case 0:
                ((xq) this.f53435b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f53434a) {
            case 0:
                ((xq) this.f53435b).unscheduleSelf(runnable);
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
