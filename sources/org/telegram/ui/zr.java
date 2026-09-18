package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zr implements Drawable.Callback {
    public final int f40333a;
    public final Drawable f40334b;

    public zr(int i10, Drawable drawable) {
        this.f40333a = i10;
        this.f40334b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f40333a) {
            case 0:
                ((as) this.f40334b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((m11) this.f40334b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f40333a) {
            case 0:
                ((as) this.f40334b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f40333a) {
            case 0:
                ((as) this.f40334b).unscheduleSelf(runnable);
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
