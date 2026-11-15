package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderNode;
public final class a0 extends c0 {
    public final RenderNode f54156e;
    public Bitmap f54157f;
    public Paint f54158g;

    public a0(String str, int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.f54156e = renderNode;
        renderNode.setPosition(i7, i10, i11, i12);
    }

    @Override
    public final Canvas a() {
        return this.f54156e.beginRecording(this.f54171c - this.f54169a, this.d - this.f54170b);
    }

    @Override
    public final void b() {
        this.f54156e.discardDisplayList();
    }

    @Override
    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.a0.c(android.graphics.Canvas, float):void");
    }

    @Override
    public final void d() {
        this.f54156e.endRecording();
    }

    @Override
    public final boolean e() {
        return this.f54156e.hasDisplayList();
    }

    @Override
    public final void f() {
        this.f54156e.setUseCompositingLayer(true, null);
    }
}
