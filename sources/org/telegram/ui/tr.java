package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class tr implements Drawable.Callback {
    public final int f37744a;
    public final Drawable f37745b;

    public tr(int i10, Drawable drawable) {
        this.f37744a = i10;
        this.f37745b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f37744a) {
            case 0:
                ((ur) this.f37745b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((d11) this.f37745b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f37744a) {
            case 0:
                ((ur) this.f37745b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f37744a) {
            case 0:
                ((ur) this.f37745b).unscheduleSelf(runnable);
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
