package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class xo0 extends org.telegram.ui.Components.s61 {
    public final org.telegram.ui.Components.ga f53918h0;
    public final PhotoViewer f53919i0;

    public xo0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f53919i0 = photoViewer;
        new Path();
        this.f53918h0 = new org.telegram.ui.Components.ga(photoViewer.f43225c0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f53919i0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.N0(canvas, this.f53918h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.cz.f23397c0 && ((i7 = this.f53919i0.f43324n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f53919i0.f43253f0.invalidate();
        }
    }
}
