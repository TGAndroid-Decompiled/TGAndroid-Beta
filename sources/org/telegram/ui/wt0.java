package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class wt0 extends rg.e2 {
    public final Path f43436r0;
    public boolean f43437s0;
    public final org.telegram.ui.Components.f6 f43438t0;
    public final PhotoViewer f43439u0;

    public wt0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33732v2, photoViewer.f33552b0);
        this.f43439u0 = photoViewer;
        this.f43436r0 = new Path();
        this.f43438t0 = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f43437s0 = z10;
        if (!z11) {
            this.f43438t0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f43436r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45758l0, AndroidUtilities.dp(this.f45761p0), AndroidUtilities.dp(this.f45761p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f43439u0;
        if (this == photoViewer.f33735v5 || this == photoViewer.f33745w5) {
            canvas.translate(-photoViewer.f33726u5.getX(), -photoViewer.f33726u5.getY());
        }
        photoViewer.V0(canvas, this.f45757k0, -13948117, 855638016, false, true, false);
        float e = this.f43438t0.e(this.f43437s0);
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
        canvas.clipPath(this.f43436r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
