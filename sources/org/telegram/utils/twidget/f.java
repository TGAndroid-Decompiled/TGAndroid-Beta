package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Picture;
public final class f extends g {
    public final Picture f52846e;
    public boolean f52847f;

    public f(int i3, int i10, int i11, int i12) {
        super(i3, i10, i11, i12);
        this.f52846e = new Picture();
    }

    @Override
    public final Canvas a() {
        this.f52847f = true;
        return this.f52846e.beginRecording(Math.max(1, this.f52856c - this.f52854a), Math.max(1, this.d - this.f52855b));
    }

    @Override
    public final boolean b(Canvas canvas) {
        return true;
    }

    @Override
    public final void c() {
        if (this.f52847f) {
            e();
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        Canvas canvas2;
        int save;
        if (!this.f52847f && f10 > 0.0f) {
            int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            int i10 = this.f52855b;
            int i11 = this.f52854a;
            if (i3 < 0) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(i11, i10, this.f52856c, this.d, Math.round(f10 * 255.0f));
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(i11, i10);
            canvas2.drawPicture(this.f52846e);
            canvas2.restoreToCount(save);
        }
    }

    @Override
    public final void e() {
        this.f52846e.endRecording();
        this.f52847f = false;
    }

    @Override
    public final boolean f() {
        return true;
    }
}
