package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zr implements Drawable.Callback {
    public final int f44911a;
    public final Drawable f44912b;

    public zr(int i10, Drawable drawable) {
        this.f44911a = i10;
        this.f44912b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f44911a) {
            case 0:
                ((as) this.f44912b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((l11) this.f44912b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f44911a) {
            case 0:
                ((as) this.f44912b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f44911a) {
            case 0:
                ((as) this.f44912b).unscheduleSelf(runnable);
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
