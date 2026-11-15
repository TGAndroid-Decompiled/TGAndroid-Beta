package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class uo0 extends org.telegram.ui.Components.e61 {
    public final org.telegram.ui.Components.y9 f51987h0;
    public final PhotoViewer f51988i0;

    public uo0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f51988i0 = photoViewer;
        new Path();
        this.f51987h0 = new org.telegram.ui.Components.y9(photoViewer.f42735c0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f51988i0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.N0(canvas, this.f51987h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.gz.f23939c0 && ((i7 = this.f51988i0.f42834n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f51988i0.f42763f0.invalidate();
        }
    }
}
