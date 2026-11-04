package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.RenderNode;
public final class e extends g {
    public final RenderNode f52842e;

    public e(String str, int i3, int i10, int i11, int i12) {
        super(i3, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.f52842e = renderNode;
        renderNode.setPosition(i3, i10, i11, i12);
    }

    @Override
    public final Canvas a() {
        return this.f52842e.beginRecording(this.f52856c - this.f52854a, this.d - this.f52855b);
    }

    @Override
    public final boolean b(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @Override
    public final void c() {
        this.f52842e.discardDisplayList();
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        if (!this.f52842e.hasDisplayList()) {
            return;
        }
        this.f52842e.setAlpha(f10);
        canvas.drawRenderNode(this.f52842e);
    }

    @Override
    public final void e() {
        this.f52842e.endRecording();
    }

    @Override
    public final boolean f() {
        return this.f52842e.hasDisplayList();
    }

    @Override
    public final void g() {
        this.f52842e.setUseCompositingLayer(true, null);
    }
}
