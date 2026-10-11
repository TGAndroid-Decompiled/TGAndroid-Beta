package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class xs0 extends org.telegram.ui.Components.x81 {
    public final org.telegram.ui.Components.pa f44212g0;
    public final PhotoViewer f44213h0;

    public xs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f44213h0 = photoViewer;
        new Path();
        this.f44212g0 = new org.telegram.ui.Components.pa(photoViewer.f33937b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f44213h0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.T0(canvas, this.f44212g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f44213h0.f34047n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f44213h0.f33966e0.invalidate();
        }
    }
}
