package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class xs0 extends org.telegram.ui.Components.e81 {
    public final org.telegram.ui.Components.ma f38808g0;
    public final PhotoViewer f38809h0;

    public xs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f38809h0 = photoViewer;
        new Path();
        this.f38808g0 = new org.telegram.ui.Components.ma(photoViewer.f30021b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f38809h0;
        canvas.translate((-getX()) - photoViewer.Q7.getX(), (-getY()) - photoViewer.Q7.getY());
        photoViewer.T0(canvas, this.f38808g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f38809h0.f30130n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f38809h0.f30049e0.invalidate();
        }
    }
}
