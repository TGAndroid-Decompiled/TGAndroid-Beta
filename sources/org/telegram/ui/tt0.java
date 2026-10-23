package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 extends rg.d2 {
    public final Path f41752o0;
    public boolean f41753p0;
    public final org.telegram.ui.Components.f6 f41754q0;
    public final PhotoViewer f41755r0;

    public tt0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33435v2, photoViewer.f33255b0);
        this.f41755r0 = photoViewer;
        this.f41752o0 = new Path();
        this.f41754q0 = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f41753p0 = z10;
        if (!z11) {
            this.f41754q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f41752o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45329i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f41755r0;
        if (this == photoViewer.f33438v5 || this == photoViewer.f33448w5) {
            canvas.translate(-photoViewer.f33429u5.getX(), -photoViewer.f33429u5.getY());
        }
        photoViewer.V0(canvas, this.f45328h0, -13948117, 855638016, false, true, false);
        float e = this.f41754q0.e(this.f41753p0);
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
        canvas.clipPath(this.f41752o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
