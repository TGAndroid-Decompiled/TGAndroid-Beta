package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ur implements Drawable.Callback {
    public final int f38905a;
    public final Drawable f38906b;

    public ur(int i10, Drawable drawable) {
        this.f38905a = i10;
        this.f38906b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f38905a) {
            case 0:
                ((vr) this.f38906b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((y01) this.f38906b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f38905a) {
            case 0:
                ((vr) this.f38906b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f38905a) {
            case 0:
                ((vr) this.f38906b).unscheduleSelf(runnable);
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
