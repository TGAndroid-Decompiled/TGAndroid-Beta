package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class wr implements Drawable.Callback {
    public final int f43745a;
    public final Drawable f43746b;

    public wr(int i10, Drawable drawable) {
        this.f43745a = i10;
        this.f43746b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f43745a) {
            case 0:
                ((xr) this.f43746b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((j11) this.f43746b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f43745a) {
            case 0:
                ((xr) this.f43746b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f43745a) {
            case 0:
                ((xr) this.f43746b).unscheduleSelf(runnable);
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
