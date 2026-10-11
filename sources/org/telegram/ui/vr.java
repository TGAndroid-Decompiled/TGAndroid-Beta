package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class vr implements Drawable.Callback {
    public final int f43122a;
    public final Drawable f43123b;

    public vr(int i10, Drawable drawable) {
        this.f43122a = i10;
        this.f43123b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f43122a) {
            case 0:
                ((wr) this.f43123b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((i11) this.f43123b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f43122a) {
            case 0:
                ((wr) this.f43123b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f43122a) {
            case 0:
                ((wr) this.f43123b).unscheduleSelf(runnable);
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
