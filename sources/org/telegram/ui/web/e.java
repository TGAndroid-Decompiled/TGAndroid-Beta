package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qz0;
public final class e extends Drawable {
    public final int f43020a;
    public final qz0 f43021b;
    public final g f43022c;

    public e(g gVar, String str, int i10) {
        this.f43020a = i10;
        switch (i10) {
            case 1:
                this.f43022c = gVar;
                this.f43021b = new qz0(str, 14.0f, org.telegram.messenger.i0.o());
                return;
            default:
                this.f43022c = gVar;
                this.f43021b = new qz0(str, 14.0f, org.telegram.messenger.i0.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43020a) {
            case 0:
                this.f43021b.c(getBounds().centerX() - (this.f43021b.f29774c / 2.0f), getBounds().centerY(), 1.0f, this.f43022c.f43039s, canvas);
                return;
            default:
                this.f43021b.c(getBounds().centerX() - (this.f43021b.f29774c / 2.0f), getBounds().centerY(), 1.0f, this.f43022c.f43039s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43020a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f43020a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f43020a;
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
