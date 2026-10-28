package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class rr implements Drawable.Callback {
    public final int f43156a;
    public final Drawable f43157b;

    public rr(int i10, Drawable drawable) {
        this.f43156a = i10;
        this.f43157b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f43156a) {
            case 0:
                ((sr) this.f43157b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((x01) this.f43157b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f43156a) {
            case 0:
                ((sr) this.f43157b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f43156a) {
            case 0:
                ((sr) this.f43157b).unscheduleSelf(runnable);
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
