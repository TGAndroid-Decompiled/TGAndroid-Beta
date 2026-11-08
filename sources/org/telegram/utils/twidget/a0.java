package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderNode;
public final class a0 extends c0 {
    public final RenderNode f52750e;
    public Bitmap f52751f;
    public Paint f52752g;

    public a0(String str, int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.f52750e = renderNode;
        renderNode.setPosition(i7, i10, i11, i12);
    }

    @Override
    public final Canvas a() {
        return this.f52750e.beginRecording(this.f52761c - this.f52759a, this.d - this.f52760b);
    }

    @Override
    public final void b() {
        this.f52750e.discardDisplayList();
    }

    @Override
    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.a0.c(android.graphics.Canvas, float):void");
    }

    @Override
    public final void d() {
        this.f52750e.endRecording();
    }

    @Override
    public final boolean e() {
        return this.f52750e.hasDisplayList();
    }

    @Override
    public final void f() {
        this.f52750e.setUseCompositingLayer(true, null);
    }
}
