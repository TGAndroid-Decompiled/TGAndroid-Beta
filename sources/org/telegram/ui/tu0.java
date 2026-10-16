package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class tu0 extends rg.e2 {
    public final Path f40212o0;
    public boolean f40213p0;
    public final org.telegram.ui.Components.g6 f40214q0;
    public final PhotoViewer f40215r0;

    public tu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f32080v2, photoViewer.f31900b0);
        this.f40215r0 = photoViewer;
        this.f40212o0 = new Path();
        this.f40214q0 = new org.telegram.ui.Components.g6(this, 0L, 420L, org.telegram.ui.Components.es.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f40213p0 = z10;
        if (!z11) {
            this.f40214q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f40212o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f44004i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f40215r0;
        if (this == photoViewer.f32083v5 || this == photoViewer.f32093w5) {
            canvas.translate(-photoViewer.f32074u5.getX(), -photoViewer.f32074u5.getY());
        }
        photoViewer.T0(canvas, this.f44003h0, -13948117, 855638016, false, true, false);
        float e = this.f40214q0.e(this.f40213p0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.m1(e, -1));
        }
        setTextColor(i0.a.d(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f40212o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
