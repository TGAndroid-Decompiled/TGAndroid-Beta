package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.RenderNode;
public final class e extends g {
    public final RenderNode f52775e;

    public e(String str, int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.f52775e = renderNode;
        renderNode.setPosition(i7, i10, i11, i12);
    }

    @Override
    public final Canvas a() {
        return this.f52775e.beginRecording(this.f52789c - this.f52787a, this.d - this.f52788b);
    }

    @Override
    public final boolean b(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @Override
    public final void c() {
        this.f52775e.discardDisplayList();
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        if (!this.f52775e.hasDisplayList()) {
            return;
        }
        this.f52775e.setAlpha(f10);
        canvas.drawRenderNode(this.f52775e);
    }

    @Override
    public final void e() {
        this.f52775e.endRecording();
    }

    @Override
    public final boolean f() {
        return this.f52775e.hasDisplayList();
    }

    @Override
    public final void g() {
        this.f52775e.setUseCompositingLayer(true, null);
    }
}
