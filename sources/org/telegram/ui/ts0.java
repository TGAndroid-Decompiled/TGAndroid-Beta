package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class ts0 extends org.telegram.ui.Components.p81 {
    public final org.telegram.ui.Components.oa f41019g0;
    public final PhotoViewer f41020h0;

    public ts0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f41020h0 = photoViewer;
        new Path();
        this.f41019g0 = new org.telegram.ui.Components.oa(photoViewer.f33885b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f41020h0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.T0(canvas, this.f41019g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f41020h0.f33995n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f41020h0.f33914e0.invalidate();
        }
    }
}
