package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g01;
public final class f extends Drawable {
    public final int f38939a;
    public final g01 f38940b;
    public final h f38941c;

    public f(h hVar, String str, int i10) {
        this.f38939a = i10;
        switch (i10) {
            case 1:
                this.f38941c = hVar;
                this.f38940b = new g01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f38941c = hVar;
                this.f38940b = new g01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38939a) {
            case 0:
                this.f38940b.c(getBounds().centerX() - (this.f38940b.f24149c / 2.0f), getBounds().centerY(), 1.0f, this.f38941c.f38965s, canvas);
                return;
            default:
                this.f38940b.c(getBounds().centerX() - (this.f38940b.f24149c / 2.0f), getBounds().centerY(), 1.0f, this.f38941c.f38965s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f38939a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f38939a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f38939a;
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
