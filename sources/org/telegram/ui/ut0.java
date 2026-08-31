package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class ut0 extends eg.a3 {
    public final Path f42034l0;
    public boolean m0;
    public final org.telegram.ui.Components.z5 f42035n0;
    public final PhotoViewer f42036o0;

    public ut0(PhotoViewer photoViewer) {
        super(photoViewer.f34333m5, photoViewer.B, photoViewer.f34387s2, photoViewer.Y);
        this.f42036o0 = photoViewer;
        this.f42034l0 = new Path();
        this.f42035n0 = new org.telegram.ui.Components.z5(this, 0L, 420L, org.telegram.ui.Components.pr.h);
    }

    public final void m(boolean z4, boolean z10) {
        this.m0 = z4;
        if (!z10) {
            this.f42035n0.f(z4, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f42034l0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f5066f0, AndroidUtilities.dp(this.f5070j0), AndroidUtilities.dp(this.f5070j0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f42036o0;
        if (this == photoViewer.f34390s5 || this == photoViewer.f34398t5) {
            canvas.translate(-photoViewer.f34380r5.getX(), -photoViewer.f34380r5.getY());
        }
        photoViewer.T0(canvas, this.f5065e0, -13948117, 855638016, false, true, false);
        float e6 = this.f42035n0.e(this.m0);
        if (e6 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.l1(e6, -1));
        }
        setTextColor(i0.a.d(e6, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f42034l0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
