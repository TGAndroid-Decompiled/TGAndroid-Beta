package org.telegram.ui;

import android.graphics.Canvas;
public final class qp0 implements hi.a, tg.a {
    public final org.telegram.ui.Components.w9 f41030a;
    public final PhotoViewer f41031b;

    public qp0(PhotoViewer photoViewer) {
        this.f41031b = photoViewer;
        this.f41030a = new org.telegram.ui.Components.w9(photoViewer.f33442b0, photoViewer.f33470e0, 0, false);
    }

    @Override
    public final vg.f a() {
        vg.f fVar = new vg.f(this);
        this.f41031b.Z.add(fVar);
        return fVar;
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        this.f41031b.U0(canvas, this.f41030a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }
}
