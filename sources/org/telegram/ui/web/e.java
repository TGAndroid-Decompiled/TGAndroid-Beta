package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.my0;
public final class e extends Drawable {
    public final int f51055a;
    public final my0 f51056b;
    public final g f51057c;

    public e(g gVar, String str, int i7) {
        this.f51055a = i7;
        switch (i7) {
            case 1:
                this.f51057c = gVar;
                this.f51056b = new my0(str, 14.0f, org.telegram.messenger.g0.o());
                return;
            default:
                this.f51057c = gVar;
                this.f51056b = new my0(str, 14.0f, org.telegram.messenger.g0.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f51055a) {
            case 0:
                this.f51056b.c(getBounds().centerX() - (this.f51056b.f36133c / 2.0f), getBounds().centerY(), 1.0f, this.f51057c.f51074s, canvas);
                return;
            default:
                this.f51056b.c(getBounds().centerX() - (this.f51056b.f36133c / 2.0f), getBounds().centerY(), 1.0f, this.f51057c.f51074s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f51055a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        int i10 = this.f51055a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f51055a;
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
