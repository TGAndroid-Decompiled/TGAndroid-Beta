package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h01;
public final class f extends Drawable {
    public final int f38787a;
    public final h01 f38788b;
    public final h f38789c;

    public f(h hVar, String str, int i10) {
        this.f38787a = i10;
        switch (i10) {
            case 1:
                this.f38789c = hVar;
                this.f38788b = new h01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f38789c = hVar;
                this.f38788b = new h01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38787a) {
            case 0:
                this.f38788b.c(getBounds().centerX() - (this.f38788b.f24442c / 2.0f), getBounds().centerY(), 1.0f, this.f38789c.f38813s, canvas);
                return;
            default:
                this.f38788b.c(getBounds().centerX() - (this.f38788b.f24442c / 2.0f), getBounds().centerY(), 1.0f, this.f38789c.f38813s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f38787a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f38787a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f38787a;
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
