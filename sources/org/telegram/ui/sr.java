package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class sr implements Drawable.Callback {
    public final int f37850a;
    public final Drawable f37851b;

    public sr(int i10, Drawable drawable) {
        this.f37850a = i10;
        this.f37851b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f37850a) {
            case 0:
                ((tr) this.f37851b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((b11) this.f37851b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f37850a) {
            case 0:
                ((tr) this.f37851b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f37850a) {
            case 0:
                ((tr) this.f37851b).unscheduleSelf(runnable);
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
