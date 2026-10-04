package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class wr implements Drawable.Callback {
    public final int f42634a;
    public final Drawable f42635b;

    public wr(int i10, Drawable drawable) {
        this.f42634a = i10;
        this.f42635b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f42634a) {
            case 0:
                ((xr) this.f42635b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((d11) this.f42635b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f42634a) {
            case 0:
                ((xr) this.f42635b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f42634a) {
            case 0:
                ((xr) this.f42635b).unscheduleSelf(runnable);
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
