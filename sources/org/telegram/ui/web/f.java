package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nz0;
public final class f extends Drawable {
    public final int f43849a;
    public final nz0 f43850b;
    public final h f43851c;

    public f(h hVar, String str, int i9) {
        this.f43849a = i9;
        switch (i9) {
            case 1:
                this.f43851c = hVar;
                this.f43850b = new nz0(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f43851c = hVar;
                this.f43850b = new nz0(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43849a) {
            case 0:
                this.f43850b.c(getBounds().centerX() - (this.f43850b.f31223c / 2.0f), getBounds().centerY(), 1.0f, this.f43851c.f43872s, canvas);
                return;
            default:
                this.f43850b.c(getBounds().centerX() - (this.f43850b.f31223c / 2.0f), getBounds().centerY(), 1.0f, this.f43851c.f43872s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43849a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        int i10 = this.f43849a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.f43849a;
    }

    private final void a(int i9) {
    }

    private final void b(int i9) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
