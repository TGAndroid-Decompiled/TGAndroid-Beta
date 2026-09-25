package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class sr implements Drawable.Callback {
    public final int f37852a;
    public final Drawable f37853b;

    public sr(int i10, Drawable drawable) {
        this.f37852a = i10;
        this.f37853b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f37852a) {
            case 0:
                ((tr) this.f37853b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((b11) this.f37853b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f37852a) {
            case 0:
                ((tr) this.f37853b).scheduleSelf(runnable, j3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f37852a) {
            case 0:
                ((tr) this.f37853b).unscheduleSelf(runnable);
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
