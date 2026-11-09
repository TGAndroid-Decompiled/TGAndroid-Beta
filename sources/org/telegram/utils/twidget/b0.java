package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Picture;
public final class b0 extends c0 {
    public final Picture f52768e;
    public boolean f52769f;

    public b0(int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        this.f52768e = new Picture();
    }

    @Override
    public final Canvas a() {
        this.f52769f = true;
        return this.f52768e.beginRecording(Math.max(1, this.f52775c - this.f52773a), Math.max(1, this.d - this.f52774b));
    }

    @Override
    public final void b() {
        if (this.f52769f) {
            d();
        }
    }

    @Override
    public final void c(Canvas canvas, float f10) {
        Canvas canvas2;
        int save;
        if (!this.f52769f && f10 > 0.0f) {
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            int i10 = this.f52774b;
            int i11 = this.f52773a;
            if (i7 < 0) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(i11, i10, this.f52775c, this.d, Math.round(f10 * 255.0f));
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(i11, i10);
            canvas2.drawPicture(this.f52768e);
            canvas2.restoreToCount(save);
        }
    }

    @Override
    public final void d() {
        this.f52768e.endRecording();
        this.f52769f = false;
    }

    @Override
    public final boolean e() {
        return true;
    }
}
