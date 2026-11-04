package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
public final class yp0 extends ug.s1 {
    public final Path f52377s0;
    public boolean f52378t0;
    public final org.telegram.ui.Components.u5 f52379u0;
    public final PhotoViewer f52380v0;

    public yp0(PhotoViewer photoViewer) {
        super(photoViewer.f41518q5, photoViewer.F, photoViewer.f41570w2, photoViewer.f41392c0);
        this.f52380v0 = photoViewer;
        this.f52377s0 = new Path();
        this.f52379u0 = new org.telegram.ui.Components.u5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f52378t0 = z10;
        if (!z11) {
            this.f52379u0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f52377s0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.m0, org.telegram.messenger.g0.L(this.f56257q0), org.telegram.messenger.g0.L(this.f56257q0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f52380v0;
        if (this == photoViewer.f41573w5 || this == photoViewer.f41583x5) {
            canvas.translate(-photoViewer.f41563v5.getX(), -photoViewer.f41563v5.getY());
        }
        photoViewer.U0(canvas, this.f56253l0, -13948117, 855638016, false, true, false);
        float d = this.f52379u0.d(this.f52378t0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f52377s0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
