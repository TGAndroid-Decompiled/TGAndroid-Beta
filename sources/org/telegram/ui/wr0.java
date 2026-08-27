package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;

public final class wr0 extends org.telegram.ui.Components.x61 {

    public final org.telegram.ui.Components.da f44182c0;

    public final PhotoViewer f44183d0;

    public wr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f44183d0 = photoViewer;
        new Path();
        this.f44182c0 = new org.telegram.ui.Components.da(photoViewer.X, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f10 = -getX();
        PhotoViewer photoViewer = this.f44183d0;
        canvas.translate(f10 - photoViewer.M7.getX(), (-getY()) - photoViewer.M7.getY());
        photoViewer.T0(canvas, this.f44182c0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f44183d0.f35670j4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f44183d0.f35583a0.invalidate();
        }
    }
}
