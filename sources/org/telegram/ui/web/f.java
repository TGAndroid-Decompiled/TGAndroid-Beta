package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class f extends Drawable {
    public final int f39491a;
    public final k01 f39492b;
    public final h f39493c;

    public f(h hVar, String str, int i10) {
        this.f39491a = i10;
        switch (i10) {
            case 1:
                this.f39493c = hVar;
                this.f39492b = new k01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f39493c = hVar;
                this.f39492b = new k01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f39491a) {
            case 0:
                this.f39492b.c(getBounds().centerX() - (this.f39492b.f26084c / 2.0f), getBounds().centerY(), 1.0f, this.f39493c.f39518s, canvas);
                return;
            default:
                this.f39492b.c(getBounds().centerX() - (this.f39492b.f26084c / 2.0f), getBounds().centerY(), 1.0f, this.f39493c.f39518s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f39491a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f39491a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f39491a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
