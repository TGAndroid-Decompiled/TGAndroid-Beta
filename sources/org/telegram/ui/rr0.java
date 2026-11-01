package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
public final class rr0 extends jg.j2 {
    public final Path f41142r0;
    public boolean f41143s0;
    public final org.telegram.ui.Components.t5 f41144t0;
    public final PhotoViewer f41145u0;

    public rr0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33629v2, photoViewer.f33449b0);
        this.f41145u0 = photoViewer;
        this.f41142r0 = new Path();
        this.f41144t0 = new org.telegram.ui.Components.t5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f41143s0 = z10;
        if (!z11) {
            this.f41144t0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f41142r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f10067l0, org.telegram.messenger.i0.L(this.f10070p0), org.telegram.messenger.i0.L(this.f10070p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f41145u0;
        if (this == photoViewer.f33632v5 || this == photoViewer.f33642w5) {
            canvas.translate(-photoViewer.f33623u5.getX(), -photoViewer.f33623u5.getY());
        }
        photoViewer.U0(canvas, this.f10066k0, -13948117, 855638016, false, true, false);
        float d = this.f41144t0.d(this.f41143s0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.t6.r1(d, -1));
        }
        setTextColor(i0.b.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f41142r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
