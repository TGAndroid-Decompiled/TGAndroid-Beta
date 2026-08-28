package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class vr0 extends org.telegram.ui.Components.v61 {
    public final org.telegram.ui.Components.fa f43575c0;
    public final PhotoViewer f43576d0;

    public vr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f43576d0 = photoViewer;
        new Path();
        this.f43575c0 = new org.telegram.ui.Components.fa(photoViewer.X, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f43576d0;
        canvas.translate((-getX()) - photoViewer.M7.getX(), (-getY()) - photoViewer.M7.getY());
        photoViewer.T0(canvas, this.f43575c0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i9;
        if (SharedConfig.photoViewerBlur && ((i9 = this.f43576d0.f35667j4) == 1 || i9 == 2 || i9 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f43576d0.f35580a0.invalidate();
        }
    }
}
