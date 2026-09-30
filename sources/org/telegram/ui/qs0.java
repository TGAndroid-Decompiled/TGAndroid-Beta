package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class qs0 extends org.telegram.ui.Components.g81 {
    public final org.telegram.ui.Components.oa f37080g0;
    public final PhotoViewer f37081h0;

    public qs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37081h0 = photoViewer;
        new Path();
        this.f37080g0 = new org.telegram.ui.Components.oa(photoViewer.f31269b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f37081h0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.T0(canvas, this.f37080g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f37081h0.f31378n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f37081h0.f31297e0.invalidate();
        }
    }
}
