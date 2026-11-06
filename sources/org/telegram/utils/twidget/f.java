package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Picture;
public final class f extends g {
    public final Picture f52755e;
    public boolean f52756f;

    public f(int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        this.f52755e = new Picture();
    }

    @Override
    public final Canvas a() {
        this.f52756f = true;
        return this.f52755e.beginRecording(Math.max(1, this.f52765c - this.f52763a), Math.max(1, this.d - this.f52764b));
    }

    @Override
    public final boolean b(Canvas canvas) {
        return true;
    }

    @Override
    public final void c() {
        if (this.f52756f) {
            e();
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        Canvas canvas2;
        int save;
        if (!this.f52756f && f10 > 0.0f) {
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            int i10 = this.f52764b;
            int i11 = this.f52763a;
            if (i7 < 0) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(i11, i10, this.f52765c, this.d, Math.round(f10 * 255.0f));
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(i11, i10);
            canvas2.drawPicture(this.f52755e);
            canvas2.restoreToCount(save);
        }
    }

    @Override
    public final void e() {
        this.f52755e.endRecording();
        this.f52756f = false;
    }

    @Override
    public final boolean f() {
        return true;
    }
}
