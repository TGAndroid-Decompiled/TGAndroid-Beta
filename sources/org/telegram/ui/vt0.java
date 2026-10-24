package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class vt0 extends rg.e2 {
    public final Path f42820r0;
    public boolean f42821s0;
    public final org.telegram.ui.Components.d6 f42822t0;
    public final PhotoViewer f42823u0;

    public vt0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33734v2, photoViewer.f33554b0);
        this.f42823u0 = photoViewer;
        this.f42820r0 = new Path();
        this.f42822t0 = new org.telegram.ui.Components.d6(this, 0L, 420L, org.telegram.ui.Components.zr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f42821s0 = z10;
        if (!z11) {
            this.f42822t0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f42820r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45757l0, AndroidUtilities.dp(this.f45760p0), AndroidUtilities.dp(this.f45760p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f42823u0;
        if (this == photoViewer.f33737v5 || this == photoViewer.f33747w5) {
            canvas.translate(-photoViewer.f33728u5.getX(), -photoViewer.f33728u5.getY());
        }
        photoViewer.V0(canvas, this.f45756k0, -13948117, 855638016, false, true, false);
        float e = this.f42822t0.e(this.f42821s0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.o1(e, -1));
        }
        setTextColor(i0.a.f(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f42820r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
