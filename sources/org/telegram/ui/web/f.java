package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l11;
public final class f extends Drawable {
    public final int f43297a;
    public final l11 f43298b;
    public final h f43299c;

    public f(h hVar, String str, int i10) {
        this.f43297a = i10;
        switch (i10) {
            case 1:
                this.f43299c = hVar;
                this.f43298b = new l11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f43299c = hVar;
                this.f43298b = new l11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43297a) {
            case 0:
                this.f43298b.c(getBounds().centerX() - (this.f43298b.f28222c / 2.0f), getBounds().centerY(), 1.0f, this.f43299c.f43328s, canvas);
                return;
            default:
                this.f43298b.c(getBounds().centerX() - (this.f43298b.f28222c / 2.0f), getBounds().centerY(), 1.0f, this.f43299c.f43328s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43297a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f43297a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f43297a;
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
