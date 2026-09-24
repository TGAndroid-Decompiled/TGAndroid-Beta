package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class qs0 extends org.telegram.ui.Components.e81 {
    public final org.telegram.ui.Components.na f36967g0;
    public final PhotoViewer f36968h0;

    public qs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36968h0 = photoViewer;
        new Path();
        this.f36967g0 = new org.telegram.ui.Components.na(photoViewer.f31181b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f36968h0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.T0(canvas, this.f36967g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f36968h0.f31290n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f36968h0.f31209e0.invalidate();
        }
    }
}
