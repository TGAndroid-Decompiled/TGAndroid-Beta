package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
public final class sr0 extends jg.j2 {
    public final Path f41637r0;
    public boolean f41638s0;
    public final org.telegram.ui.Components.t5 f41639t0;
    public final PhotoViewer f41640u0;

    public sr0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33622v2, photoViewer.f33442b0);
        this.f41640u0 = photoViewer;
        this.f41637r0 = new Path();
        this.f41639t0 = new org.telegram.ui.Components.t5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f41638s0 = z10;
        if (!z11) {
            this.f41639t0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f41637r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f10066l0, org.telegram.messenger.i0.L(this.f10069p0), org.telegram.messenger.i0.L(this.f10069p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f41640u0;
        if (this == photoViewer.f33625v5 || this == photoViewer.f33635w5) {
            canvas.translate(-photoViewer.f33616u5.getX(), -photoViewer.f33616u5.getY());
        }
        photoViewer.U0(canvas, this.f10065k0, -13948117, 855638016, false, true, false);
        float d = this.f41639t0.d(this.f41638s0);
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
        canvas.clipPath(this.f41637r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
