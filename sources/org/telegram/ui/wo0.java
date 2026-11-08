package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class wo0 extends org.telegram.ui.Components.d61 {
    public final org.telegram.ui.Components.ca f51473g0;
    public final PhotoViewer f51474h0;

    public wo0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f51474h0 = photoViewer;
        new Path();
        this.f51473g0 = new org.telegram.ui.Components.ca(photoViewer.f41356b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f51474h0;
        canvas.translate((-getX()) - photoViewer.Q7.getX(), (-getY()) - photoViewer.Q7.getY());
        photoViewer.N0(canvas, this.f51473g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.iz.f23392c0 && ((i7 = this.f51474h0.f41456m4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f51474h0.f41384e0.invalidate();
        }
    }
}
