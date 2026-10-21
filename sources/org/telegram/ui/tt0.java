package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 extends rg.d2 {
    public final Path f41748o0;
    public boolean f41749p0;
    public final org.telegram.ui.Components.f6 f41750q0;
    public final PhotoViewer f41751r0;

    public tt0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33431v2, photoViewer.f33251b0);
        this.f41751r0 = photoViewer;
        this.f41748o0 = new Path();
        this.f41750q0 = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f41749p0 = z10;
        if (!z11) {
            this.f41750q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f41748o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45325i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f41751r0;
        if (this == photoViewer.f33434v5 || this == photoViewer.f33444w5) {
            canvas.translate(-photoViewer.f33425u5.getX(), -photoViewer.f33425u5.getY());
        }
        photoViewer.V0(canvas, this.f45324h0, -13948117, 855638016, false, true, false);
        float e = this.f41750q0.e(this.f41749p0);
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
        canvas.clipPath(this.f41748o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
