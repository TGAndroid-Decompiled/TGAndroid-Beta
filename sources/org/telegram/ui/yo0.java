package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class yo0 extends org.telegram.ui.Components.s61 {
    public final org.telegram.ui.Components.ga f54217h0;
    public final PhotoViewer f54218i0;

    public yo0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f54218i0 = photoViewer;
        new Path();
        this.f54217h0 = new org.telegram.ui.Components.ga(photoViewer.f43190c0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f54218i0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.N0(canvas, this.f54217h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.cz.f23361c0 && ((i7 = this.f54218i0.f43289n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f54218i0.f43218f0.invalidate();
        }
    }
}
