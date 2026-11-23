package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class wo0 extends org.telegram.ui.Components.t61 {
    public final org.telegram.ui.Components.fa f53714h0;
    public final PhotoViewer f53715i0;

    public wo0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f53715i0 = photoViewer;
        new Path();
        this.f53714h0 = new org.telegram.ui.Components.fa(photoViewer.f43303c0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f53715i0;
        canvas.translate((-getX()) - photoViewer.X7.getX(), (-getY()) - photoViewer.X7.getY());
        photoViewer.N0(canvas, this.f53714h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.bz.f23277c0 && ((i7 = this.f53715i0.f43405n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f53715i0.f43334f0.invalidate();
        }
    }
}
