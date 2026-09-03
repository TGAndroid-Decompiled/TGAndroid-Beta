package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class zt0 extends dg.c3 {
    public final Path f40871l0;
    public boolean m0;
    public final org.telegram.ui.Components.z5 f40872n0;
    public final PhotoViewer f40873o0;

    public zt0(PhotoViewer photoViewer) {
        super(photoViewer.f31781m5, photoViewer.B, photoViewer.f31835s2, photoViewer.Y);
        this.f40873o0 = photoViewer;
        this.f40871l0 = new Path();
        this.f40872n0 = new org.telegram.ui.Components.z5(this, 0L, 420L, org.telegram.ui.Components.mr.h);
    }

    public final void m(boolean z4, boolean z10) {
        this.m0 = z4;
        if (!z10) {
            this.f40872n0.f(z4, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f40871l0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f4434f0, AndroidUtilities.dp(this.f4438j0), AndroidUtilities.dp(this.f4438j0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f40873o0;
        if (this == photoViewer.f31838s5 || this == photoViewer.f31846t5) {
            canvas.translate(-photoViewer.f31828r5.getX(), -photoViewer.f31828r5.getY());
        }
        photoViewer.T0(canvas, this.f4433e0, -13948117, 855638016, false, true, false);
        float e = this.f40872n0.e(this.m0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(e, -1));
        }
        setTextColor(i0.a.d(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f40871l0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
