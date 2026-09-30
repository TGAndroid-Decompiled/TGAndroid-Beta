package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class sr implements Drawable.Callback {
    public final int f37959a;
    public final Drawable f37960b;

    public sr(int i10, Drawable drawable) {
        this.f37959a = i10;
        this.f37960b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f37959a) {
            case 0:
                ((tr) this.f37960b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((b11) this.f37960b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f37959a) {
            case 0:
                ((tr) this.f37960b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f37959a) {
            case 0:
                ((tr) this.f37960b).unscheduleSelf(runnable);
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
