package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class vt0 extends rg.c2 {
    public final Path f42271o0;
    public boolean f42272p0;
    public final org.telegram.ui.Components.f6 f42273q0;
    public final PhotoViewer f42274r0;

    public vt0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33418v2, photoViewer.f33238b0);
        this.f42274r0 = photoViewer;
        this.f42271o0 = new Path();
        this.f42273q0 = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f42272p0 = z10;
        if (!z11) {
            this.f42273q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f42271o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45310i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f42274r0;
        if (this == photoViewer.f33421v5 || this == photoViewer.f33431w5) {
            canvas.translate(-photoViewer.f33412u5.getX(), -photoViewer.f33412u5.getY());
        }
        photoViewer.U0(canvas, this.f45309h0, -13948117, 855638016, false, true, false);
        float e = this.f42273q0.e(this.f42272p0);
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
        canvas.clipPath(this.f42271o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
