package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class wq implements Drawable.Callback {
    public final int f53724a;
    public final Drawable f53725b;

    public wq(int i7, Drawable drawable) {
        this.f53724a = i7;
        this.f53725b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f53724a) {
            case 0:
                ((xq) this.f53725b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((vw0) this.f53725b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f53724a) {
            case 0:
                ((xq) this.f53725b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f53724a) {
            case 0:
                ((xq) this.f53725b).unscheduleSelf(runnable);
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
