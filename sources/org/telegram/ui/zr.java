package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zr implements Drawable.Callback {
    public final int f44906a;
    public final Drawable f44907b;

    public zr(int i10, Drawable drawable) {
        this.f44906a = i10;
        this.f44907b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f44906a) {
            case 0:
                ((as) this.f44907b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((l11) this.f44907b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f44906a) {
            case 0:
                ((as) this.f44907b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f44906a) {
            case 0:
                ((as) this.f44907b).unscheduleSelf(runnable);
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
