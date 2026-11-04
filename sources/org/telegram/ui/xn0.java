package org.telegram.ui;

import android.graphics.Canvas;
public final class xn0 implements si.a, eh.b {
    public final org.telegram.ui.Components.ba f52055a;
    public final PhotoViewer f52056b;

    public xn0(PhotoViewer photoViewer) {
        this.f52056b = photoViewer;
        this.f52055a = new org.telegram.ui.Components.ba(photoViewer.f41392c0, photoViewer.f41420f0, 0, false);
    }

    @Override
    public final gh.g b() {
        gh.g gVar = new gh.g(this, this, this);
        this.f52056b.f41372a0.add(gVar);
        return gVar;
    }

    @Override
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.f52056b.U0(canvas, this.f52055a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void d(gh.g gVar) {
    }
}
