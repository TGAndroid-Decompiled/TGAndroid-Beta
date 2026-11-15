package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Picture;
public final class b0 extends c0 {
    public final Picture f54166e;
    public boolean f54167f;

    public b0(int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        this.f54166e = new Picture();
    }

    @Override
    public final Canvas a() {
        this.f54167f = true;
        return this.f54166e.beginRecording(Math.max(1, this.f54171c - this.f54169a), Math.max(1, this.d - this.f54170b));
    }

    @Override
    public final void b() {
        if (this.f54167f) {
            d();
        }
    }

    @Override
    public final void c(Canvas canvas, float f10) {
        Canvas canvas2;
        int save;
        if (!this.f54167f && f10 > 0.0f) {
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            int i10 = this.f54170b;
            int i11 = this.f54169a;
            if (i7 < 0) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(i11, i10, this.f54171c, this.d, Math.round(f10 * 255.0f));
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(i11, i10);
            canvas2.drawPicture(this.f54166e);
            canvas2.restoreToCount(save);
        }
    }

    @Override
    public final void d() {
        this.f54166e.endRecording();
        this.f54167f = false;
    }

    @Override
    public final boolean e() {
        return true;
    }
}
