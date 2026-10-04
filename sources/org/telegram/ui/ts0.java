package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class ts0 extends org.telegram.ui.Components.o81 {
    public final org.telegram.ui.Components.oa f40963g0;
    public final PhotoViewer f40964h0;

    public ts0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40964h0 = photoViewer;
        new Path();
        this.f40963g0 = new org.telegram.ui.Components.oa(photoViewer.f33872b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f40964h0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.T0(canvas, this.f40963g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f40964h0.f33982n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f40964h0.f33901e0.invalidate();
        }
    }
}
