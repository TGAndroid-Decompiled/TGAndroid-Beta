package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oy0;
public final class f extends Drawable {
    public final int f52602a;
    public final oy0 f52603b;
    public final h f52604c;

    public f(h hVar, String str, int i7) {
        this.f52602a = i7;
        switch (i7) {
            case 1:
                this.f52604c = hVar;
                this.f52603b = new oy0(str, 14.0f, org.telegram.messenger.g0.o());
                return;
            default:
                this.f52604c = hVar;
                this.f52603b = new oy0(str, 14.0f, org.telegram.messenger.g0.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f52602a) {
            case 0:
                this.f52603b.c(getBounds().centerX() - (this.f52603b.f38103c / 2.0f), getBounds().centerY(), 1.0f, this.f52604c.f52622s, canvas);
                return;
            default:
                this.f52603b.c(getBounds().centerX() - (this.f52603b.f38103c / 2.0f), getBounds().centerY(), 1.0f, this.f52604c.f52622s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f52602a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        int i10 = this.f52602a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f52602a;
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
