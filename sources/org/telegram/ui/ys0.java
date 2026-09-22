package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class ys0 extends org.telegram.ui.Components.r71 {
    public final org.telegram.ui.Components.la f39955g0;
    public final PhotoViewer f39956h0;

    public ys0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39956h0 = photoViewer;
        new Path();
        this.f39955g0 = new org.telegram.ui.Components.la(photoViewer.f30906b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f39956h0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.T0(canvas, this.f39955g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f39956h0.f31015n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f39956h0.f30934e0.invalidate();
        }
    }
}
