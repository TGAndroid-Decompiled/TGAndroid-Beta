package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RenderNode;
public final class b0 extends d0 {
    public final RenderNode f54721e;
    public Bitmap f54722f;
    public Paint f54723g;
    public Rect h;

    public b0(String str, int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.f54721e = renderNode;
        renderNode.setPosition(i7, i10, i11, i12);
    }

    @Override
    public final Canvas a() {
        return this.f54721e.beginRecording(this.f54731c - this.f54729a, this.d - this.f54730b);
    }

    @Override
    public final void b() {
        this.f54721e.discardDisplayList();
    }

    @Override
    public final void c(android.graphics.Canvas r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.b0.c(android.graphics.Canvas, float):void");
    }

    @Override
    public final void d() {
        this.f54721e.endRecording();
    }

    @Override
    public final boolean e() {
        return this.f54721e.hasDisplayList();
    }

    @Override
    public final void f() {
        boolean z10;
        long j3 = this.f54731c - this.f54729a;
        long j10 = this.d - this.f54730b;
        if (j3 > 0 && j10 > 0 && j3 <= 4096 && j10 <= 4096 && j3 * j10 <= 8388608) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f54721e.setUseCompositingLayer(z10, null);
    }
}
