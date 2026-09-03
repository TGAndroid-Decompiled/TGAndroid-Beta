package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class tr implements Drawable.Callback {
    public final int f41624a;
    public final Drawable f41625b;

    public tr(int i10, Drawable drawable) {
        this.f41624a = i10;
        this.f41625b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f41624a) {
            case 0:
                ((ur) this.f41625b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((y01) this.f41625b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f41624a) {
            case 0:
                ((ur) this.f41625b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f41624a) {
            case 0:
                ((ur) this.f41625b).unscheduleSelf(runnable);
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
