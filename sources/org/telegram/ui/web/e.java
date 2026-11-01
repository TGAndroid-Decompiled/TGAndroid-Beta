package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.rz0;
public final class e extends Drawable {
    public final int f42822a;
    public final rz0 f42823b;
    public final g f42824c;

    public e(g gVar, String str, int i10) {
        this.f42822a = i10;
        switch (i10) {
            case 1:
                this.f42824c = gVar;
                this.f42823b = new rz0(str, 14.0f, org.telegram.messenger.i0.o());
                return;
            default:
                this.f42824c = gVar;
                this.f42823b = new rz0(str, 14.0f, org.telegram.messenger.i0.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42822a) {
            case 0:
                this.f42823b.c(getBounds().centerX() - (this.f42823b.f30126c / 2.0f), getBounds().centerY(), 1.0f, this.f42824c.f42841s, canvas);
                return;
            default:
                this.f42823b.c(getBounds().centerX() - (this.f42823b.f30126c / 2.0f), getBounds().centerY(), 1.0f, this.f42824c.f42841s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42822a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42822a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42822a;
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
