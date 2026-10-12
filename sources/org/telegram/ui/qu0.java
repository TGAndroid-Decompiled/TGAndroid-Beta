package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class qu0 extends qg.d2 {
    public final Path f41434o0;
    public boolean f41435p0;
    public final org.telegram.ui.Components.g6 f41436q0;
    public final PhotoViewer f41437r0;

    public qu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33892v2, photoViewer.f33712b0);
        this.f41437r0 = photoViewer;
        this.f41434o0 = new Path();
        this.f41436q0 = new org.telegram.ui.Components.g6(this, 0L, 420L, org.telegram.ui.Components.js.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f41435p0 = z10;
        if (!z11) {
            this.f41436q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f41434o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f46158i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f41437r0;
        if (this == photoViewer.f33895v5 || this == photoViewer.f33905w5) {
            canvas.translate(-photoViewer.f33886u5.getX(), -photoViewer.f33886u5.getY());
        }
        photoViewer.T0(canvas, this.f46157h0, -13948117, 855638016, false, true, false);
        float e7 = this.f41436q0.e(this.f41435p0);
        if (e7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.m1(e7, -1));
        }
        setTextColor(i0.a.d(e7, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f41434o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
