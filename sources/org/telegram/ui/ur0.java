package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class ur0 extends org.telegram.ui.Components.h71 {
    public final org.telegram.ui.Components.ka f43327c0;
    public final PhotoViewer f43328d0;

    public ur0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f43328d0 = photoViewer;
        new Path();
        this.f43327c0 = new org.telegram.ui.Components.ka(photoViewer.X, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f43328d0;
        canvas.translate((-getX()) - photoViewer.M7.getX(), (-getY()) - photoViewer.M7.getY());
        photoViewer.T0(canvas, this.f43327c0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f43328d0.f35733j4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            super.setTranslationY(f9);
            this.f43328d0.f35647a0.invalidate();
        }
    }
}
