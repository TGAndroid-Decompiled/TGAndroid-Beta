package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xy0;
public final class f extends Drawable {
    public final int f53125a;
    public final xy0 f53126b;
    public final h f53127c;

    public f(h hVar, String str, int i7) {
        this.f53125a = i7;
        switch (i7) {
            case 1:
                this.f53127c = hVar;
                this.f53126b = new xy0(str, 14.0f, org.telegram.messenger.g0.o());
                return;
            default:
                this.f53127c = hVar;
                this.f53126b = new xy0(str, 14.0f, org.telegram.messenger.g0.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f53125a) {
            case 0:
                this.f53126b.c(getBounds().centerX() - (this.f53126b.f42254c / 2.0f), getBounds().centerY(), 1.0f, this.f53127c.f53145s, canvas);
                return;
            default:
                this.f53126b.c(getBounds().centerX() - (this.f53126b.f42254c / 2.0f), getBounds().centerY(), 1.0f, this.f53127c.f53145s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f53125a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        int i10 = this.f53125a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f53125a;
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
