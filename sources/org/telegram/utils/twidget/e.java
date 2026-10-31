package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.RenderNode;
public final class e extends g {
    public final RenderNode e;

    public e(String str, int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i10, i11, i12, i13);
    }

    @Override
    public final Canvas a() {
        return this.e.beginRecording(this.f44343c - this.f44341a, this.d - this.f44342b);
    }

    @Override
    public final boolean b(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @Override
    public final void c() {
        this.e.discardDisplayList();
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        if (!this.e.hasDisplayList()) {
            return;
        }
        this.e.setAlpha(f7);
        canvas.drawRenderNode(this.e);
    }

    @Override
    public final void e() {
        this.e.endRecording();
    }

    @Override
    public final boolean f() {
        return this.e.hasDisplayList();
    }

    @Override
    public final void g() {
        this.e.setUseCompositingLayer(true, null);
    }
}
