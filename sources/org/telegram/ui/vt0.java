package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class vt0 extends rg.c2 {
    public final Path f42298o0;
    public boolean f42299p0;
    public final org.telegram.ui.Components.f6 f42300q0;
    public final PhotoViewer f42301r0;

    public vt0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33425v2, photoViewer.f33245b0);
        this.f42301r0 = photoViewer;
        this.f42298o0 = new Path();
        this.f42300q0 = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f42299p0 = z10;
        if (!z11) {
            this.f42300q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f42298o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45356i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f42301r0;
        if (this == photoViewer.f33428v5 || this == photoViewer.f33438w5) {
            canvas.translate(-photoViewer.f33419u5.getX(), -photoViewer.f33419u5.getY());
        }
        photoViewer.U0(canvas, this.f45355h0, -13948117, 855638016, false, true, false);
        float e = this.f42300q0.e(this.f42299p0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.m1(e, -1));
        }
        setTextColor(i0.a.f(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f42298o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
