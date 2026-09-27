package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class vr implements Drawable.Callback {
    public final int f38693a;
    public final Drawable f38694b;

    public vr(int i10, Drawable drawable) {
        this.f38693a = i10;
        this.f38694b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f38693a) {
            case 0:
                ((wr) this.f38694b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((d11) this.f38694b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f38693a) {
            case 0:
                ((wr) this.f38694b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f38693a) {
            case 0:
                ((wr) this.f38694b).unscheduleSelf(runnable);
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
