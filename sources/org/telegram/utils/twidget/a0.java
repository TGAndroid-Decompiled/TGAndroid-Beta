package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderNode;
public final class a0 extends c0 {
    public final RenderNode f52763e;
    public Bitmap f52764f;
    public Paint f52765g;

    public a0(String str, int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.f52763e = renderNode;
        renderNode.setPosition(i7, i10, i11, i12);
    }

    @Override
    public final Canvas a() {
        return this.f52763e.beginRecording(this.f52774c - this.f52772a, this.d - this.f52773b);
    }

    @Override
    public final void b() {
        this.f52763e.discardDisplayList();
    }

    @Override
    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.a0.c(android.graphics.Canvas, float):void");
    }

    @Override
    public final void d() {
        this.f52763e.endRecording();
    }

    @Override
    public final boolean e() {
        return this.f52763e.hasDisplayList();
    }

    @Override
    public final void f() {
        this.f52763e.setUseCompositingLayer(true, null);
    }
}
